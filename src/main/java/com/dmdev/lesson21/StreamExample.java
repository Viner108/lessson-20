package com.dmdev.lesson21;

import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = List.of("88","11", "22", "33", "44", "55","66");
        IntSummaryStatistics intSummaryStatistics=
        strings.stream()
                .map(string->string+string)
                .map(Integer::valueOf)
                .filter(value->value%2==0)
                .sorted()
//                .skip(1)
                .limit(2)
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
//        List<String> collect = Stream.of("88", "11", "22", "33", "44", "55", "66")
//                .peek(System.out::println)
//                .collect(Collectors.toList());
//        IntStream.range(0,10)
//                .forEach(System.out::print);
        IntStream.iterate(0, operand -> operand+3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(i);
//        }
//        for (String string : strings) {
//            String value=string+string;
//            Integer inValue=Integer.valueOf(value);
//            if (inValue%2==0){
//                System.out.println(inValue);
//            }
//        }
    }
}
