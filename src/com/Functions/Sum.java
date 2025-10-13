package com.Functions;

 import java.util.*;
//public class Sum {
//    public static void main(String[] args) {
//      sum(); // calling the functions by using ()
//    }
//
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number 1 : ");
//        int num1 = in.nextInt();
//        System.out.print("Enter the number 2 : ");
//        int num2 = in.nextInt();
//        int sum = num1+num2;
//        System.out.println("the sum is : "+sum);
//    }
//}



//Returning a value

public class Sum {
    public static void main(MyString[] args) {
        int ans = sum2();
        System.out.println(ans);

    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter the number 2 : ");
        int num2 = in.nextInt();
        int sum1 = num1 + num2;
        return sum1;   // function end here ab iske aage kuch nhi chalega
    }
}
//static int use kiya h becoz we have return a value.
// int use kiya then int hi return krna padega.



