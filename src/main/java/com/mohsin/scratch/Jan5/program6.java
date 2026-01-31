package com.mohsin.Jan5;

import java.util.Scanner;

public class program6 {
    // Convert string to uppercase and lowercase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String string = scanner.nextLine();

        System.out.println(getUppercase(string));
        System.out.println(getLowercase(string));
    }

    private static String getUppercase(String string) {

        String temp = "";

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);   // ✅ correct conversion
            }
            temp = temp + c;           // ✅ append character
        }
        return temp;
    }

    private static String getLowercase(String string) {

        String temp = "";

        for (int i = 0; i <string.length() ; i++) {
            char c = string.charAt(i);

            if (c >= 'A' && c<= 'Z'){
                c = (char) (c+32);
            }
            temp = temp+c;
        }

        return temp;
    }
}
