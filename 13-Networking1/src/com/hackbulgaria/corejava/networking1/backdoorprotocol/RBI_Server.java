package com.hackbulgaria.corejava.networking1.backdoorprotocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class RBI_Server {
    public static void main(String[] args) throws IOException {

        Scanner consoleInput = new Scanner(System.in);

        int portNumber = consoleInput.nextInt();

        try (ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                PrintWriter SocketOut = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader SocketIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            String inputLine;
            while ((inputLine = SocketIn.readLine()) != null) {
                System.out.print("Command: ");
                System.out.println(inputLine);
                System.out.print("Start time: ");
                System.out.println(System.currentTimeMillis());

                Process process = Runtime.getRuntime().exec(inputLine);

                OutputStream commandResult = process.getOutputStream();

                System.out.print("End time: ");
                System.out.println(System.currentTimeMillis());

                SocketOut.println(inputLine);

            }
        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port " + portNumber
                    + " or listening for a connection");
            System.out.println(e.getMessage());
        }
    }
}