package com.LogicBuildingQues;

import java.util.*;

public class Problem6 {
    public static void main(String[] args) {
        // WAP to check if the number is a prime number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number N: ");
        int n = sc.nextInt();
//        int count = 0;
//        for(int i =1;i<=n;i++) {
//            if (n % i == 0) {
//                count += 1;
//            }
//        }
//            if(count>2){
//                System.out.println("not a prime");
//            }else{
//                System.out.println("prime number");
//            }
        // BEST APPROACH TO CHECK PRIMES
        if(n<=1){
            System.out.println("not a prime");
        }
        else{
            boolean isPrime = true;
            for (int i =2;i*i<n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime number");
            }
            else{
                System.out.println("not a prime number");
            }
        }
    }
}


