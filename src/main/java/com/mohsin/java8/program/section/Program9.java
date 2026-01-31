package com.mohsin.java8.program;

import java.util.Scanner;

public class Program9 {
    // Convert Fahrenheit to Celsius
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        TemperatureConverter converter = f-> (f - 32) / 1.8;
        System.out.println("Fahrenheit: " + converter.convert(fahrenheit));
    }
}
