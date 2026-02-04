package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program4 {
    // Find the largest of three numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Largest Number is: "+ largestNumber(scanner));
    }

    private static int largestNumber(Scanner scanner){
        System.out.println("Enter three random number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        return (num1>num2 && num1>num3)?num1: (num2>num1 && num2>num3)? num2: num3;
    }
}
