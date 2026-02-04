package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program3 {
    // Find the largest of two numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("largest number is "+ largestNumber(scanner));
    }

    private static int largestNumber(Scanner scanner) {
        System.out.println("Enter two number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        return (num1>num2)? num1:num2;
    }
}
