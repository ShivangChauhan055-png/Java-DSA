package com.Sorting;
import java.util.*;
public class Quick_Sort {
    public static void main(String[] args) {
        /*
        ***** QUICK SORT IS AN DIVIDE AND CONQUER ALGO ....
        "Why Quick Sort if we already have Merge Sort?"
        Quick Sort → No extra array space
        Just swap, use same array.
        Space Complexity O(1)

        Merge Sort → O(n) extra memory
        Har divide ke baad temporary arrays banane padte hain.
        Space Complexity O(n)
         */

        /*
Step 1: Ek element ko pivot chuno
Usually first element.

Step 2: Pivot se chhote sab left me, aur bade sab right me bhejo
Ye kaam partition function karta hai.

Step 3: Pivot apni correct sorted position par aa jaata hai
(After partition)

Step 4: Ab left wale part ko sort karo (recursively)
using same first pivot select kro and then correct order m placed kr do
Step 5: Ab right wale part ko sort karo (recursively)

Bas yehi Quick Sort hai!

In simple way ....
1. Pick a pivot and place it in its correct place and return the sorted array
2. Smaller on the left and larger on the right
and repeat

TIME COMPLEXITY = O(nlogn)
         */

        int[] arr ={7,4,1,5,3};
        quickSort(arr,0,arr.length-1);

        for(int x: arr){
            System.out.print(x+" ");
        }


    }
    public  static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p = partiton(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
    public static int partiton(int[] arr,int low,int high){
        int pivot = arr[low]; // first element is pivot
        int i =low;
        for(int j = low+1; j<=high; j++){
            if(arr[j]<=pivot) i++;

            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp;
        }
        // finally swap pivot arr[low] with arr[i]
        int temp = arr[i];
        arr[i]=arr[low];
        arr[low]=temp;

        return i; // pivot correct position
    }
}
