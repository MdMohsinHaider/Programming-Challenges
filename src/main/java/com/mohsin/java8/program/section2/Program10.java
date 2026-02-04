package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program10 {
    // Create a simple calculator using switch-case.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Choose the number
                1: Add
                2: Sub
                3: mul
                4: div
                5: mod
                """);
        int option = scanner.nextByte();
        switch (option){
            case 1:
                System.out.println("Enter Two Number");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println("Enter two Number");
                int num3 = scanner.nextInt();
                int num4 = scanner.nextInt();
                System.out.println(num3-num4);
                break;
            case 3:
                System.out.println("Enter two Number");
                int num5 = scanner.nextInt();
                int num6 = scanner.nextInt();
                System.out.println(num5*num6);
                break;
            case 4:
                System.out.println("Enter two Number");
                int num7 = scanner.nextInt();
                int num8 = scanner.nextInt();
                System.out.println(num7/num8);
                break;
            case 5:
                System.out.println("Enter two Number");
                int num9 = scanner.nextInt();
                int num10 = scanner.nextInt();
                System.out.println(num9%num10);
                break;
            default:
                System.out.println("Chooses valid option");
        }

    }
}
