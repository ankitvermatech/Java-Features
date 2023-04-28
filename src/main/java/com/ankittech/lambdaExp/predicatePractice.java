package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicatePractice {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.equalsIgnoreCase("Ankit");
        System.out.println(p.test("ankit"));
        System.out.println(p.test("ankur"));


        //display names start with K
        String[] names = {"Sunny", "Kajal", "Ankur", "Kumkum", "Shivani"};

        Predicate<String> p1 = name -> name.startsWith("k");

        for (String s : names) {
            if (p1.test(s.toLowerCase())) {
                System.out.println(s);
            }
        }

        // Display names which are not null and not empty string
        String[] names1 = {"Ankit","",null,"Ankur","  ",null};

        Predicate<String> null_empty = s -> s != null && s.trim().length() > 0;
        List<String> newName = new ArrayList<>();
        for(String name : names1){
            if(null_empty.test(name)){
                newName.add(name);
            }
        }
        System.out.println(newName);
    }
}
