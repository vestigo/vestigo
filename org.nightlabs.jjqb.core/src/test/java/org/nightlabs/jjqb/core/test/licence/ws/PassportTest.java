package org.nightlabs.jjqb.core.test.licence.ws;

import org.junit.Test;
import org.nightlabs.jjqb.core.licence.ws.Passport;
import org.nightlabs.jjqb.core.licence.ws.PassportSoap;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfo;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfoIO;
import org.nightlabs.jjqb.core.test.licence.xml.LicenseInfoIOTest;

public class PassportTest
{
	@Test
	public void validateValidKey()
	throws Exception
	{
		Passport passport = new Passport();
    	PassportSoap passportSoap = passport.getPassportSoap();
    	String licenceValidationResult = passportSoap.validateLicense(87920, "b6038024@nwldx.com", "PDFO-RPGR-BONE-AKFM");
    	LicenseInfo licenseInfo = new LicenseInfoIO().read(licenceValidationResult);

    	LicenseInfoIOTest.assertLicenseInfoEqualsExpected(licenseInfo);
	}
}
