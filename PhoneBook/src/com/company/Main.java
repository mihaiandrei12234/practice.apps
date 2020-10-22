package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner s = new Scanner(System.in);
        System.out.println("Aceasta este o agenda telefonica");
        Menu.info();
        while (true) {
            int opt = s.nextInt();

            if (opt == 1) {
                Menu.startAdding(phoneBook);
                Menu.info();
            }
            if (opt == 2) {
                Menu.search(phoneBook);
                Menu.info();
            }
        }
    }
}

