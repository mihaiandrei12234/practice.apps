package com.company;

import java.util.Scanner;

public class Menu {
   public static void  info(){
       System.out.println("Alege optiunea");
       System.out.println("1-Adauga contact nou");
       System.out.println("2-Cauta dupa telefon");
   }

    public  static void  startAdding(PhoneBook agenda){
        Scanner s=new Scanner(System.in);
        System.out.println("Introdu nume");
        String name=s.nextLine();
        System.out.println("Introdu telefon");
        String phone=s.nextLine();
        System.out.println("Introdu email");
        String email=s.nextLine();
        agenda.add(name,phone,email);
        System.out.println("Contactul a fost salvat cu succes");
    }

    public static void search(PhoneBook agenda){
        Scanner s=new Scanner(System.in);
        System.out.println("Introdu telefon");
        String phone=s.nextLine();
        boolean found=agenda.search(phone);
        if (found){
            System.out.println("Exista");
        } else {
            System.out.println("Nu exista");
        }
    }
}
