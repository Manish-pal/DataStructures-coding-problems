package com.company.com.ds.programs;

import java.util.HashMap;

public class HashMapExample {

    //non- synchronized faster Implementation of hashing
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1,"America");
        hashMap.put(2,"India");
        hashMap.put(3,"Germany");
        hashMap.put(4,"Italy");
        hashMap.put(15,"Australia");


        System.out.println("This is >> " + hashMap.get(1));
        System.out.println("This is >> " + hashMap.get(2));
        System.out.println("This is >> " + hashMap.get(3));
        System.out.println("This is >> " + hashMap.get(15));
        System.out.println("This is Full Map>> " + hashMap);

        hashMap.remove(3);

        System.out.println("After Removing " + hashMap);

    }
}
