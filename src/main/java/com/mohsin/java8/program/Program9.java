package com.mohsin.scratch.Jan1;

import java.util.Scanner;

public class Program9 {
    // Convert Fahrenheit to Celsius
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getFahrenheitToCelsius(scanner));
    }

    private static double getFahrenheitToCelsius(Scanner scanner) {
        System.out.println("Enter Fahrenheit");
        return ((scanner.nextDouble()-32)/(1.8));
    }
}
