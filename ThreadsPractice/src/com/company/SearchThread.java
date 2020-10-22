package com.company;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchThread extends Thread {
    ArrayList<String> content = new ArrayList<>();

    @Override
    public void run() {
        try {
            URL anuntulUrl = new URL("https://www.anuntul.ro/");
            URLConnection con = anuntulUrl.openConnection();
            InputStream inputStream = con.getInputStream();
            Scanner scanner = new Scanner(inputStream);

            while ((scanner.hasNext())) {
                String search = scanner.nextLine();
                content.add(search);
            }

        } catch (Exception e) {

        }
    }

    public void search(String keyword) {
        int count = 0;
        for (String x : content) {
            if (x.contains(keyword)) {
                count++;
            }
        }
        System.out.println("S-a gasit de "+count+" ori");
    }


}


