package com.Arrays;

public class Syntax1 {
    public static void main(String[] args) {
        /*
       ## Step 1 - Definition:

Array = ek hi type ke multiple elements ko ek single variable m store karne ka tarika.
Example: int[] arr = {10, 20, 30, 40};
Memory: continuous block me store hote hain.

==> Think of array as row of boxes:
Index:  0   1   2   3
Value: 10  20  30  40

         */

        /*
        ## Step 2 - Array Declaration & Initialization:

         1. Declaration + Memory allocation
          int[] arr = new int[5]; // size 5, default 0

         2. Declaration + Initialization
          int[] arr2 = {1, 2, 3, 4, 5};

         3. Different way
         int arr3[] = new int[3];
         arr3[0] = 10;
         arr3[1] = 20;
         arr3[2] = 30;

         */
        // Access Elements : Using index(0-based)
//        int arr[] = {1,2,3,4,5};
//        System.out.println(arr[3]);
//        System.out.println(arr[0]);


        int arr[]=new int[5];
        System.out.println(arr[3]); // output 0 becoz by default value zero hi leta h
        // [5] ka mtlb hai h [0,0,0,0,0]

        String arr1[] = new String[4];
        System.out.println(arr1[2]); // output null same as a None in python
    }
}
