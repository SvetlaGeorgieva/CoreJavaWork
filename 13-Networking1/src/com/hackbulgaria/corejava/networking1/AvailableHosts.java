package com.hackbulgaria.corejava.networking1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;

public class AvailableHosts {

    public static void getAvailableHosts(InetAddress inetAddress) {

    }

    public static void main(String[] args) throws IOException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netint : Collections.list(nets)) {
            InetAddress IPadress = IPAdress.displayInterfaceInformation(netint);
            if (IPadress != null) {
                String ip = IPadress.getHostAddress().toString();
                int lastDotPosition = ip.lastIndexOf(".");
                String ipPrefix = ip.substring(0, lastDotPosition + 1);
                InetAddress addr;
                for (int i = 0; i < 255; i++) {
                    addr = InetAddress.getByName(ipPrefix + i);
                    if (addr.isReachable(80)) {
                        System.out.println("Available host: " + addr);
                    }
                }
            }

        }

    }

}
