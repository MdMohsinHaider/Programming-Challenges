package com.mohsin.scratch.Jan2;

import java.util.Scanner;

public class Program8 {
    // Calculate grade based on marks
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Grade is "+ getGrade(scanner));
    }

    private static String getGrade(Scanner scanner) {
        System.out.println("Enter marks");
        int num = scanner.nextInt();
        if (num>=90) return "A+";
        else if (num >=80) return "A";
        else if (num >= 70) return "B";
        else if (num >= 60) return "C";
        else if (num >=50) return "D";
        else if (num >= 40) return "pass";
        else if (num >=0) return "Fail";
        else return "Invalid";
    }
}
