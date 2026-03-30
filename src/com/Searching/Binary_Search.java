package com.Searching;

/*
========================================
        BINARY SEARCH - FULL NOTES
========================================
--> CONDITION:
- Array MUST be SORTED
- No duplicates (basic version)

----------------------------------------
--> CORE IDEA:
Divide and Conquer

Har step me search space half ho jata hai.

----------------------------------------
--> SEARCH SPACE:
low ----------- high

----------------------------------------
--> MID FORMULA:
mid = low + (high - low) / 2
(overflow avoid karne ke liye best)

----------------------------------------
--> 3 CASES:
1. nums[mid] == target → return mid
2. target > nums[mid] → RIGHT HALF → low = mid + 1
3. target < nums[mid] → LEFT HALF → high = mid - 1

----------------------------------------
--> TERMINATION:
Loop tab tak chalega:
while(low <= high)

Agar low > high → NOT FOUND

----------------------------------------
--> TIME COMPLEXITY:
O(log N)

--> SPACE:
O(1) (iterative)
O(log N) (recursive - stack)

----------------------------------------
--> IMPORTANT OBSERVATION:
Har step me search space half hota hai
→ isi liye logarithmic time

----------------------------------------
*/

public class Binary_Search {
    /*
    ========================================
            ITERATIVE BINARY SEARCH
    ========================================
    */
    public static int binarySearchIterative(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1; // Not found
    }
    /*
    ========================================
            RECURSIVE BINARY SEARCH
    ========================================
    */
    public static int binarySearchRecursive(int[] nums, int low, int high, int target) {
        // Base Case
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        else if (target > nums[mid]) {
            return binarySearchRecursive(nums, mid + 1, high, target);
        }
        else {
            return binarySearchRecursive(nums, low, mid - 1, target);
        }
    }
    /*
    ========================================
                MAIN METHOD
    ========================================
    */
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        // Iterative
        int result1 = binarySearchIterative(arr, target);
        // Recursive
        int result2 = binarySearchRecursive(arr, 0, arr.length - 1, target);
        System.out.println("Iterative Result: " + result1);
        System.out.println("Recursive Result: " + result2);
    }
}
/*
========================================
        INTERVIEW NOTES (IMPORTANT)
========================================
--> WHEN TO USE BINARY SEARCH?
- Sorted array
- Monotonic function
- Answer search (BS on answers)

----------------------------------------
--> COMMON MISTAKES:
 Using on unsorted array
 Wrong loop condition (low < high)
 Mid-overflow
 Infinite loop (low/high update wrong)

----------------------------------------
--> EDGE CASES:
- Empty array
- Single element
- Target not present
- Target at boundaries

----------------------------------------
--> ADVANCED USES:
- Lower Bound
- Upper Bound
- First & Last Occurrence
- Search in Rotated Array
- Peak Element
- Binary Search on Answer

========================================
*/


