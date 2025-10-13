package com.LogicBuildingQues;

import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        // print sum of even numbers and multiplication of odd numbers from A to B;
        Scanner sc = new Scanner(System.in);
        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();
        int sum =0;
        long multi = 1;
        for(int i= A;i<=B;i++){
            if(i%2==0){
                sum = sum+i;
            }else {
                multi=multi*i;
            }
        }
        System.out.println("sum is: "+ sum);
        System.out.println("multiply is: "+ multi);

    }
}
