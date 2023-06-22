package com.dmdev.lesson21;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88","11", "22", "33", "44", "55","66");
        strings.stream().map(string->string+string).map(Integer::valueOf).filter(value->value%2==0).sorted().skip(1).limit(2).forEach(System.out::println);
//        for (String string : strings) {
//            String value=string+string;
//            Integer inValue=Integer.valueOf(value);
//            if (inValue%2==0){
//                System.out.println(inValue);
//            }
//        }
    }
}
