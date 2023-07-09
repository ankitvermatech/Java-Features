package com.ankittech.codingpractice;

import java.util.*;

public class FindDuplicates {

    public static void main(String[] args) {
        List<Integer> duplist = new ArrayList<>();
        Set<Integer> set2 = new HashSet<>();
        int[] arr = {0,3,1,2};
        int[] arr2 = {2,3,1,2,3};
        int[] arr3 = {13,9,25,1,1,0,22,13,22,20,3,8,11,25,10,3,15,11,19,20,2,4,25,14,23,14};
        for (int num : arr3) {
            if (!set2.add(num) && !duplist.contains(num)) {
                duplist.add(num);
            }
    }

            if(duplist.isEmpty()) {
                duplist.add(-1);
            }
        Collections.sort(duplist);

        System.out.println("Set2 " + set2);
        System.out.println("dup list " +duplist);
    }
}
