package com.mohsin.Jan1;

import java.util.Scanner;

public class Program3 {
    // Take two numbers as input and print their sum.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(printSum(scanner));
    }

    private static int printSum(Scanner scanner) {
        System.out.println("Enter two Number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return a+b;
    }
}
