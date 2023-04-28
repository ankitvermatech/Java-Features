package com.ankittech.lambdaExp;

public class SoftwareEngineer {
    String name;
    int age;
    boolean ishavingGF;

    public SoftwareEngineer(String name, int age, boolean ishavingGF) {
        this.name = name;
        this.age = age;
        this.ishavingGF = ishavingGF;
    }

    @Override
    public String toString() {
        return name;
    }
}
