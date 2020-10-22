package com.company;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Introdu numere iar serverul iti va afisa suma acestor numere");
        Socket s = new Socket("127.0.0.1", 9999);
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                //trimit ceva la server
                //iau rez
                //il afisez
                writer.write("Rezultat");
                writer.write("\n");
                writer.flush();
                Scanner scanner1 =new Scanner(s.getInputStream());
                String res= scanner1.nextLine();
                System.out.println(res);
                break;
            } else {
                writer.write(line);
                writer.write("\n");
                writer.flush();
            }
        }


    }
}
