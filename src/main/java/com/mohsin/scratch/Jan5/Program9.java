package com.mohsin.Jan5;

import java.util.Scanner;

public class Program9 {
    // Q. Create a function to check whether a number is prime.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String numric char: ");
        String string = scanner.nextLine();
        scanner.close();
        System.out.println(string+" the nume is "+checkPrime(string));
    }

    private static String checkPrime(String string){
        int n = Integer.parseInt(string);

        if (n<=1) return "not prime"; // Numbers less than 2 are not prime
        if (n==2) return "prime"; // 2 is the only even prime number
        if (n%2 ==0) return "not prime"; // Exclude all other even numbers

        // Check for factors from 3 up to the square root of the number, incrementing by 2 (odd numbers only)
        for (int i = 3; i*i <= n ; i += 2) {
            if (n%i == 0){
                return "not prime"; // // Found a factor, so it's not prime
            }
        }
        return "prime"; // No factors found, so it's prime
    }
}
