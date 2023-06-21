package com.dmdev.lesson20.exception;

public class Task1 {
    public static void main(String[] args) {
        String value=null;
        try {
            value.length();
        }catch (NullPointerException exception){
            System.err.println("Catch");
            exception.printStackTrace();
        }
    }
}
