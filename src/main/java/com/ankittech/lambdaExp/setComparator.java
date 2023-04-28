package com.ankittech.lambdaExp;

import java.util.Set;
import java.util.TreeSet;

public class setComparator {
    public static void main(String[] args) {
        Set<Integer> intTS = new TreeSet<Integer>();
        intTS.add(20);
        intTS.add(25);
        intTS.add(15);
        intTS.add(10);
        intTS.add(30);
        System.out.println(intTS);

        Set<Integer> intTSwithComp = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
        intTSwithComp.add(20);
        intTSwithComp.add(25);
        intTSwithComp.add(15);
        intTSwithComp.add(10);
        intTSwithComp.add(30);

        System.out.println(intTSwithComp);

    }
}
