package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program6 {
    // Check whether a character is a vowel or consonant.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Character is: "+ isCheckCharacter(scanner));
    }

    private static String isCheckCharacter(Scanner scanner) {
        System.out.println("Enter a character");
        char c = scanner.next().toLowerCase().charAt(0);
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')?"vowel":"Consonat";
    }
}
