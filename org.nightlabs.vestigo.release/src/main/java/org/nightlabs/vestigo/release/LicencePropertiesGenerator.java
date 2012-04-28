//package org.nightlabs.vestigo.release;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.OutputStream;
//import java.util.Properties;
//
//import org.nightlabs.util.IOUtil;
//
//public class LicencePropertiesGenerator {
//
//	public static final String PROPERTY_KEY_LICENCE_TEXT = "vestigo.licence.text";
//
//	private File resourcesDir = new File("src/main/resources");
//
//	private File licenceRawFile = new File(resourcesDir, "LICENCE.txt");
//
//	private File licencePropertiesFile = new File(resourcesDir, "LICENCE.properties");
//
//	public static void main(String[] args) throws Exception {
//		new LicencePropertiesGenerator().generate();
//	}
//
//	public void generate() throws Exception {
//		String licenceText = IOUtil.readTextFile(licenceRawFile);
//		Properties properties = new Properties();
//		properties.setProperty(PROPERTY_KEY_LICENCE_TEXT, licenceText);
//		OutputStream out = new FileOutputStream(licencePropertiesFile);
//		properties.store(out,
//				String.format("LICENCE.properties created by '%s'.\n" +
//						"Do not modify this file! It was auto-generated and your manual modifications will be\n" +
//						"lost when the file is generated the next time. Instead modify the original file '%s'!",
//						this.getClass().getName(), licenceRawFile.getName()));
//		out.close();
//	}
//
//}
