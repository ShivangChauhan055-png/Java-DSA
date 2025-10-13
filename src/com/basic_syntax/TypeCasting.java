package com.basic_syntax;


//Type Conversion and Casting:

//Java’s Automatic Conversions  ==>
//When one type of data is assigned to another type of variable, an automatic type conversion will take place if the
//following two conditions are met:
// 1• The two types are compatible.
// 2• The destination type is larger than the source type.
// eg: float is greater than integer
//Java also performs an automatic type conversion when storing a literal integer constant into variables of type
//byte, short, long, or char.

import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);

    }
}

// Type casting ==>

//import java.util.*;
//public class TypeCasting {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int a = (int)(45.2354f);
//        System.out.println(a);
//    }
//}

// automatic type promotion in expressions ==>

//import java.util.Scanner;
//public class TypeCasting {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//    }
//        int b= 258;
//        byte c = (byte)(b);   // 258 % 256 = 2 (because byte max 256 store kr sakta h)
//        System.out.println(c);
//
//        byte x =40;
//        byte y =60;
//        byte z =100;
//        int s = (x*y)/z;
//        System.out.println(s);

//        int letter = 'A';
//        System.out.println(letter);

        // JAVA FOLLOWS UNICODE PRINCIPLES::
//        System.out.println("ਸਤ ਸ੍ਰੀ ਅਕਾਲ");
//        System.out.println("नमस्ते");
//        System.out.println("hello");
//    }
//}


//⚖️ Key Points:

//Automatic type conversion happens only if:

//The target type is larger (wider).
//No explicit casting is required.
//No data loss possibility.

//Explicit typecasting is required if:

//Converting from larger → smaller.
//Converting between incompatible types (e.g., double to int, int to byte).
//Might cause overflow/underflow


// convert string to integer

// string a = "10";
// string b = "40";

// int a = Integer.parseInt(a);
// int b = Integer.parseInt(b);
