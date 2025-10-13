package com.Arrays;

import java.util.*;
public class Input3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // ......ARRAYS  OF PRIMITIVES.......
        int[] arr = new int[5];
        arr[0] =23;
        arr[1] =13;
        arr[2] =33;
        arr[3] =45;
        arr[4] =65;
        // [23,13,33,45,65]
        //System.out.println(arr[2]);
        //System.out.println(arr[5]);   // output: index out of bound error

        // input using for loop
//        for(int i =0;i< arr.length;i++){
//            arr[i] = in.nextInt();  // array input kro
//        }

        // METHOD 1 :- normal for loop
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


        // METHOD 2:- by for-each loop
//        for(int j:arr){
//            System.out.print(j +" ");
//        }

        // METHOD 3:- toString() method
       // System.out.println(Arrays.toString(arr));


        // .....ARRAY OF OBJECTS......

       String[] s = new String[4];
       for(int i =0;i<s.length;i++){
           s[i]= in.next();
       }
        //System.out.println(Arrays.toString(s));

       // modify
        s[1]="Shivang";
        System.out.println(Arrays.toString(s));
        // output m 1 index pe Shivang hi aaega bo fix kr diya

    }
}
