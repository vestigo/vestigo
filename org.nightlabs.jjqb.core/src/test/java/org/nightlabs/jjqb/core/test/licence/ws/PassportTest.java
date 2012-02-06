package org.nightlabs.jjqb.core.test.licence.ws;

import org.junit.Test;
import org.nightlabs.jjqb.core.licence.ws.Passport;
import org.nightlabs.jjqb.core.licence.ws.PassportSoap;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfo;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfoIO;
import org.nightlabs.jjqb.core.test.licence.xml.LicenseInfoIOTest;

public class PassportTest
{
	private Passport passport = new Passport();
	private PassportSoap passportSoap = passport.getPassportSoap();

	@Test
	public void validateValidKey()
	throws Exception
	{
    	String licenceValidationResult = passportSoap.validateLicense(87920, "b6038024@nwldx.com", "PDFO-RPGR-BONE-AKFM");
    	LicenseInfo licenseInfo = new LicenseInfoIO().read(licenceValidationResult);
    	LicenseInfoIOTest.assertLicenseInfoEqualsExpected(licenseInfo);
	}

	@Test
	public void activateValidKey()
	throws Exception
	{
		String customerEmail = "test@payproglobal.com";
		String key = "DKWT-DMRE-FXHX-BKEM";

		String licenceValidationResult = passportSoap.validateLicense(87920, customerEmail, key);
    	LicenseInfo licenseInfo = new LicenseInfoIO().read(licenceValidationResult);

    	boolean activeLicenseResult = passportSoap.activeLicense(87920, customerEmail, key);
    	System.out.println(activeLicenseResult);

    	String licenceValidationResult2 = passportSoap.validateLicense(87920, customerEmail, key);
    	LicenseInfo licenseInfo2 = new LicenseInfoIO().read(licenceValidationResult2);
	}
}
