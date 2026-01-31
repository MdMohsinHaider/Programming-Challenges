package com.mohsin.Jan7;

public class Program3 {
    // Find the missing number in an array of 1 to N

    private static int findMissingNumber(int[] array, int n) {
        int expectedSum = n*(n+1)/2;

        int actualSum = 0;
        for (int j: array) {
            actualSum += j;
        }

        System.out.println("expectedSum: " + expectedSum);
        System.out.println("actualSum: " + actualSum);
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("findMissingNumber: "+findMissingNumber(array, 6));
    }
}
