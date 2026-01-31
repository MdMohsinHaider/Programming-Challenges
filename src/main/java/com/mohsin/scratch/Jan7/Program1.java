package com.mohsin.Jan7;

public class Program1 {
    // Find the frequency of each element in an array
    public static void main(String[] args)
    {
        int[] array={12, 13, 34, 12, 20, 12, 23, 34, 12, 20};
        printfrequency(array);
    }
    public static void printfrequency(int[] array){
        int n=array.length;

        for(int i=0;i<n;i++){

            int count=1;

            for(int j=i+1;j<n;j++){

                if(array[i] == array[j]){
                    count++;
                    array[j]=array[n-1];
                    n--;	j--;
                }
            }
            System.out.println(array[i]+" is: "+count+" times");
        }
    }
}
