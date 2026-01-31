package com.mohsin.Jan6;

import java.util.Scanner;

public class Program2 {
    // Q. Find the sum of digits of a number until it becomes a single digit.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num>0){
            int n = num%10;
            sum= sum+n;
            num = num/10;
        }
        System.out.println(sum);
    }
}
