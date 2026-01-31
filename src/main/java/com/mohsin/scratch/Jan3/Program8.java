package com.mohsin.Jan3;

import java.util.Scanner;

public class Program8 {
    // Reverse a number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("reverse number "+ getReverse(scanner));
    }

    private static int getReverse(Scanner scanner) {
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        String rev = "";
        while (num>0){
            int n = num%10; // get single last digit
            rev = rev+n; // concatination
            num=num/10; // remove last one digit
        }
        return Integer.parseInt(rev);
    }
}
