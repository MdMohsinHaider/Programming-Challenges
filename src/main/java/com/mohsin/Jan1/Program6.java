package com.mohsin.Jan1;

import java.util.Scanner;

public class Program6 {
    // Write a program to check whether a number is even or odd.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkNumber(scanner));
    }

    private static String checkNumber(Scanner scanner){
        System.out.println("Enter the number");
        return (scanner.nextDouble()%2 == 0)?"Even":"Odd";
    }
}
