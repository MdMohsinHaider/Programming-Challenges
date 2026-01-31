package com.mohsin.scratch.Jan1;

import java.util.Scanner;

public class Program5 {
    // Write a program to check whether a number is positive or negative
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(checkNumber(scanner));
    }

    private static String checkNumber(Scanner scanner){
        System.out.println("Enter the Number");
        double integer = scanner.nextDouble();
        return (integer >= 0)?"Positive Number":"Negative Number";
    }
}
