package com.Sorting;
import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        /*
Selection Sort --
Har iteration me minimum element dhoondo aur usko sahi position par swap kar do.
ex- Array: [7,4,1,3]
Step 1: index 0 ke liye
Smallest = 1
swap → [1, 4, 7, 3]

Step 2: index 1 ke liye
Remaining: [4, 7, 3]
Smallest = 3
swap → [1, 3, 7, 4]

Step 3: index 2 ke liye
Remaining: [7, 4]
Smallest = 4
swap → [1, 3, 4, 7]

Sorted!
         */
        int[] arr = {13,46,24,52,20,9};
        int n = 6;
        for (int i = 0; i <=n-2; i++) {
            int min = i;
            for(int j = i;j<=n-1;j++){
                if(arr[j]<arr[min]) min =j;
            }
            int temp  = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        // final sorted array print
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

// Time Complexity is [n(n+1)]/2 == O(n*n)
