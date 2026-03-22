package com.srivathsan.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        //UC2
        if (args.length > 0) {
            System.out.println("Hello, " + args[0] + "!");
        } else {
            System.out.println("Hello, World!");
        }

    }
}
