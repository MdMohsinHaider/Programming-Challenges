package com.mohsin.Jan6;

import java.util.Scanner;

public class Program8 {
    // Q. Check whether a number is a perfect number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

    }

    private static boolean isPerfectNumber(int n){
        int sum = 0;
        for (int i = 1; i <= n/2 ; i++)
            if (n%i ==0) sum = sum+i;
        return sum==n;
    }
}


