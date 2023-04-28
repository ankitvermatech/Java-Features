package com.ankittech.lambdaExp;

public class runablePractice {
    public static void main(String[] args) {
        // this is one implementation
        Runnable r = ()->{
            for(int i=0; i<5;i++){
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<5;i++){
            System.out.println("Main Thread");
        }

        //Second Implementation
        Thread t1 = new Thread(()->{
            for(int i=0; i<5;i++){
                System.out.println("Child Thread");
            }
        });
        t1.start();

        for(int i=0; i<5;i++){
            System.out.println("Main Thread");
        }
    }
}
