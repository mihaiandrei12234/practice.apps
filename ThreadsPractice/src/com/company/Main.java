package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        SearchThread searchThread=new SearchThread();
        searchThread.start();
        Scanner sc=new Scanner(System.in);
        String keyword=sc.nextLine();


        searchThread.search(keyword);

    }

}
