package com.ankittech.designpaterns.builder;

public class User {
    private String name;
    private String phoneNumber;

    private User(UserBuilder userbuilder){
        this.name=userbuilder.name;
        this.phoneNumber=userbuilder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static class UserBuilder{
        private String name;
        private String phoneNumber;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
