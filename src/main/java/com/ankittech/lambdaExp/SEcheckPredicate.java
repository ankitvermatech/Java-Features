package com.ankittech.lambdaExp;

import java.util.function.Predicate;

public class SEcheckPredicate {
    public static void main(String[] args) {
        SoftwareEngineer[] list = {new SoftwareEngineer("Ankit",26,false),
                                    new SoftwareEngineer("Ajit",26,true),
                                    new SoftwareEngineer("Paras",17,false),
                                    new SoftwareEngineer("Surjit",60,false),
                                    new SoftwareEngineer("Kishor",35,true)};

        Predicate<SoftwareEngineer>  allowed = se -> se.age >= 18 && se.ishavingGF;

        for(SoftwareEngineer se : list){
            if(allowed.test(se)){
                System.out.println(se);
            }
        }

    }
}
