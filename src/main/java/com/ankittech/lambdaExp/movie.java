package com.ankittech.lambdaExp;

public class movie {
    String name;
    String result;

    public movie(String name, String result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
