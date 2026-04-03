package com.srivathsan.helloapp;

public class HelloApp {
    public static void main(String[] args) {
        //UC5
        String result;
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder sb = new StringBuilder();
            for (String name : args) {
                sb.append(name).append(", ");
            }
            sb.setLength(sb.length() - 2);
            result = sb.toString();
        }
        System.out.println("Hello, " + result + "!");
    }
}
