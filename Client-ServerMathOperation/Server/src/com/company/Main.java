package com.company;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        Scanner s = new Scanner(inputStream);
        ArrayList<String> lines = new ArrayList<>();
        int sum=0;
        while (true) {
            String line = s.nextLine();
            System.out.println("Serverul a primit " + line);
            if (line.equals("Rezultat")) {
                //trebuie sa fac calcul
                for (String x : lines) {
                    int y = Integer.parseInt(x);
                    sum = sum + y;
                }
                BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                writer.write(sum+"");
                writer.write("\n");
                writer.flush();
            } else {
                lines.add(line);
            }


        }


    }
}
