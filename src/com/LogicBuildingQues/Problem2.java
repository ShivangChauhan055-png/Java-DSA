package com.LogicBuildingQues;

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        // print number A to B
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter A: ");
//        int A = sc.nextInt();
//        System.out.print("Enter B: ");
//        int B = sc.nextInt();
//        for(int i = A ;i<=B;i++){
//            System.out.println(i);
//        }

        // print even number between A to B
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        for(int i = A ;i<=B;i++){
            if(i%2==0) {
                System.out.println(i);
            }
        }

    }
}
