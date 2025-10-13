package com.Functions;

// Program 1 {Swap two numbers}
//public class Program {
//    public static void main(String[] args) {
//        int a=20;
//        int b=90;
//        //swap two numbers code
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a + " " + b);
//    }
//}

// agr m swap name ka function bnau and ye code run kru then swap nhi hoga ..
// Reason:-
/*
Ye swap main ke andar hi ho raha hai isliye kaam kar raha hai.
Lekin jab tu function bana ke call karega, wahan dikkat aati hai,
kyunki Java me arguments hamesha pass by value hote hain (copy jati hai, original nahi).

Java me primitive types (int, float, etc.) pass by value hote hain, isliye direct swap function nahi chalega.
Agar mutable object (class, array, etc.) pass karega to swap ho jayega.
 */

import java.util.Arrays;

// Program 2 {Change Value}
public class Program {
    public static void main(String[] args) {
        //create an array
        int[] arr= {1,2,3,4,5,6,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[1]=69;
    }
}
// dekha,, array ko pass(swap) ya modify kr de rha h.

