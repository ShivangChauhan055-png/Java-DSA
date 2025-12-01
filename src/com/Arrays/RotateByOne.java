package com.Arrays;

import java.util.Arrays;

public class RotateByOne {
    public static void main(String[] args) {

        // left rotate by one

//        int[] arr = {3,4,5,6,7,8};
//        int n = arr.length;
//        int temp=arr[0];
//        for (int i = 1; i < n; i++) {
//            arr[i-1]=arr[i];
//
//        }
//        arr[n-1]=temp;
//        System.out.println(Arrays.toString(arr));

        // right rotate by one
        int[] nums = {1,2,3,4,5};
        int x = nums.length;
        int temp=nums[x-1];
        for(int i = x-1;i>0;i--){
            nums[i]=nums[i-1];
        }
        nums[0]=temp;
        System.out.println(Arrays.toString(nums));
    }
}
