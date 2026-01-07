package com.mohsin.Jan1;

import java.util.Scanner;

// Print numbers 1 to N in reverse with step 2.
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N number");
        int n = scanner.nextInt();

        for (int i = n; i >=1 ; i--)
            System.out.println(i);
    }
}
