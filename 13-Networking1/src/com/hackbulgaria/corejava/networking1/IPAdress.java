package com.hackbulgaria.corejava.networking1;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class IPAdress {


    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            displayInterfaceInformation(netint);
        }

    }

    public static InetAddress displayInterfaceInformation(NetworkInterface netint) {
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        for (InetAddress inetAddress : Collections.list(inetAddresses)) {
            if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                String ipAddress = inetAddress.getHostAddress().toString();
                System.out.printf("Display name: %s\n", netint.getDisplayName());
                System.out.printf("Name: %s\n", netint.getName());
                System.out.printf("IP address: %s", ipAddress);
                System.out.println();
                return inetAddress;

            }
        }
        return null;
    }

}
