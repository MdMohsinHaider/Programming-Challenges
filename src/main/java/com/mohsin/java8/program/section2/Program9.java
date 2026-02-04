package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program9 {
    // Check whether a person is eligible to vote
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("you are "+isEligible(scanner)+" Eligible");
    }

    private static String isEligible(Scanner scanner) {
        System.out.println("Enter Your Age");
        return (scanner.nextInt()>=18)?"✔️":"No";
    }
}
