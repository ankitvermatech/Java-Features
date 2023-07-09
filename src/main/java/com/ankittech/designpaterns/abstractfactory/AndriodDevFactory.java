package com.ankittech.designpaterns.abstractfactory;

public class AndriodDevFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
