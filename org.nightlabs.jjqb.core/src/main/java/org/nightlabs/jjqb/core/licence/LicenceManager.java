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
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.licence.ws.Passport;
import org.nightlabs.jjqb.core.licence.ws.PassportSoap;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfo;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfoIO;
import org.osgi.service.prefs.BackingStoreException;
import org.osgi.service.prefs.Preferences;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicenceManager
{
	private static final Logger logger = LoggerFactory.getLogger(LicenceManager.class);

	/**
	 * Key referencing the (<code>String</code>) customer's email address
	 * in the {@link #getPreferences() preferences}.
	 * This must be the email address that was used to purchase the licence.
	 */
	public static final String PREFERENCES_KEY_EMAIL = "licence.email";

	/**
	 * Key referencing the (<code>String</code>) licence key in the {@link #getPreferences() preferences}.
	 */
	public static final String PREFERENCES_KEY_LICENCE_KEY = "licence.licenceKey";

	/**
	 * Key referencing the (<code>long</code>) timestamp of the last check at the licence server
	 * in the {@link #getPreferences() preferences}.
	 * The licence server's response is cached locally in the preferences for a maximum of
	 * {@link #CHECK_LICENCE_SERVER_STATUS_EXPIRY}.
	 */
	public static final String PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP = "licence.lastServerStatus.timestamp";

	/**
	 * Key referencing the (<code>boolean</code>) flag in the {@link #getPreferences() preferences}
	 * indicating whether the licence is valid or not.
	 * @see #PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP
	 */
	public static final String PREFERENCES_KEY_LAST_SERVER_STATUS_LICENCE_VALID = "licence.lastServerStatus.licenceValid";

	/**
	 * Key referencing the (<code>String</code>) customer's email address that was used when asking the server
	 * for the licence status the last time.
	 * @see #PREFERENCES_KEY_EMAIL
	 * @see #PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP
	 */
	public static final String PREFERENCES_KEY_LAST_SERVER_STATUS_EMAIL = "licence.lastServerStatus.email";

	/**
	 * Key referencing the (<code>String</code>) licence key that was used when asking the server
	 * for the licence status the last time.
	 * @see #PREFERENCES_KEY_LICENCE_KEY
	 * @see #PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP
	 */
	public static final String PREFERENCES_KEY_LAST_SERVER_STATUS_LICENCE_KEY = "licence.lastServerStatus.licenceKey";

	/**
	 * Key referencing the (<code>boolean</code>) flag in the {@link #getPreferences() preferences}
	 * indicating whether the licence was activated (i.e. consumed) for this computer/user.
	 */
	public static final String PREFERENCES_KEY_ACTIVATED = "licence.activated";

	/**
	 * Time (in milliseconds) after which a cached server response expires. This time is relative
	 * to {@link #PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP}. After this expiry, the licence
	 * is considered invalid, if it cannot be reconfirmed by the server.
	 * <p>
	 * The server is queried more often
	 * (every {@value #CHECK_LICENCE_SERVER_STATUS_REQUEST_PERIOD} milliseconds), but failed requests (e.g.
	 * because of the client being offline) do not have any consequence until the the response-expiry.
	 * </p>
	 */
	public static long CHECK_LICENCE_SERVER_STATUS_EXPIRY = 30L * 24L * 3600L * 1000L;

	/**
	 * Time (in milliseconds) after which a new request is sent to the server. This new request will
	 * be done even if there still is a last status cached locally. If the new request is successful,
	 * the locally cached status is updated. If the new request fails, it has no consequence until
	 * the locally cached status {@link #CHECK_LICENCE_SERVER_STATUS_EXPIRY expires}.
	 */
	public static long CHECK_LICENCE_SERVER_STATUS_REQUEST_PERIOD = 24L * 3600L * 1000L;

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
			if (this != licenceCheckJob)
				return Status.CANCEL_STATUS;

			try {
				checkLicence(null, monitor);

				// In case of success, check again after 1 day (the licence might expire).
				// Note, that a non-valid licence is a success (no exception) and therefore it is not hammered
				// onto the licence server.
				scheduleLicenceCheckJob(CHECK_LICENCE_SERVER_STATUS_REQUEST_PERIOD);
			} catch (CheckLicenceException e) {
				// In case of error (e.g. network down), try again in 5 minutes.
				scheduleLicenceCheckJob(5L * 60L * 1000L);
			}
			return Status.OK_STATUS;
		}
	}

	public LicenceManager()
	{
		IPreferencesService preferencesService = Platform.getPreferencesService();
		preferencesRootNode = preferencesService.getRootNode();
		preferences = preferencesRootNode.node(ConfigurationScope.SCOPE).node(JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME);

		if (!isLastServerStatusExpired() && isLastServerStatusMatchingCurrentEmailAndKey())
			licenceValid = isLastServerStatusLicenceValid();

		scheduleLicenceCheckJob(0L);
	}

	private volatile LicenceCheckJob licenceCheckJob;

	protected synchronized void scheduleLicenceCheckJob(long delay)
	{
		if (licenceCheckJob != null) {
			licenceCheckJob.cancel();
			licenceCheckJob = null;
		}

		licenceCheckJob = new LicenceCheckJob();
		licenceCheckJob.schedule(delay);
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

//	/**
//	 * Was the licence data (email + key) ever valid? If <code>true</code>, it means that the current licence information
//	 * could probably not be re-validated because the server was not reachable.
//	 * @return <code>true</code>, if the licence was ever valid; <code>false</code> otherwise.
//	 */
//	public boolean wasLicenceValid()
//	{
//		isLa
//	}

	/**
	 * Get the messages that where collected during the last {@link #checkLicence(List, IProgressMonitor)} invocation.
	 * @return
	 */
	public List<Message> getLastCheckLicenceMessages() {
		return lastCheckLicenceMessages;
	}

	public Preferences getPreferences() {
		return preferences;
	}

	/**
	 * Do a licence check in a background {@link Job}. This method returns immediately after
	 * {@link Job#schedule() scheduling} a <code>Job</code>.
	 * @param userJob flag indicating whether or not this job has been directly initiated by
	 * a UI end user; passed to {@link Job#setUser(boolean)}.
	 * @param listeners listeners to be notified about job changes;
	 * passed to {@link Job#addJobChangeListener(IJobChangeListener)}. Can be <code>null</code>.
	 */
	public void checkLicence(boolean userJob, IJobChangeListener ... listeners)
	{
		Job job = new Job("Licence check") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					checkLicence(null, monitor);
				} catch (CheckLicenceException e) {
					// ignore (only log), because we have the messages table anyway
					logger.error("checkLicence: " + e, e);
				}
				return Status.OK_STATUS;
			}
		};

		if (listeners != null) {
			for (IJobChangeListener listener : listeners)
				job.addJobChangeListener(listener);
		}

		job.setUser(userJob);
		job.schedule();
	}

	private boolean checkLicence_queryServer(String email, String licenceKey, IProgressMonitor monitor)
	throws IOException
	{
		logger.debug("checkLicence_queryServer: entered");

		LicenseInfo licenseInfo;
		String licenceValidationResult = getPassportSoap().validateLicense(getProductID(), email, licenceKey);

		logger.trace("checkLicence_queryServer: PassportSoap.validateLicense() returned: {}", licenceValidationResult);

		licenseInfo = new LicenseInfoIO().read(licenceValidationResult);

		if (licenseInfo.getValid() == null)
			throw new CheckLicenceException("PassportSoap.validateLicense(...) returned illegal result: licenseInfo.getValid() == null");

		boolean licenceValid = licenseInfo.getValid().booleanValue();

		logger.info("checkLicence_queryServer: returning licenceValid={}", licenceValid);

		return licenceValid;
	}

	private long getLastServerStatusTimestamp()
	{
		String timestampString = preferences.get(PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP, null);
		try {
			return Long.valueOf(timestampString);
		} catch (NumberFormatException x) {
			return 0;
		}
	}

	private boolean isLastServerStatusMatchingCurrentEmailAndKey() {
		String email = preferences.get(PREFERENCES_KEY_EMAIL, "").trim();
		String licenceKey = preferences.get(PREFERENCES_KEY_LICENCE_KEY, "").trim();
		return isLastServerStatusMatching(email, licenceKey);
	}

	private boolean isLastServerStatusMatching(String email, String licenceKey)
	{
		String last_email = preferences.get(PREFERENCES_KEY_LAST_SERVER_STATUS_EMAIL, "").trim();
		String last_licenceKey = preferences.get(PREFERENCES_KEY_LAST_SERVER_STATUS_LICENCE_KEY, "").trim();
		return last_email.equals(email) && last_licenceKey.equals(licenceKey);
	}

	private boolean isLastServerStatusOlderThanRequestPeriod()
	{
		long lastServerStatusTimestamp = getLastServerStatusTimestamp();
		return CHECK_LICENCE_SERVER_STATUS_REQUEST_PERIOD < System.currentTimeMillis() - lastServerStatusTimestamp;
	}

	private boolean isLastServerStatusExpired()
	{
		long lastServerStatusTimestamp = getLastServerStatusTimestamp();
		return CHECK_LICENCE_SERVER_STATUS_EXPIRY < System.currentTimeMillis() - lastServerStatusTimestamp;
	}

	private boolean isLastServerStatusLicenceValid()
	{
		String licenceValidString = preferences.get(PREFERENCES_KEY_LAST_SERVER_STATUS_LICENCE_VALID, null);
		return Boolean.valueOf(licenceValidString);
	}

	private void putLastServerStatus(String email, String licenceKey, boolean licenceValid) throws BackingStoreException
	{
		preferences.put(PREFERENCES_KEY_LAST_SERVER_STATUS_TIMESTAMP, Long.toString(System.currentTimeMillis()));
		preferences.put(PREFERENCES_KEY_LAST_SERVER_STATUS_EMAIL, email);
		preferences.put(PREFERENCES_KEY_LAST_SERVER_STATUS_LICENCE_KEY, licenceKey);
		preferences.put(PREFERENCES_KEY_LAST_SERVER_STATUS_LICENCE_VALID, Boolean.toString(licenceValid));

		// flush() is essentially necessary!!!
		preferences.flush();
	}

	/**
	 * Do a licence check synchronously on the current thread. This method blocks until the licence check is completed.
	 *
	 * @param messages a list to be populated with the messages that happen during this method. Can be <code>null</code>,
	 * if the caller is not interested in getting the messages (they can still be queried later by {@link #getLastCheckLicenceMessages()}).
	 * @param monitor monitor for progress feedback; must not be <code>null</code>.
	 * @return whether the licence is valid.
	 * @throws CheckLicenceException if an error occurs. In this case, <code>messages</code> should also contain at least one
	 * {@link ErrorMessage} (which is added before throwing the exception).
	 * @see #isLicenceValid()
	 */
	public synchronized boolean checkLicence(List<Message> messages, IProgressMonitor monitor)
	throws CheckLicenceException
	{
		if (messages == null)
			messages = new ArrayList<Message>();

		if (monitor == null)
			throw new IllegalArgumentException("monitor == null");

		firePreCheckLicenceEvent(this.lastCheckLicenceMessages, this.licenceValid); // fire with OLD values (before check)

		boolean licenceValid = false;
		monitor.beginTask("Check licence", 100);
		try {
			messages.add(new InfoMessage("Beginning licence check."));

			String email = preferences.get(PREFERENCES_KEY_EMAIL, "").trim();
			String licenceKey = preferences.get(PREFERENCES_KEY_LICENCE_KEY, "").trim();

			if (email.isEmpty() || licenceKey.isEmpty()) {
				messages.add(new WarningMessage("There is no email address or no licence key. Cannot check licence."));
				licenceValid = false;
			}
			else {
				if (isLastServerStatusOlderThanRequestPeriod() || !isLastServerStatusMatching(email, licenceKey)) {
					boolean queryingServerSuccessful = false;
					try {
						licenceValid = checkLicence_queryServer(email, licenceKey, new SubProgressMonitor(monitor, 50));
						queryingServerSuccessful = true;
					} catch (Exception x) {
						if (isLastServerStatusExpired() || !isLastServerStatusMatching(email, licenceKey))
							throw x;

						messages.add(new WarningMessage("Querying server failed: " + x));
						messages.add(new InfoMessage("Using cached licence status (because asking server failed)."));
						licenceValid = isLastServerStatusLicenceValid();
					}

					if (queryingServerSuccessful) {
						putLastServerStatus(email, licenceKey, licenceValid);
						messages.add(new InfoMessage("Querying server was successful."));
					}
				}
				else {
					messages.add(new InfoMessage("Using cached licence status (because server was asked only recently)."));
					licenceValid = isLastServerStatusLicenceValid();
				}
			}
		} catch (Throwable x) {
			messages.add(new ErrorMessage(x));
			if (x instanceof CheckLicenceException)
				throw (CheckLicenceException)x;
			else
				throw new CheckLicenceException(x);
		} finally {
			if (licenceValid)
				messages.add(new InfoMessage("Finished licence check. Licence is valid."));
			else
				messages.add(new WarningMessage("Finished licence check. Licence is NOT valid."));

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
