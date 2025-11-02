package com.LogicBuildingQues;

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        //Write a function to check if a given triplet is a Pythagorean triplet or not.
        //A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(isPythagoreanTriplet(a,b,c)){
            System.out.println("Yes, it is a Pythagorean Triplets");
        }else{
            System.out.println("No, it is not a Pythagorean Triplets");
        }

    }
    static boolean isPythagoreanTriplet(int a,int b,int c) {
        int Max = Math.max(a, Math.max(b, c));
        if (Max == a) return a * a == b * b + c * c;
        else if (Max == b) return b * b == a * a + c * c;
        else return c * c == b * b + a * a;
    }
}
