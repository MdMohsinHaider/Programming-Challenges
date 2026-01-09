package com.mohsin.Jan4;

import java.util.Arrays;

public class Program6 {
    // Copy elements from one array to another.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};

        int[] copyArray = new int[array.length];

        for (int i = 0; i<array.length;i++){
            copyArray[i] = array[i];
        }

        // print
        System.out.println(Arrays.toString(copyArray));

        for (int element: copyArray){
            System.out.println(element);
        }





        // or
        int[] copyArray2 = new int[array.length];
        System.arraycopy(array,0,copyArray2,0,copyArray2.length);
        for (int i : copyArray2){
            System.out.print(i+" ");
        }
    }
}
