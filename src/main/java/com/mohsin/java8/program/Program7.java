package com.mohsin.scratch.Jan1;

import java.util.Scanner;

public class Program7 {
    // Take a number and print its square and cube
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        double num = scanner.nextDouble();

        System.out.println("Square: "+getSquare(num));
        System.out.println("Cube: "+getCube(num));
    }

    private static double getSquare(double num){
        return num*num;
    }

    private static double getCube(double num){
        return (num*num)*num;
    }
}
