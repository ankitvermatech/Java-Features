package com.ankittech.streamspractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurCount {
    public static void main(String[] args) {

        System.out.println("This is without Java 8 stream feature");
        String str = "My name is Ankit and i am a Software developer learning java 8, Ankit is trying very hard";
        List<String> strList = Arrays.asList(str.split(" "));
        System.out.println(strList);
        Map<String, Integer> countMap = new HashMap<>();
        int count =1;

        for(String s : strList){
            if(!countMap.containsKey(s)){
                countMap.put(s,1);
            }
            else if(countMap.containsKey(s)){
                int val = countMap.get(s);
                countMap.put(s,val+1);
            }
        }
        System.out.println(countMap);

        System.out.println("Now using java 8 feature");
        Map<String,Long> newMap = strList.stream()
                                  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(newMap);
    }
}
