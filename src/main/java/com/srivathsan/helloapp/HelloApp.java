package com.srivathsan.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        //UC6
        String result;
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }
            String names = nameBuilder.substring(0, nameBuilder.length() - 2);
            result = names;
        }
        System.out.println("Hello, " + result + "!");
    }
}
