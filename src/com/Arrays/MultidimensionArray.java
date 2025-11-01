package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        /*
        2-D Array is like an Matrix
        1 2 3
        4 5 6
        7 8 9
         */

        // Syntax......

        // Method 1;
       // int[][] arr = new int[3][];  // row ka size mention krna complusory h

        //Method 2;
//        int[][] arr2D ={
//                {1,2,3}, // 0th index
//                {4,5},   // 1st index
//                {6,7,8,9} // 2nd index
//        };

        // INPUT.....
//        int[][] mat = new int[4][3];
//        System.out.println(mat.length);
//        for (int row = 0; row < mat.length; row++) {
//            for (int col = 0; col < mat[row].length; col++) {
//                mat[row][col] = sc.nextInt();
//            }
//        }
        // OUTPUT...
        // Method 1 for loop
//        for (int row = 0; row < mat.length; row++) {
//            for (int col = 0; col < mat[row].length; col++) {
//                System.out.print(mat[row][col]+" ");
//            }
//            System.out.println(); // every row comes in new line
//        }

        // Method 2 Arrays.to String
//        for (int row = 0; row < mat.length; row++) {
//            System.out.println(Arrays.toString(mat[row]));
//        }

        // Method 3 For each loop
//        for(int[] a:mat){
//            System.out.println(Arrays.toString(a));
//        }

        int [][] aaarr = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        for(int[] a :aaarr){
            System.out.println(Arrays.toString(a));
        }
    }
}
