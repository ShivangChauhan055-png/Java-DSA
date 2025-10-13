package com.basic_syntax;

// for inputs we have Scanner class available in java.util.package
// 1. first import java.util.Scanner;
// 2. create object of scanner class
// 3. use that object to take input from keyword

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your marks : ");
        //int marks = input.nextInt();
       // System.out.println("my marks is: "+ marks);

        float marks2 = input.nextFloat();
        System.out.println(marks2);

//         note if you want to print 234 million so use _ rather than ,(commas)
//       int rupees = 234_000_000;
//       System.out.println(rupees);
    }
}


// WAP to take user input and print their name

//import java.util.Scanner;
//public class Input {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("enter your name : "); // if my name is : shiv kumar
//        String name = input.next();    // input.next() only first name lega space ke baad bala nhi lega
//        System.out.println("my name is :" + name);   // output: shiv
//    }
//}

//import java.util.*;
//public class Input{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int roll_no = input.nextInt();
//        System.out.println("my roll no is :" + roll_no);
//    }
//}





