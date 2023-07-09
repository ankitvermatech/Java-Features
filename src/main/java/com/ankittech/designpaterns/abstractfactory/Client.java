package com.ankittech.designpaterns.abstractfactory;

public class Client {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndriodDevFactory());
        System.out.println(e1.name());

        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(e2.name());
    }
}
