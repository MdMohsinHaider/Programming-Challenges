package com.mohsin.Jan4;

import java.util.Scanner;

public class Program3 {
    // Find the largest element in an array.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Size of array");
        int sizeArray = scanner.nextInt();

        int[] array = new int[sizeArray];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the element in Array: ");
            int element = scanner.nextInt();
            array[i] = element;
        }

        int largestNum = array[0];

        for (int elm : array){
            if (largestNum<elm)
                largestNum = elm;
        }
        System.out.println(largestNum);
    }
}
