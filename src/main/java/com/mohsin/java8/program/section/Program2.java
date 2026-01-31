package com.mohsin.java8.program;

public class Program2 {
    // Write a program to print your name, age, and city.
    public static void main(String[] args) {
        final String name = "Md Mohsin Haider";
        final int age = 24;
        final String city = "Muzaffarpur";

        Runnable runnable = () -> System.out.println(name+" "+ age+" "+city);
        runnable.run();
    }
}
