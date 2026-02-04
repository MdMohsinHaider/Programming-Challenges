package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program7 {
    // Check whether a number is a 3-digit number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("is Number 3 Digits "+ isNumber3Digit(scanner));
    }

    private static boolean isNumber3Digit(Scanner scanner) {
        int num = scanner.nextInt();
        int count = 0;

        while (num>0){
            num= num/10;
            count++;

            if (count >3) return false;
        }
        return count == 3;
    }
}
