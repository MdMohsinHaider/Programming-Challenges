package com.mohsin.scratch.Jan1;

import java.util.Scanner;

public class Program10 {
    // Take length and breadth of a rectangle and find its area and perimeter.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lenght ");
        double length = scanner.nextDouble();

        System.out.println("Enter Breadth ");
        double breath = scanner.nextDouble();

        System.out.println("Area: "+getArea(length,breath));
        System.out.println("Perimeter: "+getPerimeter(length,breath));
    }

    private static double getArea(double lenght, double breath){
        return lenght*breath;
    }

    private static double getPerimeter(double lenght, double breath){
        return 2*(lenght+breath);
    }
}
