package javaPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;

public class Java_util_Code {
    public static void main(String[] args) {
        // Using ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("ArrayList: " + list);

        // Using HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("HashMap: " + map);
        
          

        // Using Date
        Date date = new Date();
        System.out.println("Current Date: " + date);
    }
}
