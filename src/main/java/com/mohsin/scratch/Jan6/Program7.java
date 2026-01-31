package com.mohsin.Jan6;

import java.util.Scanner;

public class Program7 {
    // Count the number of prime digits in a number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Prime Digit count is "+countPrimeNumberDigits(num));
    }

    private static int countPrimeNumberDigits(int num){
        int count = 0;
        while (num>0){
            int digit = num%10; // single digit from number
            if (digit==2 || digit==3 || digit==5 || digit==7) count++;
            num=num/10; // remove a number
        }
        return count;
    }
}
