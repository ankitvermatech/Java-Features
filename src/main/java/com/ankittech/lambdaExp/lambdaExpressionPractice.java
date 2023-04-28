package com.ankittech.lambdaExp;

import com.ankittech.lambdaExpInterface.Addable;
import com.ankittech.lambdaExpInterface.SquareIt;
import com.ankittech.lambdaExpInterface.StringLength;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class lambdaExpressionPractice {
    public static void main(String[] args) {
        //Starting of Lambda File
        System.out.println("Hello");
        System.out.println("*********************************************************************");

        // lamda expression without parameter and using existing functional Interface Runnable
       Runnable hello_ankit = () -> {
            System.out.println("Hello Ankit");
        };

        hello_ankit.run();

        System.out.println("*********************************************************************");

        // Lamda Expression with two parameters and for that created new custom interface Addable
        Addable ad1 = (a, b) -> {
            System.out.println(a + b);
        };
        ad1.add(10, 20);

        System.out.println("*********************************************************************");

        //Lamda Expression on collection part List
        List<String> list = new ArrayList<String>();
        list.add("Ankit");
        list.add("Ajit");
        list.add("vijay");
        list.add("Indralok");

        list.forEach(
            (n)->System.out.println(n)
        );

        System.out.println("*********************************************************************");

        // lamda Exprssion on String
        StringLength size = (String s)->{return s.length();};
        System.out.println(size.length("Ankit Verma"));

        System.out.println("*********************************************************************");

        //lamda Exprssion without return type
        StringLength size1 = s -> s.length();
        System.out.println(size1.length("Ankit"));

        System.out.println("*********************************************************************");
        SquareIt squarenumber = x -> x*x;
        System.out.println(squarenumber.getSquare(10));

        System.out.println("*********************************************************************");
    }
}
