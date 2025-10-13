package com.Arrays;

// Print all elements in an array..
public class TraverseArray2 {
    public static void main(String[] args) {
        int[] Num ={1,2,3,4,5};
//        for (int i = 0; i < Num.length; i++) {
//            System.out.println(Num[i]);

        // Enhanced for-each loop
        for(int n:Num){
            System.out.println(n);

            /*
            ==> To the Point
Agar sirf traverse/print/sum karna h → for-each loop better (short & clean).
Agar index chahiye / modification / complex logic karna h → for loop hi best.
 Example:
Sum of array → for-each
Reverse array / Binary Search / Rotate → normal for hi chalega.
             */


        }

    }
}
