package com.mohsin.Jan5;

public class Program7 {
    // Compare two strings

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";
        String s4 = new String("Hello");
        String s5 = null;

        // 1. Check for exact content equality (case-sensitive)
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
        System.out.println(s1.equals(s4)); // true

        // 2. Check for content equality, ignoring case
        System.out.println(s1.equalsIgnoreCase(s4)); // true

        // 3. Null-safe comparison (recommended for general use)
        System.out.println(java.util.Objects.equals(s1,s5)); // false
        System.out.println(java.util.Objects.equals(s5,s5)); // true

        // 4. Check for lexicographical order
        // Returns 0 if equal, a negative value if s1 is "less than" s2, and a positive value if "greater than"
        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo("Aello")); //7


        //5. DO NOT USE `==` for content comparison
        System.out.println(s1 == s2); // true
        System.out.println(s1 ==s4); // false

    }
}
