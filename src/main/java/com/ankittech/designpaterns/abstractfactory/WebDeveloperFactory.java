package com.ankittech.designpaterns.abstractfactory;

public class WebDeveloperFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
