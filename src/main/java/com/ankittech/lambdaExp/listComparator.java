package com.ankittech.lambdaExp;

import java.util.ArrayList;
import java.util.Collections;

public class listComparator {

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(20);
        li.add(320);
        li.add(40);
        System.out.println("Before" + li);
        Collections.sort(li, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
        System.out.println("After" + li);
    }
}
