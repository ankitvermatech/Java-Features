package com.ankittech.employeeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class management {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        populateList(empList);

        System.out.println("List of Employees who are from Pune");
        Predicate<Employee> p1 = emp -> emp.city.equalsIgnoreCase("Pune");
        display(p1,empList);
        System.out.println("***********************************************************");

        System.out.println("List of Employees whose designation is manager");
        Predicate<Employee> p2  = emp -> emp.designation.equalsIgnoreCase("Manager");
        display(p2,empList);
        System.out.println("***********************************************************");

        System.out.println("List of Employees whose salary is less than 70000");
        Predicate<Employee> p3 = emp -> emp.salary<70000;
        display(p3,empList);
        System.out.println("***********************************************************");

        System.out.println("List of Managers from Pune");
        display(p1.and(p2),empList);
        System.out.println("***********************************************************");

        System.out.println("Either manager or salary less than 70k ");
        display(p2.or(p3),empList);
        System.out.println("***********************************************************");

        System.out.println("Employees not managers");
        display(p2.negate(),empList);
        System.out.println("***********************************************************");
    }

    private static void populateList(List<Employee> list) {
        list.add(new Employee("Ankit","ACE",50000,"Hyderabad"));
        list.add(new Employee("Shubham","ACE",60000,"Pune"));
        list.add(new Employee("Mahesh","Manager",150000,"Pune"));
        list.add(new Employee("Madhavi","Team Lead",100000,"Bengaluru"));
        list.add(new Employee("Ankita","Designer",90000,"Delhi"));
    }

    private static void display(Predicate<Employee> p,List<Employee> list){
        for(Employee emp : list){
            if(p.test(emp)){
                System.out.println(emp);
            }
        }
    }
}
