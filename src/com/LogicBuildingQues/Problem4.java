package com.LogicBuildingQues;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //print the number in reverse order from B to A;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int A = sc.nextInt();
        System.out.print("Enter B: ");
        int B = sc.nextInt();
        //print the  even number in reverse order from B to A;
        for(int i = B ;i>=A;i--){
            if(i%2==0) {
                System.out.println(i);
            }
        }

    }
}
