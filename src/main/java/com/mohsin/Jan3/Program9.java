package com.mohsin.Jan3;

import java.util.Scanner;

public class Program9 {
    // Check whether a number is a palindrome.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number is "+ isPalidrom(scanner)+" palindrome");
    }

    private static String isPalidrom(Scanner scanner) {
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        int revNum = revNumber(num);
        return (revNum == num)?"":"NO";
    }

    private static int revNumber(int num){
        String rev = "";
        while (num>0){
            int n = num%10;
            rev = rev+n;
            num = num/10;
        }
        return Integer.parseInt(rev);
    }
}
