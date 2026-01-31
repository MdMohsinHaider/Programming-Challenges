package com.mohsin.Jan2;

import java.util.Scanner;

public class Program5 {
    // Check whether a year is a leap year.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is leap year: "+ isLeapYear(scanner));
    }

    private static boolean isLeapYear(Scanner scanner) {

        System.out.println("Enter year");
        int year = scanner.nextInt();
        return ((year%4 == 0) && (year%100 !=0) || (year%400 ==0));
    }
}
