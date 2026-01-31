package com.mohsin.Jan4;

import java.util.Scanner;

public class Program10 {
    // Find the second largest element in an array.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];

        for (int i =0;i<array.length;i++){
            System.out.print("Enter element: ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        // sort array in decending order

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]< array[j]){
                    int tem = array[i];
                    array[i] = array[j];
                    array[j] = tem;
                }
            }            
        }
        System.out.println("Second largest number is: "+array[1]);
    }
}
