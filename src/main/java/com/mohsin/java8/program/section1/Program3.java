package com.mohsin.java8.program.section;

import java.util.Scanner;

public class Program3 {
    // Take two numbers as input and print their sum.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         SumOperation sum = (scanner)->{
             System.out.println("Enter an integer");
             int a = sc.nextInt();
             int b = sc.nextInt();
             return a+b;
         };
        System.out.println(sum.calculate(sc));
    }
}
