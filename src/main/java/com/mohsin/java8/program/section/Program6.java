package com.mohsin.java8.program;

import java.util.Scanner;

public class Program6 {
    // Write a program to check whether a number is even or odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        EvenOddCheck check = num -> (num%2==0)?"Even":"Odd";
        System.out.println(check.check(number));
    }
}
