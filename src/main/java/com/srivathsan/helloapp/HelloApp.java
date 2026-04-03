package com.srivathsan.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        //UC7
        String result;
        if (args.length == 0) {
            result = "World";
        } else {
            result = String.join(", ", args);
        }
        System.out.println("Hello, " + result + "!");
    }
}
