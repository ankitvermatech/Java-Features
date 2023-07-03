package com.ankittech.designpaterns.factorydesignpattern;

public class Server implements Computer{

    @Override
    public void getType() {
        System.out.println("Hi, Server is on the way to be build");
    }

    @Override
    public void getRam() {
        System.out.println("Hi, I need 16 GB RAM");
    }

    @Override
    public void getHDD() {
        System.out.println("Hi, I need 512 GB HDD");
    }

    @Override
    public void getCPU() {
        System.out.println("Hi, I need 16 Core CPU");
    }
}
