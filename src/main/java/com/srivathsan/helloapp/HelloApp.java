package com.srivathsan.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        //UC4
        String names;
        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }
        System.out.println("Hello, " + names + "!");
    }
}
