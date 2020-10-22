package com.company;

import java.util.ArrayList;

public class PhoneBook {

    ArrayList<Contact> contacts;

    public PhoneBook(){
        contacts=new ArrayList<>();
    }

    public void add(String name,String  phone,String email){
        Contact c=new Contact();
        c.name=name;
        c.email=email;
        c.phone=phone;
        contacts.add(c);
    }

    public boolean search(String toFind){
        for (Contact c:contacts){
            if (c.phone.equals(toFind)){
                return true;
            }
        }
        return false;
    }
}
