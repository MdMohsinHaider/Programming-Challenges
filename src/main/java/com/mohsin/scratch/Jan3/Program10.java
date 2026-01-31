package com.mohsin.Jan3;

import java.util.Scanner;

public class Program10 {
    //Check whether a number is an Armstrong number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = scanner.nextInt();
        System.out.println("Is Number is Armstrong Number: "+isArmstrongNumber(num));

    }

    // find number of tota nume of digits count
    private static int getCount(int num){
        int count = 0;
        while (num>0){
            num=num/10;
            count++;
        }
        return count;
    }

    // digits count multiple and sum
    private static boolean isArmstrongNumber(int num){
        int orignalNum = num;
        int digitCount = getCount(num);
        int sum = 0;

        while (num>0){
            int n = num%10;
            int multi = 1;
            for (int i = 1; i <= digitCount; i++) {
                multi=multi*n;
            }
            sum = sum+multi;
            num=num/10;
        }
        // comapre sum with origanl number
        return sum == orignalNum;
    }

}
