package org.nightlabs.jjqb.core.licence;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.ConfigurationScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.INodeChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.NodeChangeEvent;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.nightlabs.jjqb.core.JJQBCorePlugin;
import org.nightlabs.jjqb.core.licence.ws.Passport;
import org.nightlabs.jjqb.core.licence.ws.PassportSoap;
import org.osgi.service.prefs.Preferences;

public class LicenceManager
{
	public static final String PREFERENCES_KEY_EMAIL = "email";
	public static final String PREFERENCES_KEY_LICENCE_KEY = "licenceKey";

	private IEclipsePreferences preferencesRootNode;
	private Preferences preferences;

	private PassportSoap passportSoap;

//	private PropertiesWithChangeSupport licenceProperties;
//	private static final SecureRandom random = new SecureRandom();
//
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

	public LicenceManager()
	{
		IPreferencesService preferencesService = Platform.getPreferencesService();
		preferencesRootNode = preferencesService.getRootNode();
		preferences = preferencesRootNode.node(ConfigurationScope.SCOPE).node(JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME);

		preferencesRootNode.addNodeChangeListener(new INodeChangeListener() {
			@Override
			public void removed(NodeChangeEvent event) {
				if (JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME.equals(event.getChild().name()))
					clearCache();
			}

			@Override
			public void added(NodeChangeEvent event) {
				if (JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME.equals(event.getChild().name()))
					clearCache();
			}
		});

		preferencesRootNode.addPreferenceChangeListener(new IPreferenceChangeListener() {
			@Override
			public void preferenceChange(PreferenceChangeEvent event) {
				if (JJQBCorePlugin.BUNDLE_SYMBOLIC_NAME.equals(event.getNode().name()))
					clearCache();
			}
		});

//		loadLicenceProperties();
	}

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

	public boolean isLicenceValid()
	{
		String email = preferences.get(PREFERENCES_KEY_EMAIL, null);
		String licenceKey = preferences.get(PREFERENCES_KEY_LICENCE_KEY, null);

		if (email == null || licenceKey == null)
			return false;

		String licenceValidationResult = getPassportSoap().validateLicense(getProductID(), email, licenceKey);

//		<LicenseInfo Valid="False" />

//		<LicenseInfo Valid="true">
//		  <CustomerEmail>b6038024@nwldx.com</CustomerEmail>
//		  <CustomerName>Adam Müller</CustomerName>
//		  <ProductName>Test product 1</ProductName>
//		  <Key>PDFO-RPGR-BONE-AKFM</Key>
//		  <TotalUsages>1</TotalUsages>
//		  <UsagesLeft>1</UsagesLeft>
//		  <PurchaseDate>2/3/2012</PurchaseDate>
//		  <OrderReferenceNumber>686514-001-1UT</OrderReferenceNumber>
//		  <CanBeActivated>True</CanBeActivated>
//		</LicenseInfo>

		return true;
	}

	public void clearCache() {

	}
}
