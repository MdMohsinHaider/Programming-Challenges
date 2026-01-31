package com.mohsin.Jan5;

import java.util.Scanner;

public class Program10 {
    // Q. Create a function to find the maximum of three numbers.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.print("maximum number :"+getMax(num1,num2,num3));
    }

    private static int getMax(int n1, int n2, int n3){
        return (n1>n2 && n1>n3)?n1:(n2>n1 && n2>n3)?n2:n3;
    }
}
