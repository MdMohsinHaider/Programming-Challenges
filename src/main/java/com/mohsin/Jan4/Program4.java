package com.mohsin.Jan4;

import java.util.Scanner;

public class Program4 {
    // Find the smallest element in an array
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Arrays size");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter Arrays Elemets");
            int element = scanner.nextInt();
            array[i] = element;
        }

        int smallestElement = array[0];

        for (int element : array){
            System.out.println(element);
            if (smallestElement > element){
                smallestElement = element;
            }
        }

        System.out.println(smallestElement);
    }
}
