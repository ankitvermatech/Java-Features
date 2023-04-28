package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class predicateandFunction {
    public static void main(String[] args) {

        List<Employee> l1  = new ArrayList<>();
        l1.add(new Employee(12,"Ankit",3000,3200));
        l1.add(new Employee(13,"Ajit",2500,3100));
        l1.add(new Employee(14,"Shubham",2700, 3300));
        l1.add(new Employee(15,"Indralok",2800, 3140));

        List<Employee> l2 = new ArrayList<>();

        Predicate<Employee> p = employee -> employee.salary < 2850;
        Function<Employee,Employee> f = employee -> {
            employee.salary += 447;
            return employee;
        };
        for (Employee e1 : l1) {
            if(p.test(e1)) {
                f.apply(e1);
                l2.add(e1);
            }
        }
        System.out.println(l2);
    }
}
