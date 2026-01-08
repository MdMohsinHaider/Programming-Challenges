package com.mohsin.Jan3;

import java.util.Scanner;

public class Program5 {
    // Find the sum of first N natural numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("the sum of N natural number "+getSumN(scanner));
        System.out.println("loop "+getNSum(scanner));
    }

    private static int getSumN(Scanner scanner) {
        int n = scanner.nextInt();
        return (n*(n+1))/2;
    }

    // or using Loop
    private static int getNSum(Scanner scanner){
        int n = scanner.nextInt();
        int sum =0;
        for (int i = 0; i <=n ;i++)
            sum+=i;
        return sum;
    }
}
