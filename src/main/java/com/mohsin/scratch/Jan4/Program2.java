package com.mohsin.Jan4;

public class Program2 {
    // Find the sum of array elements.
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;
        for (int i : array){
            sum=sum+i;
        }
        System.out.println("the sum of array elements are: "+sum);
    }

}
