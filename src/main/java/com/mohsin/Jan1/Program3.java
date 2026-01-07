package com.mohsin.Jan1;

import java.util.Scanner;

// Sum even numbers from 1 to user-input N.
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i%2 == 0)
                sum +=i;
        }
        System.out.println("Sum of even number is " +sum);
    }
}
