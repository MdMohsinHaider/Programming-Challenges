package com.mohsin.Jan6;

import java.util.Scanner;

public class Program1 {
    // Print all prime numbers between 1 and N
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N number");
        int n = scanner.nextInt();

        for (int i = 0; i <=n ; i++) {
            if (isPrime(i))
                System.out.print(i+", ");
        }
    }

    private static boolean isPrime(int n){

        if (n<=1) return false;
        if (n==2) return true;
        if (n%2==0) return false;

        for (int i = 3; i*i <n ; i+=2) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
