package com.mohsin.Jan5;

public class Program5 {
    // Count words in a string
    public static void main(String[] args) {
        String string = "Md Mohsin Haider a Java devloper";

        int count = 1;

        for (int i = 0; i <string.length() ; i++) {
            char  c = string.charAt(i);
            if (c == 32){
                count++;
            }
        }

        System.out.println(count);
    }
}
