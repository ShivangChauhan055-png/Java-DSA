package com.Hashing;

import java.util.Scanner;

public class Hashing {
    /*
    Hashing ka matlab:
Data ko store bhi karna + usko ultra-fast speed se fetch bhi karna.

Matlab:
Pahle pre-store kar lo (frequency, info, etc.)
Baad me O(1) time me answer nikal lo
     */

    /*
    --> Frequency problem

    Array diya hota h
    int[] arr = [1,2,1,3,2];
    queries = 1,3,4,2,10 har query ka ans batao ki kitni baar aaya h
     */


    // Simple Brute Force Approach
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();   // size of an array
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=sc.nextInt();     // input of an array
//        }
//        // apply hashing to count the frequency of an elemnts in an array
//        int x= sc.nextInt();
//        int count=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==x) count++;
//        }
//        System.out.println(count);
//    }


// But iski time complexity bhut jada h agar Q queries h to O(Q*N) h jo ki bhut slow h isliye
// hmm hashing technique use krte h jo

// Optimized approach using Hashing

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt(); // array ka input
        }
        // precompute
        // hum ek hash array bnaege
        /*
        Step 1 - pre store
        --Array m jo number aata h,uska count store kr do hash[arr[i]]++
        Step 2 - fetch(O(1))
        Query --> direct hash[number] print
        No Loop needed.
         */
        int[] hash = new int[16]; // maximum size given in array
        // Frequency store karna
        for (int i = 0; i < n; i++) {
            hash[arr[i]] +=1;
        }
        // ab query bnana and fetch krna
        int q = sc.nextInt();
        while (q!=0){
            int num = sc.nextInt();   // har query m number input lo and freq print kr do
            System.out.println(hash[num]);
        }
    }
}

/*
Point to remember:
We may encounter a problem where the maximum array element may be very large like 1e9(10^9).
In that case, theoretically, we should declare an array of size 1e9+1.
But we cannot do so. The maximum size of an array can be the following:
Inside main function :
Maximum size(Integer type 10^6(1000000)
Inside Globally :
Maximum size(Integer type 10^7(10000000)

Note: So, with this method, we can solve the problems where the array is within a specific size.
 We are going to discuss later in the article, how we can overcome this limitation of the specific size.
 */



