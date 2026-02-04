package com.mohsin.java8.program.section;

import java.util.Scanner;

public class Program5 {
    // Write a program to check whether a number is positive or negative
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();
        NumberCheck checkNum = (k)->(k>=0)?"positive":"negative";
        System.out.println(checkNum.check(num));
    }

}
