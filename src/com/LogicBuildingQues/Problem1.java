package com.LogicBuildingQues;


import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // print number from 1 to 10;
        // print number from 1 to N;
        Scanner in = new Scanner(System.in);
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(i);
//        }
        System.out.print("Enter the N : ");
        int N = in.nextInt();
        for(int i =1;i<=N;i++){
            System.out.println(i);
        }

    }
}
