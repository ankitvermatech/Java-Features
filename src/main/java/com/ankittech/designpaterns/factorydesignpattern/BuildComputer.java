package com.ankittech.designpaterns.factorydesignpattern;

import java.util.Scanner;

public class BuildComputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Computer type");
        String type = sc.nextLine();

        Computer cp = ComputerFactory.getInstance(type);
        cp.getType();
        cp.getCPU();
        cp.getHDD();
        cp.getRam();
    }
}
