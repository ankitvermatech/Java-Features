package com.ankittech.streamspractice;

import com.ankittech.lambdaExp.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperation {
    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();
        int ids[] = {101, 102, 103, 104, 105, 106};
        String names[] = {"Amar", "Harin", "Sathya", "Annie", "Raji", "Vijji"};
        Double salary[] = {30000.0, 35000.0, 40000.0, 45000.0, 42000.0, 50000.0};
        int deptNums[] = {20, 10, 20, 20, 30, 10};
        String locations[] = {"Hyderabad", "Chennai", "Bangalore", "Hyderabad", "Pune", "Bangalore"};

        for (int i = 0; i < ids.length; i++) {
            Employees obj = new Employees(ids[i], names[i], salary[i], deptNums[i], locations[i]);
            employeesList.add(obj);
        }
//        for(Employees obj: employeesList){
//            System.out.println(obj.toString());
//        }


//        System.out.println(employeesList.stream().filter(obj -> obj.getId()==105).collect(Collectors.toList()));

//        System.out.println(employeesList.stream().filter(obj -> obj.getLocation().equalsIgnoreCase("Hyderabad")).count());

//        System.out.println(employeesList.stream().filter(obj -> (obj.getDeptNum() ==20 &&
//                                  obj.getLocation().equalsIgnoreCase("Bangalore"))).collect(Collectors.toList()));

//        System.out.println(employeesList.stream().filter(obj -> (obj.getLocation().equalsIgnoreCase("Chennai")
//                && (obj.getSalary() >= 30000 && obj.getSalary() <= 40000))).collect(Collectors.toList()));


        employeesList.stream().filter(obj -> (obj.getLocation().equalsIgnoreCase("Hyderabad")
        ||obj.getLocation().equalsIgnoreCase("Bangalore"))).forEach(System.out::println);
    }


}
