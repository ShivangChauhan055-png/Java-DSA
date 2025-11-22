package com.Sorting;

public class Insertion_Sort {
    public static void main(String[] args) {
        // Insertion Sort :-
        // Take an element & place it, in its correct order.
        //simple approach every element pick up and compare then swap it

        int[] arr = {7,4,1,5,3};
        int n = arr.length;
        for(int i = 0;i<=n-1;i++){
            int j =i;
            while (j>0 && arr[j-1]>arr[j]){ // kyuki hmm j-1 index se compare krege
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int y : arr){
            System.out.print(y+" ");
        }
    }
}

// Time Complexity
/*
Worst / Average:  O(n²)
Best Case (already sorted):  O(n)

......Why Insertion Sort is better than Bubble/Selection?....
1 Best case = O(n)
2 Used in real libraries for small array sorting
3 Very efficient for nearly sorted arrays
4 Stable Sorting
5 In-place Sorting
 */
