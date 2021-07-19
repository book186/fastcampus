package test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class test_20210510 {

	public static void main(String[] args) {
		String currentURL = "";
		try {
			Enumeration<NetworkInterface> nienum = NetworkInterface.getNetworkInterfaces();
			
			while(nienum.hasMoreElements()) {
				NetworkInterface ni = nienum.nextElement();
				Enumeration<InetAddress> kk = ni.getInetAddresses();
				
				while(kk.hasMoreElements()) {
					InetAddress inetAddress = kk.nextElement();
					
					if(!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && inetAddress.isSiteLocalAddress()) {
						currentURL = inetAddress.getHostAddress().toString();
					}
				}
			}
		} catch(SocketException e) {
			e.printStackTrace();
		}
		}

}
