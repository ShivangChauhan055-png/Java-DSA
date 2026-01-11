package com.String;
import java.util.*;
/*
====================================================
                JAVA STRING NOTES
====================================================

*/
public class StringNotes {

    /*
    ------------------------------------
    1) What is String?
    ------------------------------------
    - String is a collection of characters.
    - In Java, String is a class (java.lang.String).
    - String is IMMUTABLE (cannot be changed).
    */

    /*
    ------------------------------------
    2) Creating String
    ------------------------------------
    */

    // (a) String Literal (Recommended)
    // Stored in String Pool
    String s1 = "Java";

    // (b) Using new keyword
    // Creates a new object in heap memory
    String s2 = new String("Java");

    /*
    ------------------------------------
    3) String Pool
    ------------------------------------
    - Special memory area for String literals
    - Same value Strings share same memory
    */

    /*
    Example:
    String a = "Java";
    String b = "Java";
    // a and b refer to same object
    */

    /*
    ------------------------------------
    4) String Immutability
    ------------------------------------
    - Once created, String value cannot be changed
    */

    /*
    Example:
    String s = "Java";
    s.concat(" World");
    System.out.println(s);   // Output: Java
    */

    /*
    Reason for immutability:
    - Security
    - Memory optimization
    - Thread safety
    */

    /*
    ------------------------------------
    5) == vs equals()
    ------------------------------------
    */

    /*
    == operator:
    - Compares reference (memory address)

    equals():
    - Compares actual content/value
    */

    /*
    Example:
    String a = "Java";
    String b = new String("Java");

    a == b        // false
    a.equals(b)  // true
    */

    /*
    Rule:
    Always use equals() to compare Strings
    */

    /*
    ------------------------------------
    6) Common String Methods
    ------------------------------------
    */

    public static void stringMethodsDemo() {

        String s = "Hello Java";

        s.length();           // returns length
        s.charAt(1);          // returns 'e'
        s.substring(0, 5);    // returns "Hello"
        s.toUpperCase();      // "HELLO JAVA"
        s.toLowerCase();      // "hello java"
        s.contains("Java");   // true
        s.trim();             // removes spaces
        s.replace('a', 'x');  // replaces character
    }

    /*
    ------------------------------------
    7) Taking String Input
    ------------------------------------
    */

    /*
    Scanner sc = new Scanner(System.in);

    sc.next();       // reads single word
    sc.nextLine();   // reads full line
    */

    /*
    ------------------------------------
    8) StringBuilder & StringBuffer
    ------------------------------------
    */

    /*
    StringBuilder:
    - Mutable
    - Faster
    - Not thread-safe
    */

    /*
    StringBuffer:
    - Mutable
    - Thread-safe
    - Slower than StringBuilder
    */

    /*
    Example:
    StringBuilder sb = new StringBuilder("Java");
    sb.append(" World");
    System.out.println(sb);  // Java World
    */

    /*
    ------------------------------------
    9) Conversion
    ------------------------------------
    */

    /*
    String to int:
    int x = Integer.parseInt("123");

    int to String:
    String s = String.valueOf(123);
    */

    /*
    ------------------------------------
    10) Exam  Important Points
    ------------------------------------
    - String is immutable
    - Use equals() for comparison
    - StringBuilder is faster than String
    - String literals are stored in String Pool
    */

}

