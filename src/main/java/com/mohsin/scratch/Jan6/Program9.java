package com.mohsin.Jan6;

import java.util.Scanner;

public class Program9 {
    // Q. Print all factors of a given number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        getAllFactor(num);
    }

    private static void getAllFactor(int n){
        for (int i = 1; i <=n/2 ; i++)
            if (n%i == 0) System.out.print(i+" ");
        System.out.print(n);
    }
}
