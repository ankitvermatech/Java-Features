package com.ankittech.codingpractice;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,5};
        System.out.println(missingNumber(array, array.length+1));
    }

    public static int missingNumber(int[] array, int n){
        int number;
        int total = ((n)*(n+1))/2;
        int sum = Arrays.stream(array).sum();
        number = total - sum;
        return number;
    }
}
