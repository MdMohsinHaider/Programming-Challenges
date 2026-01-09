package com.mohsin.Jan4;

import java.util.Scanner;

public class Program8 {
    // Search an element in an array.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("Enter elemnet: ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        System.out.println("Enter search element: ");
        int elementSearch = scanner.nextInt();
        System.out.println("Your Element is "+getSearch(elementSearch,array));
    }

    private static int getSearch(int elementSearch, int[] array){
        for (int elemnet : array) {
            if (elemnet == elementSearch)
                return elemnet;
        }
        return 0;
    }
}
