package com.mohsin.Jan6;

import java.util.Scanner;

public class Program3 {
    // Q. Check whether a number is a strong number.
    public static void main(String[] args) {

        // Compare: If the sum (145) matches the original number (145), then it's a strong number.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scanner.nextInt();

        System.out.println(
                (num==getSumFactorials(num))?"number is a strong number":"number is not a strong number"
        );
    }

    // Sum the factorials
    private static int getSumFactorials(int n){
        int sum =0;
        while (n>0){
            // get one digits
            int digit = n%10;
            int factorial = 1;
            // calculate factorial
            for (int i = digit; i >0 ; i--) {
                factorial= factorial*i;
            }
            sum= sum+factorial;
            // remove digit
            n=n/10;
        }
        return sum;
    }
}
