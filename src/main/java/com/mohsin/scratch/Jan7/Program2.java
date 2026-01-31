package com.mohsin.Jan7;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {
    // Remove duplicate elements from an array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Size");
        int size = input.nextInt();

        int[] array = new int[size];
        // Insert element in Array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter Array Element " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // print
        for (int p:removeDuplicateElementsFromArray(array)){
            if (p !=0){
                System.out.println(p);
            }
        }
    }

    private static int[] removeDuplicateElementsFromArray(int[] array) {
        int[] newArray = new int[array.length];
        int j = 0;

        for (int k : array) {
            if (!containsElement(newArray, k)) {
                newArray[j] = k;
                j++;
            }
        }
        return newArray;
    }

    private static boolean containsElement(int[] array, int element) {
        for (int e: array){
            if (element == e) return true;
        }
        return false;
    }
}
