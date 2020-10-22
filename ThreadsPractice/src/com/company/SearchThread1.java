package com.company;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchThread1 extends Thread{
   ArrayList<String >content=new ArrayList<>();
    public void run() {
        try {
            URL hotnewsURL = new URL("https://www.hotnews.ro");
            URLConnection con = hotnewsURL.openConnection();
            Scanner scanner1 = new Scanner(con.getInputStream());
            while (scanner1.hasNext()) {
                String line = scanner1.nextLine();
                content.add(line);
            }
        } catch (Exception e) {

        }

    }

    public void search(String keyword) {
        for (String x : content) {
            if(x.contains(keyword)){
                System.out.println("S-a gasit  ");}
        }
    }
}
