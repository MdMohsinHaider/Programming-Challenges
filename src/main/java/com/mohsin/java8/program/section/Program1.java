package com.mohsin.java8.program;

import java.util.function.Consumer;

public class Program1 {
    // Write a program to print "Hello, World!"
    public static void main(String[] args) {
        Runnable runnable = ()-> System.out.println("Hello, World");
        runnable.run();

                // or

        Consumer<String>  consumer = System.out::println;
        consumer.accept("Hello, World");

                 // or

        ((Runnable) () -> System.out.println("Hello, World")).run();




    }



}
