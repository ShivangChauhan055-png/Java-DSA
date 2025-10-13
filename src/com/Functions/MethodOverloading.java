package com.Functions;

public class MethodOverloading {
    public static void main(String[] args) {
        /*
        Q.) Method Overloading Kya Hai?
Jab ek hi class me same naam ke multiple methods ho, but unke parameters alag ho →
isko Method Overloading bolte hain.

Rules of Overloading:-

1.Method name same hona chahiye.
2.Parameters different hone chahiye (number, type ya order).
3.Return type alag ho sakta hai, but sirf return type alag hoga to overloading nahi hoga.
         */
        fun(34);  // ab ye int bale fun ko call krega
        fun("pappu");// ab ye string bale fun ko call krega

        int ans =sum(23,45,67);
        System.out.println(ans);
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
}
