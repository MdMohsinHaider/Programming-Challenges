package com.mohsin.java8.program;

import java.util.Scanner;

public class Program4 {
    // Take two numbers and print sum, difference, product, and division.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Number");

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        Operation sum = (n,m)-> n+m;
        Operation difference = (n,m)-> n-m;
        Operation product = (n,m)-> n*m;
        Operation division = (n,m)-> n/m;

        System.out.println("division = " + division.apply(firstNum,secondNum));
        System.out.println("sum = " + sum.apply(firstNum,secondNum));
        System.out.println("difference = " + difference.apply(firstNum,secondNum));
        System.out.println("product = " + product.apply(firstNum,secondNum));

    }
}
