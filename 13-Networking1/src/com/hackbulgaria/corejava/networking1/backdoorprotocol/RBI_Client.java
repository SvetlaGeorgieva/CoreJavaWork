package com.hackbulgaria.corejava.networking1.backdoorprotocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class RBI_Client {
    public static void main(String[] args) throws IOException {

        // if (args.length != 2) {
        // System.err.println("Usage: java EchoClient <host name> <port number>");
        // System.exit(1);
        // }

        Scanner consoleInput = new Scanner(System.in);

        String hostName = consoleInput.next();
        int portNumber = consoleInput.nextInt();

        try (Socket echoSocket = new Socket(hostName, portNumber);
                PrintWriter socketOut = new PrintWriter(echoSocket.getOutputStream(), true);
                BufferedReader socketIn = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader systemIn = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Connection successfull");
            String userInput;
            while ((userInput = systemIn.readLine()) != null) {
                socketOut.println(userInput);
                System.out.println("echo: " + socketIn.readLine());
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " + hostName);
            System.exit(1);
        }
    }
}