package com.Arrays_Algo;

/*
 Problem Name: Sort an array of 0s, 1s and 2s
 ------------------------------------------------
 Given an array consisting only of 0, 1 and 2.
 Task is to sort the array in non-decreasing order.

 Important Conditions:
 1. Sorting must be done IN-PLACE.
 2. No extra array allowed.
 3. Should be done in one pass if possible.

 Example:
 Input  : [2,0,2,1,1,0]
 Output : [0,0,1,1,2,2]

 ------------------------------------------------
 APPROACH: Dutch National Flag Algorithm

 We use three pointers:

 low  -> boundary for 0
 mid  -> current element
 high -> boundary for 2

 Regions:
 0 to low-1      -> only 0s
 low to mid-1    -> only 1s
 high+1 to end   -> only 2s
 mid to high     -> unsorted part

 Steps:
 While(mid <= high):

 If nums[mid] == 0:
    swap(low, mid)
    low++
    mid++

 If nums[mid] == 1:
    mid++

 If nums[mid] == 2:
    swap(mid, high)
    high--
    (mid not incremented because new element needs checking)

 ------------------------------------------------
 TIME COMPLEXITY: O(N)
 Single traversal of array.

 SPACE COMPLEXITY: O(1)
 No extra space used.
*/

public class Dutch_flag_algo {

    // Function to sort array of 0s, 1s and 2s
    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) {
                mid++;
            }
            else { // nums[mid] == 2
                swap(nums, mid, high);
                high--;
            }
        }
    }

    // Swap helper function
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Driver Code
    public static void main(String[] args) {

        int[] arr = {2, 0, 2, 1, 1, 0};

        sortColors(arr);

        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

