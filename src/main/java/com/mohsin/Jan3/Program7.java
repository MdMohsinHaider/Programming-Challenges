package com.mohsin.Jan3;

import java.util.Scanner;

public class Program7 {
    // Count the number of digits in a number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("count of digits are "+getCount(scanner));
    }

    private static int getCount(Scanner scanner) {
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int count = 0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}
