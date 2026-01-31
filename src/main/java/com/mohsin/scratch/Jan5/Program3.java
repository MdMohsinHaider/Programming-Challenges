package com.mohsin.Jan5;

import java.util.Scanner;

public class Program3 {
    // Check whether a string is a palindrome.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.next();
        String orignal = string;

        String reverse = "";

        for (int i = string.length()-1; i >= 0 ; i--) {
            char c = string.charAt(i);
            reverse = reverse+c;
        }

        System.out.println(orignal);
        System.out.println(reverse);

        System.out.println((orignal.equals(reverse))?"String is Palindrome":"String is not Palindrome");
    }
}
