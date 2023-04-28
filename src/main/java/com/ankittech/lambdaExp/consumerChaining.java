package com.ankittech.lambdaExp;

import java.util.function.Consumer;

public class consumerChaining {
    public static void main(String[] args) {
        Consumer<movie> c1 = m -> System.out.println("Movie "+m.name+" is ready.");
        Consumer<movie> c2 = m -> System.out.println("Movie "+m.name+" is just released.");
        Consumer<movie> c3 = m -> System.out.println("Movie "+m.name+" information is storing in DB "+ m.result);

        Consumer<movie> chainedC = c1.andThen(c2).andThen(c3);

        movie m1 = new movie("Bahubali","hit");

        chainedC.accept(m1);
    }
}
