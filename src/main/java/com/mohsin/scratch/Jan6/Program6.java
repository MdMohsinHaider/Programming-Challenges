package com.mohsin.Jan6;

import java.util.Scanner;

public class Program6 {
    // Q. Find the Nth Fibonacci number using a function
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        scanner.close();
        int firstTerm = 0, secondTerm = 1;

        printFibonacciSeries(num,firstTerm,secondTerm);
    }

    private static void printFibonacciSeries(int nTerm, int firstTerm, int secondTerm){

        for (int i = 0; i < nTerm; i++) {
            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm + secondTerm;

            // update the data firstTeaem and secondTerm after getting nextTerm
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
