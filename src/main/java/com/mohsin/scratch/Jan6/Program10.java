package com.mohsin.Jan6;

import java.util.Scanner;

public class Program10 {
    // Find the power of a number without using built‑in functions
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int n2 = scanner.nextInt();
        System.out.println(getPower(n1,n2));
    }
    private static int getPower(int base, int exponent) {
        int power = 1;

        if (exponent<0) {
            exponent = -exponent;
            for (int i = 0; i < exponent; i++)
                power *= base;
        }

        for (int i = 0; i <exponent ; i++)
            power*=base;
        return power;
    }
}
