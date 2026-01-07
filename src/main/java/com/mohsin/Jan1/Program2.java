package com.mohsin.Jan1;

import java.util.Scanner;

// Check if number is positive, negative, or zero.
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();

        // if number is positive
        if (num > 0)
            System.out.println("Number is Positive");
        else if (num == 0)
            System.out.println("Number is Zero");
        else
            System.out.println("Number is Negative");

    }
}
