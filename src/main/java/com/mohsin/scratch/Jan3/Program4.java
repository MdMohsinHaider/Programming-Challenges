package com.mohsin.Jan3;

import java.util.Scanner;

public class Program4 {
    // Print the multiplication table of a given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for table");
        int table = scanner.nextInt();
        getTable(table);
    }

    private static void getTable(int table) {
        for (int i = 1; i <=10 ; i++) {
            System.out.println(table+" x "+i+" = "+(i*table));
        }
    }
}
