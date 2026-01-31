package com.mohsin.Jan5;

import java.util.Scanner;

public class Program8 {
    // Create a function to add two numbers digits.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Numric String");
        String string = scanner.nextLine(); // 23

        int sum = 0;
        char[] chars = string.toCharArray();

        for (char aChar : chars) {
            sum = sum + (aChar-'0');
        }
        System.out.println(sum);
    }
}
