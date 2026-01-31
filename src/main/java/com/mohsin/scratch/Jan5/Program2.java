package com.mohsin.Jan5;

import java.util.Scanner;

public class Program2 {
    // Reverse a string.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Reverse String is "+getReverse(scanner));
        scanner.close();
    }

    private static String getReverse(Scanner scanner){
        System.out.println("Enter String");
        String string = scanner.nextLine();

        String reverseString = "";

        for (int i = string.length()-1; i >= 0 ; i--) {
            char c = string.charAt(i);
            reverseString = reverseString+c;
        }
        return reverseString;
    }
}
