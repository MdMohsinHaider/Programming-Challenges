package com.mohsin.Jan6;

import java.util.Scanner;

public class Program5 {
    // Print the Fibonacci series up to N terms.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n term number: ");
        int nTerm = scanner.nextInt();

        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i <nTerm ; i++) {

            System.out.print(firstTerm+" ");
            int nextTerm = firstTerm+secondTerm;

            // update first and second term
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
