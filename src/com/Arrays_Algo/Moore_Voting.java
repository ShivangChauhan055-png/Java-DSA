package com.Arrays_Algo;

/*
 Problem Name: Majority Element
 -----------------------------------------
 Given an array of size N, find the element
 that appears more than N/2 times.

 It is guaranteed that majority element exists.

 Example:
 Input  : [2,2,1,1,1,2,2]
 Output : 2

 -----------------------------------------
 APPROACH: Moore’s Voting Algorithm (Striver)

 Idea:
 If an element appears more than N/2 times,
 it will survive after cancelling out all
 other elements.

 We maintain:

 candidate -> possible majority element
 count     -> frequency balance

 Steps:

 1. Initialize:
    candidate = 0
    count = 0

 2. Traverse array:
    - If count == 0:
         candidate = current element

    - If current element == candidate:
         count++

    - Else:
         count--

 3. After loop, candidate holds majority element.

 Why it works?
 Majority element occurs more than N/2 times,
 so even after cancelling with other elements,
 it will remain.

 -----------------------------------------
 TIME COMPLEXITY: O(N)
 Single traversal.

 SPACE COMPLEXITY: O(1)
 Constant extra space.
*/

public class Moore_Voting {

    // Function to find majority element
    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                candidate = nums[i];
            }

            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate; // majority element
    }

    // Driver code
    public static void main(String[] args) {

        int[] arr = {2,2,1,1,1,2,2};

        int ans = majorityElement(arr);

        System.out.println("Majority Element: " + ans);
    }
}

