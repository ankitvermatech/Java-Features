package com.ankittech.codingpractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] array = {7,10,4,3,20,15};
        int k = 3;
        int num = Arrays.stream(array).sorted().skip(array.length-2).findFirst().getAsInt();
        System.out.println(num);
    }
}
