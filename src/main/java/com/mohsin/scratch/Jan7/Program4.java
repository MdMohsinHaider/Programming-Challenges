package com.mohsin.Jan7;

import java.util.Arrays;

public class Program4 {
    private static int[] allDuplicates(int[] array) {
        int[] seen = new int[array.length]; // Track numbers already checked
        int[] duplicates = new int[array.length]; // Store actual duplicates
        int seenCount = 0;
        int dupCount = 0;

        for (int j : array) {
            // If the value was already seen, it's a duplicate
            if (isPresentInArray(seen, j)) {
                // Ensure we don't add the same duplicate twice to the results
                if (!isPresentInArray(duplicates, j)) {
                    duplicates[dupCount++] = j;
                }
            } else {
                // First time seeing this number, mark it as seen
                seen[seenCount++] = j;
            }
        }
        // Return only the filled part of the array
        return Arrays.copyOf(duplicates, dupCount);
    }

    private static boolean isPresentInArray(int[] array, int value) {
        for (int element : array) {
            if (element == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 4, 7, 8, 2, 9, 45,89,45};
        System.out.println("Duplicates: " + Arrays.toString(allDuplicates(array)));
    }
}
