package com.ankittech.designpaterns.abstractfactory;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        return 50000;
    }

    @Override
    public String name() {
        return "I am a Andriod Developer";
    }
}
