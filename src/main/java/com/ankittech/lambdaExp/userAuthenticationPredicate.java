package com.ankittech.lambdaExp;

import java.util.Scanner;
import java.util.function.Predicate;

public class userAuthenticationPredicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String username = sc.next();
        System.out.println("Enter Password");
        String userPass = sc.next();
        UserEmp user = new UserEmp(username, userPass);

        Predicate<UserEmp> auth = UserEmp -> UserEmp.username.equals("Ankit") && UserEmp.userPass.equals("verma");

        if(auth.test(user)){
            System.out.println("Valid User");
        }else{
            System.out.println("Invalid User");
        }



    }
}
