package com.mohsin.Jan5;

import java.util.Scanner;

public class Program4 {
    // Count the number of vowels in a string.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = scanner.nextLine().toLowerCase();

        char[] array = string.toCharArray(); // (1.)
        int count = 0;

        for (char c : array){
            if (c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }

        System.out.println("The number of vowels in a string is "+count);
    }
}
