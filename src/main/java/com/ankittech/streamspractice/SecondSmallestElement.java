package com.ankittech.streamspractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Integer[] numbers = {5,2,8,3,1,1,3,345,2,2,3,5,8,2};
        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {4,5,6,7,8};

        int secondSmallest = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElseThrow(() ->
                new IllegalArgumentException("Array does not have second smallest element"));
        System.out.println(secondSmallest);


        Map<Integer,Long> newMap = Arrays.stream(numbers)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(newMap);

        List<Integer> commonList = Arrays.stream(array1).filter(arr1number -> Arrays.stream(array2).
                anyMatch(arr2number -> arr2number == arr1number)).collect(Collectors.toList());

        System.out.println(commonList);


    }

}
