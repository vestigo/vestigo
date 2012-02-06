package org.nightlabs.jjqb.core.licence.xml;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.nightlabs.jjqb.core.licence.ws.PassportSoap;
import org.nightlabs.util.IOUtil;

/**
 * <p>
 * IO util to read or write an instance of {@link LicenseInfo} from or to XML.
 * </p><p>
 * {@link PassportSoap#validateLicense(int, String, String)} returns a simple String rather than a structured object.
 * The string <b>is</b> XML, but the WSDL does not declare it appropriately. Here is what is returned by this method:
 * </p><p>
 * Either (if the validation fails):
 * </p>
 *	<pre>
 *	&lt;LicenseInfo Valid="False" /&gt;
 *	</pre>
 * <p>
 * Or (if the validation was successful):
 * </p>
 *	<pre>
 *	&lt;LicenseInfo Valid="true"&gt;
 *	  &lt;CustomerEmail&gt;b6038024@nwldx.com&lt;/CustomerEmail&gt;
 *	  &lt;CustomerName&gt;Adam Müller&lt;/CustomerName&gt;
 *	  &lt;ProductName&gt;Test product 1&lt;/ProductName&gt;
 *	  &lt;Key&gt;PDFO-RPGR-BONE-AKFM&lt;/Key&gt;
 *	  &lt;TotalUsages&gt;1&lt;/TotalUsages&gt;
 *	  &lt;UsagesLeft&gt;1&lt;/UsagesLeft&gt;
 *	  &lt;PurchaseDate&gt;2/3/2012&lt;/PurchaseDate&gt;
 *	  &lt;OrderReferenceNumber&gt;686514-001-1UT&lt;/OrderReferenceNumber&gt;
 *	  &lt;CanBeActivated&gt;True&lt;/CanBeActivated&gt;
 *	&lt;/LicenseInfo&gt;
 *	</pre>
 *
 * @author Marco หงุ่ยตระกูล-Schulze - marco at nightlabs dot de
 *
 */
public class LicenseInfoIO
{
	private JAXBContext jaxbContext;

	private JAXBContext getJaxbContext() throws JAXBException
	{
		if (jaxbContext == null)
			jaxbContext = JAXBContext.newInstance(LicenseInfo.class);

		return jaxbContext;
	}

	public LicenseInfo read(final String s) throws IOException
	{
		byte[] bytes = s.getBytes(IOUtil.CHARSET_UTF_8);
		return read(new ByteArrayInputStream(bytes));
	}

	public LicenseInfo read(final InputStream in) throws IOException
	{
		if (in == null)
			throw new IllegalArgumentException("in == null");

		try {
			final JAXBContext context = getJaxbContext();
			final Unmarshaller unmarshaller = context.createUnmarshaller();
			final Object o = unmarshaller.unmarshal(in);
			return (LicenseInfo) o;
		} catch (final JAXBException x) {
			throw new IOException(x);
		}
	}

	public void write(final LicenseInfo licenseInfo, final OutputStream out) throws IOException
	{
		if (licenseInfo == null)
			throw new IllegalArgumentException("licenseInfo == null");

		if (out == null)
			throw new IllegalArgumentException("out == null");

		try {
			final JAXBContext context = getJaxbContext();
			final Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(licenseInfo, out);
		} catch (final JAXBException x) {
			throw new IOException(x);
		}
	}
}
