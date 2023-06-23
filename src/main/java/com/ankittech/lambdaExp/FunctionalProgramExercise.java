package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FunctionalProgramExercise {
    // Print only odd numbers from the list
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        Collections.addAll(numlist,2,3,67,90,343,132);

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS",
                "PCP","Azure","Docker","Kubernetes");

//        courses.stream().forEach(System.out::println);
//        courses.stream().filter(s -> s.toLowerCase().contains("spring")).forEach(System.out::println);
//        courses.stream().filter(s -> s.length()>4).forEach(System.out::println);
//        numlist.stream().filter(number -> number%2==1).forEach(System.out::println);
        numlist.stream().filter(num -> num%2 ==0).map(num -> num*num).forEach(System.out::println);
    }

}
