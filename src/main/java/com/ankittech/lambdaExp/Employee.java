package com.ankittech.lambdaExp;

public class Employee {

    int eno;
    String ename;

    double salary;
    double dailywage;

    public Employee(int eno, String ename, double salary, double dailywage) {
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
        this.dailywage = dailywage;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename +
                ", dailyWage='" + dailywage +
                ", salary='" + salary +'\'' +
                '}';
    }
}
