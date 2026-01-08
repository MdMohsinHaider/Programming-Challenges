package com.mohsin.Jan2;

import java.util.Scanner;

public class Program1 {
    // Check whether a number is divisible by 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number divisible by 5: "+isNumberDivisible(scanner));
    }

    private static boolean isNumberDivisible(Scanner scanner) {
        System.out.println("Enter Number");
        return scanner.nextInt() % 5 == 0;
    }
}
