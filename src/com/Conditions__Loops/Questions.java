package com.Conditions__Loops;

// WAP to find largest of three number

//import java.util.*;
//public class Questions {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter the number : ");
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();
//// method 1:
////        int max = num1;
////        if(num2>max){
////            max = num2;
////        }
////        if(num3>max){
////            max=num3;
////        }
//// method 2
//         int max = Math.max(num1,num2);  // two number m largest
//         int largest =  Math.max(num3,max);
//
//        System.out.println("largest num is : " + largest);
//    }
//}

// WAP to checkCase in a string
// check character is in lowercase and uppercase

//import java.util.*;
//public class Questions {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        char ch = input.next().trim().charAt(0);
//        // ye .trim() extra space hta dega
//        // .charAt(0) ye char return krta h uss index ka
//        if (ch >= 'a' && ch <= 'z') {
//            System.out.println(ch + " is in lowercase.");
//        }else {
//            System.out.println(ch + " is in uppercase");
//        }
//    }
//}

// Fibonacci Numbers

//import java.util.*;
//public class Questions {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//// find the nth fibonacci number
//        int count = 2;
//        while (count<=n){
//            int temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);
//    }
//}

// Counting occurrence of a number

// eg: 2355654 let's say iss number m hmme 5 ki frequency count krni h
//public class Questions {
//    public static void main(String[] args) {
//        int num = 23556545;
//
//        int count = 0;
//        while (num>0) {
//            int rem = num % 10;
//            if (rem == 5) {
//                count++;
//            }
//            num /= 10;
//        }
//        System.out.println(count);
//    }
//}

// REVERSE OF A NUMBER

// eg:  num = 24567 and ans will be 76542
public class Questions {
    public static void main(String[] args) {
        int num = 24567;

        int ans = 0;
        while (num>0){
            int rem = num%10;
            num/=10;
            ans = ans*10 + rem;
        }
        System.out.println(ans);
    }
}

