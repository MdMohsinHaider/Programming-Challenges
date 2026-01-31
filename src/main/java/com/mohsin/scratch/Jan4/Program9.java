package com.mohsin.Jan4;

import java.util.Arrays;
import java.util.Scanner;

public class Program9 {
    // Sort an array in ascending order.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take a Array Size from user
        System.out.print("Enter size of array: ");
        int sizeArray = scanner.nextInt();

        // Create a Array
        int[] array = new int[sizeArray];

        // inserting elemet in array
        for (int i = 0; i <array.length ; i++) {

            // take array Elemet from user
            System.out.print("Enter element: ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        System.out.println(Arrays.toString(shortArrayAscendingOrder(array)));
    }

    private static int[] shortArrayAscendingOrder(int[] array){
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int tem = array[i];
                    array[i] =array[j];
                    array[j] = tem;
                }
            }
        }
        return array;
    }
}
