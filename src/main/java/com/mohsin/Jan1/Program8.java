package com.mohsin.Jan1;

import java.util.Scanner;

public class Program8 {
    // Convert Celsius to Fahrenheit.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(celsiusToFahrenheit(scanner));
    }

    private static double celsiusToFahrenheit(Scanner scanner){
        System.out.println("Enter Celsius");
        return scanner.nextDouble()*(1.8)+32;
    }
}
