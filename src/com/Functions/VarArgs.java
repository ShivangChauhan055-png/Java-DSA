package com.Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        /*
         Var-args kya hote hain?
Var-args ka matlab hota hai “variable number of arguments”.
Matlab ek method bana aur usko kitne bhi arguments bhej de, wo sab le lega.
Normal method → fixed arguments chahiye.
Var-args method → flexible hai, 1 bhi chalega, 100 bhi chalega.

// SYNTAX
returnType methodName(datatype ...varName) {
    // use varName like an array
}
         */
        fun(3,4,5,6,7,8);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
