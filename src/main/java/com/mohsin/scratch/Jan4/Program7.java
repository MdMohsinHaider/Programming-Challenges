package com.mohsin.Jan4;

import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
    // Reverse an array

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int arraySize = scanner.nextInt();

        int[] array =new int[arraySize];

        for (int i = 0; i <array.length ; i++) {
            System.out.print("Enter Element: ");
            int elemnet = scanner.nextInt();
            array[i] = elemnet;
        }
        System.out.println("Before :"+Arrays.toString(array));
        
        // revese the array
        for (int i = 0; i <array.length/2 ; i++) {
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }

        System.out.println("After: "+Arrays.toString(array));
    }
}
