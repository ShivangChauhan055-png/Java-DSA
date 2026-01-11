package com.basic_syntax;

import java.util.*;
public class practice {
    public static void main(String[] args) {
//       sum();
//    }
//    static void sum(){
//        int a = 56;
//        int b =80;
//        int x = a+b;
//        System.out.println(x);

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean ans= isprime(n);
//        System.out.println(ans);
//
//    }
//    static boolean isprime(int n ){
//        if(n<=1) return false;
//        int c =2;
//        while(c*c<n){
//            if(c%n==0) return false;
//            c++;
//        }
//        return c*c>n;

//        int[] arr = {2,3,4,5,6,7};
////        for (int i = 0; i < arr.length; i++) {
////            System.out.print(arr[i]+" ");
//
//        for(int n : arr){
//            System.out.print(n+" ");

//        Scanner s = new Scanner(System.in);
//        int[] arr = new int[5];
//        for(int i = 0;i< arr.length;i++){
//            arr[i]= s.nextInt();
//        }
//        for(int x : arr){
//            System.out.print(x+" ");
//        }
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for(int row = 0;row< arr.length;row++){
            for(int col = 0;col< arr[row].length;col++){
                arr[row][col]= sc.nextInt();
            }
        }
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
