package org.nightlabs.jjqb.core.licence;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.licence.ws.Passport;
import org.nightlabs.jjqb.core.licence.ws.PassportSoap;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfo;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfoIO;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicenceManager
{
	private static final Logger logger = LoggerFactory.getLogger(LicenceManager.class);

	public static final String PREFERENCES_KEY_EMAIL = "licence.email";
	public static final String PREFERENCES_KEY_LICENCE_KEY = "licence.licenceKey";
	public static final String PREFERENCES_KEY_LAST_CHECK_TIMESTAMP = "licence.lastCheck.timestamp";
	public static final String PREFERENCES_KEY_LAST_CHECK_RESULT = "licence.lastCheck.result";
	public static final String PREFERENCES_KEY_ACTIVATED = "licence.activated";

	private IEclipsePreferences preferencesRootNode;
	private Preferences preferences;

	private PassportSoap passportSoap;

	private volatile List<Message> lastCheckLicenceMessages = Collections.emptyList();
	private volatile boolean licenceValid = false;

	private ListenerList checkLicenceListeners = new ListenerList();

	private class LicenceCheckJob extends Job
	{
		public LicenceCheckJob() {
			super("Licence check");
		}

		@Override
		protected IStatus run(IProgressMonitor monitor)
		{
			try {
				checkLicence(null, monitor);

				// In case of success, check again after 30 days (the licence might expire).
				new LicenceCheckJob().schedule(30L * 24L * 3600L * 1000L);
			} catch (CheckLicenceException e) {
				// In case of error, try again in 5 minutes.
				new LicenceCheckJob().schedule(5L * 60L * 1000L);
			}
			return Status.OK_STATUS;
		}
	}

	public LicenceManager()
	{
		IPreferencesService preferencesService = Platform.getPreferencesService();
		preferencesRootNode = preferencesService.getRootNode();
		preferences = preferencesRootNode.node(ConfigurationScope.SCOPE).node(JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME);

//		preferencesRootNode.addNodeChangeListener(new INodeChangeListener() {
//			@Override
//			public void removed(NodeChangeEvent event) {
//				if (JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME.equals(event.getChild().name()))
//					clearCache();
//			}
//
//			@Override
//			public void added(NodeChangeEvent event) {
//				if (JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME.equals(event.getChild().name()))
//					clearCache();
//			}
//		});
//
//		preferencesRootNode.addPreferenceChangeListener(new IPreferenceChangeListener() {
//			@Override
//			public void preferenceChange(PreferenceChangeEvent event) {
//				if (JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME.equals(event.getNode().name()))
//					clearCache();
//			}
//		});

//		licenceCheckTimer.schedule(licenceCheckTimerTask, 0L); // start immediately in the background
		new LicenceCheckJob().schedule();
	}

    protected synchronized PassportSoap getPassportSoap() {
    	if (passportSoap == null) {
	    	Passport passport = new Passport();
	    	passportSoap = passport.getPassportSoap();
    	}
    	return passportSoap;
    }

    protected int getProductID()
    {
    	return 87920;
    }

    /**
     * Get the result of the last licence check. If there was no licence check, yet, it will return <code>false</code>.
     * This method returns immediately without performing any IO operation.
     * @return <code>true</code>, if the licence is valid; <code>false</code> otherwise.
     */
	public boolean isLicenceValid()
	{
		return licenceValid;
	}

	/**
	 * Get the messages that where collected during the last {@link #checkLicence(List, IProgressMonitor)} invocation.
	 * @return
	 */
	public List<Message> getLastCheckLicenceMessages() {
		return lastCheckLicenceMessages;
	}

	/**
	 * Do a licence check now (synchronously).
	 *
	 * @param messages a list to be populated with the messages that happen during this method. Can be <code>null</code>,
	 * if the caller is not interested in getting the messages (they can still be queried later by {@link #getLastCheckLicenceMessages()}).
	 * @param monitor monitor for progress feedback; must not be <code>null</code>.
	 * @return whether the licence is valid.
	 * @throws CheckLicenceException if an error occurs. In this case, <code>messages</code> should also contain at least one
	 * {@link ErrorMessage} (which is added before throwing the exception).
	 * @see #isLicenceValid()
	 */
	public boolean checkLicence(List<Message> messages, IProgressMonitor monitor)
	throws CheckLicenceException
	{
		if (messages == null)
			messages = new ArrayList<Message>();

		if (monitor == null)
			throw new IllegalArgumentException("monitor == null");

		boolean licenceValid = this.licenceValid;
		firePreCheckLicenceEvent(this.lastCheckLicenceMessages, licenceValid); // fire with OLD values (before check)

		monitor.beginTask("Check licence", 100);
		try {
			messages.add(new InfoMessage("Beginning licence check."));

			String email = preferences.get(PREFERENCES_KEY_EMAIL, null);
			if (email != null) {
				email = email.trim();

				if (email.isEmpty())
						email = null;
			}

			String licenceKey = preferences.get(PREFERENCES_KEY_LICENCE_KEY, null);
			if (licenceKey != null) {
				licenceKey = licenceKey.trim();

				if (licenceKey.isEmpty())
					licenceKey = null;
			}

			if (email == null || licenceKey == null) {
				messages.add(new WarningMessage("There is no email address or no licence key. Cannot check licence."));
				licenceValid = false;
			}
			else {
				LicenseInfo licenseInfo;
				String licenceValidationResult = getPassportSoap().validateLicense(getProductID(), email, licenceKey);
				try {
					licenseInfo = new LicenseInfoIO().read(licenceValidationResult);
				} catch (IOException e) {
					throw new CheckLicenceException(e);
				}

				if (licenseInfo.getValid() == null)
					throw new CheckLicenceException("PassportSoap.validateLicense(...) returned illegal result: licenseInfo.getValid() == null");

				licenceValid = licenseInfo.getValid().booleanValue();

				if (licenceValid)
					messages.add(new InfoMessage("Licence is valid."));
				else
					messages.add(new WarningMessage("Licence is NOT valid."));
			}
		} catch (Throwable x) {
			messages.add(new ErrorMessage(x));
			if (x instanceof CheckLicenceException)
				throw (CheckLicenceException)x;
			else
				throw new CheckLicenceException(x);
		} finally {
			messages.add(new InfoMessage("Finished licence check."));

			messages = Collections.unmodifiableList(new ArrayList<Message>(messages));
			this.licenceValid = licenceValid;
			this.lastCheckLicenceMessages = messages;

			monitor.done();
			firePostCheckLicenceEvent(messages, licenceValid); // fire with NEW values (after current check)
		}
		return licenceValid;
	}

	protected void firePreCheckLicenceEvent(List<Message> lastCheckLicenceMessages, boolean licenceValid)
	{
		CheckLicenceEvent event = new CheckLicenceEvent(this, lastCheckLicenceMessages, licenceValid);
		for (Object l : checkLicenceListeners.getListeners()) {
			try {
				((CheckLicenceListener)l).preCheckLicence(event);
			} catch (Exception x) {
				logger.error("firePreCheckLicenceEvent: " + x, x);
			}
		}
	}

	protected void firePostCheckLicenceEvent(List<Message> lastCheckLicenceMessages, boolean licenceValid)
	{
		CheckLicenceEvent event = new CheckLicenceEvent(this, lastCheckLicenceMessages, licenceValid);
		for (Object l : checkLicenceListeners.getListeners()) {
			try {
				((CheckLicenceListener)l).postCheckLicence(event);
			} catch (Exception x) {
				logger.error("firePostCheckLicenceEvent: " + x, x);
			}
		}
	}

	public void addCheckLicenceListener(CheckLicenceListener listener)
	{
		if (listener == null)
			throw new IllegalArgumentException("listener == null");

		checkLicenceListeners.add(listener);
	}

	public void removeCheckLicenceListener(CheckLicenceListener listener)
	{
		checkLicenceListeners.remove(listener);
	}

//	private static final String[] KEY = {
//		"uvN:JSA\";[`\"M3U\"}<%w7AV3*b\"wVXC1PuDb)sG~e_NQgsTo4DIL~vj,YDi)I<Ut_JxyQzK2nDT68pcHZAe^/!W*bzixgFW\"xnIS",
//		"\"BdOd8|iSUe:cpvio+GY\"c6+uVJ$9P~iN3GHid)jzrDZoedHh*Cwe0tdJ(skU)0QVRDHyB6|YfIrJW+sD?*YiqqPduso|)~pr\"~",
//		"K#t~W8,|*\\YXD_HOVH&@`$S?^-RV)ax`yq;sy>QQ2+*M1:/VO]r\\fG)IVpwx`QT=6yJ[Dy*lPfcIWx)K.$H$+$!:MH@5dPhlkH"
//	};
//
//	private static final byte[][] KEY_B = new byte[KEY.length][];
//
//	static {
//		Set<Integer> lengths = new HashSet<Integer>();
//		for (int i = 0; i < KEY.length; i++) {
//			byte[] byteArray = KEY[i].getBytes(IOUtil.CHARSET_UTF_8);
//			if (!lengths.add(byteArray.length))
//				throw new IllegalStateException("Multiple key parts have the same length: " + byteArray.length);
//
//			KEY_B[i] = byteArray;
//		}
//	}
//
//	public static void main(String[] args) throws Exception {
//		String s0 = "Neben dem Workspace für Benutzerdateien existiert für Plug-ins der Laufzeitumgebung und Eclipse Runtime noch die Configuration Area. Diese ist als interner Ordner der Eclipse Plattform zu betrachten. Hier werden vor allem Metadaten, Caches sowie interne Konfigurationsdateien (z.B. die Startkonfiguration config.ini) abgelegt. Der Ordner wird über osgi.configuration.area bzw. -configuration konfiguriert und liegt standardmäßig im Anwendungsordner unter configuration. Beim Start aus der IDE können Sie den Ordner in der Run Configuration konfigurieren und beim Start der Anwendung zurücksetzen lassen:";
//		System.out.println(s0);
//
//		byte[] crypted = encrypt(s0.getBytes(IOUtil.CHARSET_UTF_8));
//		System.out.println(Util.encodeHexStr(crypted));
//
//		byte[] decrypted = decrypt(crypted);
//		String s1 = new String(decrypted, IOUtil.CHARSET_UTF_8);
//		System.out.println(s1);
//		System.out.println(s0.equals(s1));
//	}
//
//	private void loadLicenceProperties()
//	{
//		try {
//			PropertiesWithChangeSupport licenceProperties = new PropertiesWithChangeSupport();
//
//			licenceProperties.addPropertyChangeListener(new PropertyChangeListener() {
//				@Override
//				public void propertyChange(PropertyChangeEvent evt) {
//					storeLicenceProperties();
//				}
//			});
//
//			Preferences preferences = ConfigurationScope.INSTANCE
//					.getNode("de.vogella.preferences.test");
//
//				Preferences sub1 = preferences.node("note1");
//
//			byte[] encrypted = Platform.getPreferencesService().getByteArray(
//					JJQBCorePlugin.getDefault().getBundle().getSymbolicName(),
//					LicenceManager.class.getName(),
//					null,
//					new IScopeContext[] { new ConfigurationScope() }
//			);
//
//			if (encrypted != null) {
//				byte[] decrypted = decrypt(encrypted);
//				licenceProperties.load(new ByteArrayInputStream(decrypted));
//			}
//
//			this.licenceProperties = licenceProperties;
//		} catch (IOException x) {
//			throw new RuntimeException(x);
//		}
//	}
//
//	private void storeLicenceProperties()
//	{
//		PropertiesWithChangeSupport licenceProperties = this.licenceProperties;
//		if (this.licenceProperties == null)
//			return;
//
//		try {
//			ByteArrayOutputStream bout = new ByteArrayOutputStream();
//			licenceProperties.store(bout, null);
//
//			byte[] encrypted = encrypt(bout.toByteArray());
//
//			Platform.getPreferencesService(). ByteArray(
//					JJQBCorePlugin.getDefault().getBundle().getSymbolicName(),
//					LicenceManager.class.getName(),
//					null,
//					new IScopeContext[] { new ConfigurationScope() }
//			);
//
//			OutputStream out = new FileOutputStream(licenceFile);
//			out.write(encrypted);
//			out.close();
//		} catch (IOException x) {
//			throw new RuntimeException(x);
//		}
//	}

//	private static byte[] encrypt(byte[] in)
//	{
//		byte[] randomKey = new byte[random.nextInt(200) + 56];
//		random.nextBytes(randomKey);
//		byte[] raw = crypt(in, randomKey);
//		byte[] result = new byte[ 1 + 1 + randomKey.length + raw.length];
//		result[0] = 1; // version
//		result[1] = (byte) randomKey.length;
//
//		// sanity check
//		int randomKeyLength = result[1] & 0xff;
//		if (randomKey.length != randomKeyLength)
//			throw new IllegalStateException("randomKey.length != randomKeyLength :: " + randomKey.length + " != " + randomKeyLength);
//
//		System.arraycopy(randomKey, 0, result, 1 + 1, randomKeyLength);
//		System.arraycopy(raw, 0, result, 1 + 1 + randomKeyLength, raw.length);
//		return result;
//	}
//
//	private static byte[] decrypt(byte[] in)
//	{
//		if (in[0] != 1)
//			throw new IllegalArgumentException("Version mismatch! Encrypted data has version " + in[0] + " instead of 1!");
//
//		int randomKeyLength = in[1] & 0xff;
//		byte[] randomKey = new byte[randomKeyLength];
//		byte[] raw = new byte[in.length - randomKeyLength - 1 - 1];
//
//		System.arraycopy(in, 1 + 1, randomKey, 0, randomKeyLength);
//		System.arraycopy(in, 1 + 1 + randomKeyLength, raw, 0, raw.length);
//		return crypt(raw, randomKey);
//	}
//
//	private static byte[] crypt(byte[] in, byte[] randomKey) {
//		byte[] out = new byte[in.length];
//		int[] idx = new int[KEY_B.length]; // java initialises all elements to 0
//		int ridx = 0;
//		for (int i = 0; i < in.length; i++) {
//			byte inB = in[i];
//			int outI = inB ^ KEY_B[0][idx[0]] ^ KEY_B[1][idx[1]] ^ KEY_B[2][idx[2]] ^ randomKey[ridx];
//			byte outB = (byte) outI;
//			out[i] = outB;
//
//			for (int f = 0; f < KEY_B.length; ++f) {
//				if (++idx[f] >= KEY_B[f].length)
//					idx[f] = 0;
//			}
//
//			if (++ridx >= randomKey.length)
//				ridx = 0;
//		}
//		return out;
//	}
}
