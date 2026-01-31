package com.mohsin.java8.program;

import java.util.Scanner;

public class Program7 {
    // Take a number and print its square and cube
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        double num = scanner.nextDouble();

        PowerOperation squarePower = (number -> number * number);
        PowerOperation cubePower = (number -> number * number * number);

        System.out.println(squarePower.power(num));
        System.out.println(cubePower.power(num));
    }
}
