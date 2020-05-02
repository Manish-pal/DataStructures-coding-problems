package com.company.com.ds.programs;

import java.util.Hashtable;

public class HashTableExample {

    //Implemented the Hash Table DS
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

        hashtable.put(1,"Manish");
        hashtable.put(2,"Kumar");
        hashtable.put(3,"Punit");
        hashtable.put(4,"Amrit");

        System.out.println("The HashTable is : " + hashtable);
        System.out.println("The Keys are " + hashtable.keys());
        System.out.println("The values are" + hashtable.values());
        System.out.println("The HashTable contains the key 65 " + hashtable.containsKey(65));

        hashtable.remove(4);

        System.out.println("After Removal  "+ hashtable);

    }
}
