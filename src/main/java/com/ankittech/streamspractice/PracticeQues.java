package com.ankittech.streamspractice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeQues {
    public static void main(String[] args) {
        //ques 48 :
        System.out.println("Collect duplicate elements");
        List<Integer> intList = Arrays.asList(10,28,87,10,20,76,28,80,80,76);
        Set<Integer> set = new HashSet<>();
        intList.stream().filter(x->!set.add(x)).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Multiply two numbers using Functional Interface");
        //ques 49
        MultiplyOperation mul = (x,y) -> x*y;
        System.out.println(mul.multiply(8,7));

        System.out.println("Limit the list to certain count");
        intList.stream().limit(5).forEach(System.out::println);

        System.out.println("Skip certain elements from list");
        intList.stream().skip(5).forEach(System.out::println);
    }
}
