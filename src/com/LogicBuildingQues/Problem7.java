package com.LogicBuildingQues;

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

        // To calculate Fibonacci Series up to n numbers.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Terms: ");
        int n = sc.nextInt();
        int a =0,b=1;
        System.out.println("Fibonacci Series: ");
        for(int i =1;i<=n;i++){
            System.out.print(a+" ");
            int temp = a+b;
            a=b;
            b=temp;
        }
    }
}
