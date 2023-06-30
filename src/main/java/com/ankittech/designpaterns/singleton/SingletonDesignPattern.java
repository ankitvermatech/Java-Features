package com.ankittech.designpaterns.singleton;

public class SingletonDesignPattern {
    private SingletonDesignPattern(){}

    private static SingletonDesignPattern instance = null;

    public static SingletonDesignPattern getInstance(){
        if(instance == null){
            instance = new SingletonDesignPattern();
        }
        return instance;
    }
}
