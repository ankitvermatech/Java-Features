package com.ankittech.designpaterns.factorydesignpattern;

public class ComputerFactory {
    public static Computer getInstance(String type){
        if(type.equalsIgnoreCase("PC"))
            return new PC();
        else if (type.equalsIgnoreCase("Server"))
            return new Server();
        else
            throw new IllegalArgumentException("No Supported type of computer to build");
    }
}
