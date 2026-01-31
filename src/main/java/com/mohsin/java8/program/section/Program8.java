package com.mohsin.java8.program;

import java.util.Scanner;

public class Program8 {
    // Convert Celsius to Fahrenheit.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Celsius");
        double celsius = scanner.nextDouble();

        TemperatureConverter converter = n -> (n * 1.8) + 32;
        System.out.println("Fahrenheit: " + converter.convert(celsius));
    }
}
