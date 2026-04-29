package com.assignments;

import java.util.Arrays;

public class ArrayEX {
    public static void main(String[] args) {
    	
    	//copy all the elements of on array to another
        int[] original = {5, 2, 8, 2, 1, 5, 2};
        int n = original.length;

        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }
        System.out.println("Copied Array: " + Arrays.toString(copy));
        
      
  
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (original[i] == original[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(original[i] + " occurs " + count + " times");
        }
       // Program to print the elements of an array in reverse order
        
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        
//        21) Program to print the elements of an array present on even
//
//        position
//
//      22) Program to print the elements of an array present on odd position
        
        
        System.out.print(" Even Positions");
        for (int i = 1; i < n; i += 2) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("Odd Positions ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(original[i] + " ");
        }
        System.out.println();
        
        

     // 23) Prgram to print the sum of all elements in array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += original[i];
        }
        System.out.println("Total sum is: " + sum);

        // 24) Program to sort elements in asending order
        int[] asc = original.clone();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (asc[i] > asc[j]) {
                    int temp = asc[i];
                    asc[i] = asc[j];
                    asc[j] = temp;
                }
            }
        }
        System.out.println("Sorted small to big: " + Arrays.toString(asc));

        // 25) Program to sort elements in decending order
        int[] desc = original.clone();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (desc[i] < desc[j]) {
                    int temp = desc[i];
                    desc[i] = desc[j];
                    desc[j] = temp;
                }
            }
        }
        System.out.println("Sorted big to small: " + Arrays.toString(desc));

        // 26) Swap two array with temp varible
        int[] arr1 = {10, 20};
        int[] arr2 = {30, 40};
        int[] tempArr = arr1;
        arr1 = arr2;
        arr2 = tempArr;
        System.out.println("Swapped 2: arr1 is now " + Arrays.toString(arr1));

        // 27) Swap three array with temp varible
        int[] a = {1}, b = {2}, c = {3};
        int[] t = a;
        a = b;
        b = c;
        c = t;
        System.out.println("Swapped 3: a is " + a[0] + ", b is " + b[0] + ", c is " + c[0]);
    }
}