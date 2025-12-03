package com.Searching;

import java.util.*;
public class Linear_Search {
    public static void main(String[] args) {
        /*
Linear Search — Sabse Simple Searching

Idea:
Ek-ek karke har element ko check karte jao jab tak required element mil na jaye.

Kab Use Hota Hai?
Jab array sorted nahi hota
Ya array chhota ho
Ya tumhe har element check karna hi pade

Algorithm:
Start index 0 se
Har element compare karo target se
Mil gaya → index return
End tak nahi mila → -1

Example:
Array = [5, 1, 9, 3], target = 9
5 ≠ 9
1 ≠ 9
9 = 9 → Found at index 2

Time Complexity:
Worst = O(n)
Best = O(1) (agar first hi element match ho)
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("enter target ele: ");
        int num = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println(-1);
    }
}
