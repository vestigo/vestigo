package org.nightlabs.jjqb.core.test.licence.xml;

import java.io.InputStream;

import junit.framework.Assert;

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

		assertLicenseInfoEqualsExpected(licenseInfo);
	}

	public static void assertLicenseInfoEqualsExpected(LicenseInfo licenseInfo)
	{
		Assert.assertEquals("licenseInfo.getValid()", Boolean.TRUE, licenseInfo.getValid());
		Assert.assertEquals("licenseInfo.getCustomerEmail()", "b6038024@nwldx.com", licenseInfo.getCustomerEmail());
		Assert.assertEquals("licenseInfo.getCustomerName()", "Adam Müller", licenseInfo.getCustomerName());
		Assert.assertEquals("licenseInfo.getProductName()", "Test product 1", licenseInfo.getProductName());
		Assert.assertEquals("licenseInfo.getKey()", "PDFO-RPGR-BONE-AKFM", licenseInfo.getKey());
		Assert.assertEquals("licenseInfo.getTotalUsages()", 1, licenseInfo.getTotalUsages());
		Assert.assertEquals("licenseInfo.getUsagesLeft()", 1, licenseInfo.getUsagesLeft());
		Assert.assertEquals("licenseInfo.getPurchaseDate()", "2/3/2012", licenseInfo.getPurchaseDate());
		Assert.assertEquals("licenseInfo.getOrderReferenceNumber()", "686514-001-1UT", licenseInfo.getOrderReferenceNumber());
		Assert.assertEquals("licenseInfo.getCanBeActivated()", Boolean.TRUE, licenseInfo.getCanBeActivated());
	}
}
