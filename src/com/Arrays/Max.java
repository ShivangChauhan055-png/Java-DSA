package com.Arrays;

public class Max {
    public static void main(String[] args) {
//        int[] arr = {2,34,25,42,65,12,3};
//        System.out.println(max(arr));
//    }
//    static int max(int[] arr){
//        int MaxVal=arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>MaxVal){
//                MaxVal=arr[i];
//            }
//        }
//        return(MaxVal);

        // find maximum value in a range
        int[] a ={2,4,1,5,9,6,7};
        System.out.println(maxRange(a,2,5));
    }
    static int maxRange(int[] arr,int start,int end){
        int maximum = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
