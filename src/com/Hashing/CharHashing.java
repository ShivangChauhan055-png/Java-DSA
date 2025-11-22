package com.Hashing;

import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {
        // character hashing m bhi similar ek string di hogi
        // usme kuch queries btani hogi ki kitni baar repeat hua h
        // eg: String "abcdabefc" & Queries: a,g,h,b,c
        // for each queries count kitni baar wo character string m aaya h

        // ---SOLUTION--
        // 1.) Simple Brute Force Approach
//        Scanner in = new Scanner(System.in);
//        String s = in.next();
//        int q = in.nextInt();
//        while(q-- >0){
//            char ch = in.next().charAt(0); // query char
//            int count =0;
//            //brute force loop
//            for (int i = 0; i < s.length(); i++) {
//                if(s.charAt(i)==ch) count++;
//            }
//            System.out.println(count);
//        }
        // iski time complexity agr Q Queries h to O(Q*N) hogi isliye


        // 2.) we use optimized hashing technique

        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int[] hash = new int[256]; // store all  ASCII character
        for (int i = 0; i < x.length(); i++) {
            hash[x.charAt(i)]++;
        }
        int q = sc.nextInt();
        while (q-- >0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch]); // optimized fetch
        }
    }
    // note: character hashing m kbhi bhi prblm nhi aaegi kyuki max ch 256 hote h
    // and array can store 256 character ..

    /*
MOST IMPORTANT SUMMARY (DSA point of view)
1 Small constraints → ARRAY HASHING
fastest
O(1)

2 Big constraints → UNORDERED_MAP / HASHMAP
average O(1)
rare worst O(N)

3 Characters → 256-size array
simplest

4 Collision → chaining
map handles internally
     */
}


