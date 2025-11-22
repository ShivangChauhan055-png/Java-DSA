package com.Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        /*
Bubble sort me bade element ko bubble ki tarah last me bhejte hain
Har pass me:
Adjacent elements compare hote hain
Agar order galat hai → swap
End me largest element apni correct position pe chale jata hai
Isko “Bubble” isliye kehte hain kyunki bada element bubble ki tarah upar (end) chala jata hai.

Proper defination : In bubble sort push the max element to the last by adjacent swaps
         */
        int[] arr = {13,46,24,52,20,9};
        int n  = 6;
        for(int i = n-1;i>0;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        // after apply bubble sort print the sorting array
        for(int x:arr) {
            System.out.print(x + " ");
        }
    }
}


// Time complexity is : [n(n+1)]/2 == O(n*n) this is wrost case
// if is an array is already given in sorted form like
// arr= {1,2,3,4,5} uss case break condition lga do and time complexity is O(n)
// hence in bubble sort best time complexity is O(n)