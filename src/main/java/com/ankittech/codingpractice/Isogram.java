package com.ankittech.codingpractice;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    //Isogram is that word which does not have any repeating letter in it.

    public static void main(String[] args) {
        System.out.println(isIsogram("CodeDecode"));
    }
    static boolean isIsogram(String s){
        char[] charArray = s.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for(Character ch : charArray){
            if(characterSet.contains(ch)){
                return false;
            }else{
                characterSet.add(ch);
            }
        }
        return true;
    }
}
