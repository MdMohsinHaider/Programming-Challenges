package com.mohsin.scratch.Jan1;

import java.util.Scanner;

public class Program4 {
    // Take two numbers and print sum, difference, product, and division.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Number");

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        System.out.println("Sum => "+getSum(firstNum,secondNum));
        System.out.println("Difference => "+getDifference(firstNum,secondNum));
        System.out.println(firstNum+" divided by"+secondNum+" => "+getDivision(firstNum,secondNum));
    }

    private static int getDivision(int firstNum, int secondNum) {
        return firstNum/secondNum;
    }

    private static int getDifference(int firstNum, int secondNum) {
        if (firstNum>secondNum)
            return firstNum-secondNum;
        else if (secondNum>firstNum)
            return secondNum-firstNum;
        else
            return 0;
    }

    private static int getSum(int firstNum, int secondNum) {
        return firstNum+secondNum;
    }
}
