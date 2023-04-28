package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class BiFunctionBiPredicatePractice {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Ankit",15000,3000);
        Timesheet t = new Timesheet(101,25);

        BiPredicate<Employee,Timesheet> p = (emp, ts) -> emp.eno == ts.eno;

        BiFunction<Employee,Timesheet, Double> f = (ep, times) -> {Double salary = 0.0;
            if (p.test(ep,times)){
                salary = ep.dailywage*times.days;
            }
            return salary;
        };

        System.out.println(f.apply(e,t));
    }


}
