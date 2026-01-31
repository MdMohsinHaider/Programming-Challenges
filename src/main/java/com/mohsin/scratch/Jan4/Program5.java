package com.mohsin.Jan4;

import java.util.Scanner;

public class Program5 {
    // Count even and odd numbers in an array.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of Array: ");
        int sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i <array.length ; i++) {
            System.out.print("Enter the element: ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        for (int element : array){
            if (element%2 ==0)
                evenCount++;
            else oddCount++;
        }

        System.out.println("Even Number count in Array: "+evenCount);
        System.out.println("Odd number count in Array: "+oddCount);
    }
}
