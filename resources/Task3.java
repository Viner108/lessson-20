package com.dmdev.lesson22.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

private class Task3 {
    private static void main(String[] args) throws IOException {
        Path path=Path.of("resources","test.txt");
        Files.readAllLines(path).stream()
                .map(Task3::findMaxDigitsCount)
                .forEach(System.out::println);
    }

    private static Integer findMaxDigitsCount(String lines) {
        int result =0;
        int counter=0;
        for (int i = 0; i < lines.length(); i++) {
            if (Character.isDigit(lines.charAt(i))){
                counter++;
            }else {
                if (result<counter){
                    result=counter;
                }
                counter=0;
            }
        }
        return result;
    }
}
