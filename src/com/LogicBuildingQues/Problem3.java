package com.LogicBuildingQues;

import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        // print sum of numbers A to B
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        int sum =0;
        for(int i=A;i<=B;i++){
            // print sum of even numbers from A to B
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
