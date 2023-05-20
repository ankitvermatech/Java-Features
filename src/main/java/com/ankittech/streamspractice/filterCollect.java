package com.ankittech.streamspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filterCollect {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(12);
        integerList.add(23);
        integerList.add(24);
        integerList.add(10);

        System.out.println(integerList);

        // Use of filter

        //integerList.stream().filter(val -> val>10).collect(Collectors.toList()).forEach(System.out::println);
        integerList.stream().filter(val -> val>10).forEach(System.out::println);

        //Use of Map

        integerList.stream().map(val -> val*val).forEach(System.out::println);

        //first filter than square it
        integerList.stream().filter(val -> val>10).map(val -> val*val).forEach(System.out::println);


        System.out.println("Sorted and min and max ");
        //sorted
        integerList.stream().filter(val -> val > 10).map(val -> val * val).sorted().forEach(System.out::println);
        Integer min = integerList.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(min);

        Integer max = integerList.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(max);

        //use of toArray
        Object[] arr = integerList.stream().filter(val -> val > 10).toArray();
//its our job to convert or typecast object array to specified array that we want
        for(Object o : arr){
            System.out.println(o);

            List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
            System.out.println(intList.stream().reduce((a,b) -> a+b).get());
        }
    }

}

