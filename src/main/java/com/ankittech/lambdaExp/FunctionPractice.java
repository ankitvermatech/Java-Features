package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {
    public static void main(String[] args) {
        Function<String,Integer> f = s -> s.length();
        System.out.println("Functional Interface of Function :\t "+ f.apply("Ankit"));

        // Write to get Square of Interger number
        Function<Integer,Integer> f1 = i -> i*i;
        System.out.println(f1.apply(10));

        //Remove spaces in string using Function
        Function<String,String> f2 = s -> s.replaceAll(" ","");
        System.out.println(f2.apply("Ankit Verma is a developer  ajk"));

        //Find Grade of Student
        Function<Student,String> f3 = student -> {
            int marks = student.marks;
            if(marks>=80)
                return "A[Distinction]";
            else if(marks>=60)
                return "B[First Class]";
            else if(marks>=50)
                return "C[Second CLass";
            else
                return "F[Fail}";
        };
       Student Student1 = new Student("Ankit",75);
        System.out.println(f3.apply(Student1));



        // Monthly salary of all employees

        List<Employee> l1  = new ArrayList<>();
        l1.add(new Employee(12,"Ankit",3000,3200));
        l1.add(new Employee(13,"Ajit",2500,3100));
        l1.add(new Employee(14,"Shubham",2700, 3300));
        l1.add(new Employee(15,"Indralok",2800, 3140));

        Function<List<Employee>,Double> f4 = l -> {
            double total = 0.0;
            for (Employee e1 : l) {
                total += e1.salary;
            }
            return total;
        };

        System.out.println(f4.apply(l1));
    }
}
