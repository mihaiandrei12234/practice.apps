package com.company;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Introdu un cuvant, daca acesta se regaseste pe hotnews.ro aplicatia iti va afisa de cate ori se gaseste");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        //ce a introdus se gaseste pe hotnews.ro?
        URL hotnewsURL = new URL("https://www.hotnews.ro");
        URLConnection con = hotnewsURL.openConnection();
        InputStream inputStream = con.getInputStream();
        Scanner scanner1 = new Scanner(inputStream);
        int count=0;
        while (scanner1.hasNext()) {
            if(scanner1.nextLine().contains(search)){
               count++;
            }
        }
        System.out.println("S-a gasit de "+count+" ori");
    }
}
