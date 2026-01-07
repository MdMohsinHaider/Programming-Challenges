package com.mohsin.Jan1;

import java.util.Scanner;

// Calculate simple interest (PRT/100).
// SI = (P × R × T) / 100
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principal amount P");
        int p = scanner.nextInt();
        if (p <0) return;

        System.out.println("Enter Rate of interest per annum");
        int r = scanner.nextInt();
        if (r<=0) return;

        System.out.println("Enter Time the money is invested or borrowed for, in years");
        int t = scanner.nextInt();
        if (t<0) return;

        int sI = (p*r*t)/100;
        System.out.println("simple interest"+sI);

    }
}
