package com.ankittech.designpaterns.factorydesignpattern;

public class PC implements Computer{

    @Override
    public void getType() {
        System.out.println("Hi, PC is on the way to be build");
    }

    @Override
    public void getRam() {
        System.out.println("Hi, I need 8 GB RAM");
    }

    @Override
    public void getHDD() {
        System.out.println("Hi, I need 512 GB SSD");
    }

    @Override
    public void getCPU() {
        System.out.println("Hi, I need 8 Core CPU");
    }
}
