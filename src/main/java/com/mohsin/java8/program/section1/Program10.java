package com.mohsin.java8.program.section;

import java.util.Scanner;

public class Program10 {
    // Take length and breadth of a rectangle and find its area and perimeter.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lenght: ");
        double length = scanner.nextDouble();

        System.out.print("Enter Breadth: ");
        double breath = scanner.nextDouble();

        RectangleOperation area = (l, b)-> l*b;
        RectangleOperation perimeter = (l,b)-> 2*(l+b);

        System.out.println(area.calculate(length,breath));
        System.out.println(perimeter.calculate(length,breath));
    }
}
