package org.nightlabs.vestigo.core.test.licence;

import java.net.NetworkInterface;
import java.util.Enumeration;

import org.junit.Test;
import org.nightlabs.util.Util;

public class FindOutMacAddressTest
{
	@Test
	public void findOutMacAddress() throws Exception
	{
		for (Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces(); networkInterfaces.hasMoreElements(); ) {
			NetworkInterface networkInterface = networkInterfaces.nextElement();
			byte[] hardwareAddress = networkInterface.getHardwareAddress();
			String hardwareAddressString = hardwareAddress == null ? null : Util.encodeHexStr(hardwareAddress);
			System.out.println("************************");
			System.out.println("displayName=" + networkInterface.getDisplayName());
			System.out.println("name=" + networkInterface.getName());
			System.out.println("hardwareAddress=" + hardwareAddressString);
		}
	}
}
