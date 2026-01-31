package com.mohsin.Jan3;

import java.util.Scanner;

public class Program6 {
    // Find the factorial of a number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("factorial of number is "+getFactorial(scanner));
    }

    private static int getFactorial(Scanner scanner) {
        System.out.println("Enter the number");
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        return fact;
    }
}
