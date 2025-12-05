package com.Arrays_Algo;

// Kadane_Algo.java
// Max Subarray Sum (LeetCode 53)
// Includes: Brute Force (O(n^3)), Better (O(n^2)), Kadane's Optimized (O(n))

public class Kadane_Algo {

    // ------------ MAIN METHOD (optional for testing) ------------
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Kadane_Algo obj = new Kadane_Algo();
        System.out.println(obj.maxSubArray(nums));   // Output: 6
    }

    // ------------ MAX SUBARRAY METHOD ------------
    public int maxSubArray(int[] nums) {

        /*----------------------------------------------------------
         *  1) BRUTE FORCE APPROACH (O(n^3))
         *----------------------------------------------------------
         * IDEA:
         *  - Har possible subarray generate karo (i to j)
         *  - Ek aur loop se sum calculate karo
         *  - Maximum sum store karo
         *
         * TIME:  O(n^3)
         * SPACE: O(1)
         *----------------------------------------------------------

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }

                max = Math.max(max, sum);
            }
        }

        return max;
        */


        /*----------------------------------------------------------
         *  2) BETTER APPROACH (O(n^2))
         *----------------------------------------------------------
         * IDEA:
         *  - Har i se start hone wale subarray ka sum maintain karo
         *  - j pointer move karke sum badhao
         *  - Har step par max update hota rahega
         *
         * TIME:  O(n^2)
         * SPACE: O(1)
         *----------------------------------------------------------

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }

        return max;
        */


        /*----------------------------------------------------------
         *  3) OPTIMIZED APPROACH — KADANE'S ALGORITHM (O(n))
         *----------------------------------------------------------
         * IDEA:
         *  - Running sum maintain karo
         *  - Agar sum < 0 ho jaye, reset sum = 0
         *  - Har step par max update hota rahega
         *
         * WHY IT WORKS:
         *  Negative running sum future subarray ko sirf worse karega,
         *  isliye hum usse reset kar dete hain.
         *
         * TIME:  O(n)
         * SPACE: O(1)
         *----------------------------------------------------------*/

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];                   // include current element
            max = Math.max(max, sum);         // update global max

            if (sum < 0) {                    // reset when sum goes negative
                sum = 0;
            }
        }

        return max;  // final answer (maximum subarray sum)
    }
}
