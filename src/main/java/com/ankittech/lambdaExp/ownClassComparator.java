package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ownClassComparator {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(200,"Ankit",1,3200));
        employeeList.add(new Employee(20,"Ankita",2,3100));
        employeeList.add(new Employee(120,"Ankur",3,4300));
        employeeList.add(new Employee(19,"Abhishek",4,3400));

        Collections.sort(employeeList,(e1,e2)->(e1.eno>e2.eno)?1:(e1.eno<e2.eno)?-1:0);
        System.out.println("Based on eno :" +employeeList);
        Collections.sort(employeeList,(e1,e2)->(e1.ename.compareTo(e2.ename)));
        System.out.println("Based on ename :" +employeeList);
    }
}
