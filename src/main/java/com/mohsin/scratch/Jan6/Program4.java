package com.mohsin.Jan6;

import java.util.Scanner;

public class Program4 {
    // Q. Find the LCM and HCF of two numbers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(getHCF(num1,num2));
        System.out.println(getLCM(num1,num2));
    }

    private static int getHCF(int n1, int n2){

        while (n2 !=0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    private static int getLCM(int n1, int n2){
        int hcf = getHCF(n1,n2);
        return (n1*n2)/hcf;
    }
}
