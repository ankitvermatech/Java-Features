package com.ankittech.codingpractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        List<Double> primeSqrt =
                Stream.iterate(1,i -> i+1)
                .filter(PrimeNumber::isPrime)
                .map(Math::sqrt).limit(10)
                .collect(Collectors.toList());
        System.out.println(primeSqrt);
    }
    public static boolean isPrime(int number) {
        return number>1 &&
                IntStream.range(2,number).noneMatch(n -> number%n == 0);
    }
}
