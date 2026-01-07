package com.mohsin.Jan1;

import java.util.Scanner;

// Swap two numbers without temp variable.
public class Program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1 - num2;
        System.out.println(num1 +" "+ num2);
    }
}
