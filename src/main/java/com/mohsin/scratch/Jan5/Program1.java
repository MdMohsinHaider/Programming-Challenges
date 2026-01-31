package com.mohsin.Jan5;

import java.util.Scanner;

public class Program1 {
    // Print the length of a string.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String lenght is: "+getLenght(scanner));
    }

    private static int getLenght(Scanner scanner) {

        System.out.println("Enter String");
        String string = scanner.nextLine();

        int count = 0;

        for (char c : string.toCharArray()) {
            count++;
        }
        return count;
    }
}
