package com.ankittech.designpaterns.builder;

public class BuilderDesignPattern {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
                .setName("Ankit Verma").setPhoneNumber("9650534894").build();
        System.out.println(user1.getName());
        System.out.println(user1.getPhoneNumber());

        User user2 = new User.UserBuilder()
                .setName("Ankur Verma").build();
        System.out.println(user2.getName());
    }

}
