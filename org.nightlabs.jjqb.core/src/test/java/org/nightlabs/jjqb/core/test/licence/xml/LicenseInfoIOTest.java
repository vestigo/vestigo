package org.nightlabs.jjqb.core.test.licence.xml;

import java.io.InputStream;

import org.junit.Test;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfo;
import org.nightlabs.jjqb.core.licence.xml.LicenseInfoIO;

public class LicenseInfoIOTest
{
	@Test
	public void readSuccessXml()
	throws Exception
	{
		InputStream in = LicenseInfoIOTest.class.getResourceAsStream("LicenceInfo-success.xml");
		LicenseInfo licenseInfo = new LicenseInfoIO().read(in);
		in.close();

		LicenseInfoTestHelper.assertLicenseInfoEqualsExpected(licenseInfo);
	}

}
