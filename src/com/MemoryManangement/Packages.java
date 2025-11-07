package com.MemoryManangement;

public class Packages {
    public static void main(String[] args) {
        /*
 Java Package kya hota hai?

 Package = Folder / Group of related classes

Jaise tumhare computer me “Movies”, “Songs”, “Documents” alag-alag folders me hote hain,
waise hi Java me classes, interfaces, and sub-packages ko ek jagah organize karne ke liye package hota hai.

 Kyun use karte hain packages?

Code organize karne ke liye
→ Related classes ek saath rakhne ke liye (like folders).

Name conflict se bachne ke liye
→ Agar do classes ka same naam ho, alag package me rakho to conflict nahi hota.

Code reuse karne ke liye
→ Ek package ka code dusre me easily import karke use kar sakte ho.

 Types of Packages

Built-in Packages (Java ke andar already hote hain)
Examples

java.lang → Basic classes (String, Math, System)

java.util → Utility classes (ArrayList, HashMap)

java.io → Input/Output (File handling)

java.net → Networking (Socket, URL)

java.sql → Database (JDBC)

User-defined Packages (Tum khud bnaate ho)
Apne project ke classes ko organize karne ke liye.
         */

        /*
 Kaise bnaate hain aur use karte hain?
Step 1: Package banana
package mypack;   // package ka naam

public class Hello {
    public void show() {
        System.out.println("Hello from mypack!");
    }
}

Step 2: Use karna (import)
import mypack.Hello;  // package import karna

class Main {
    public static void main(String args[]) {
        Hello h = new Hello();
        h.show();
    }
}

Short Summary:
Type	Example	Description
Built-in	java.util.*	Java ke ready-made packages
User-defined	package mypack;	Tumhare khud ke packages
Import	import mypack.Hello;	Dusre package ka class use karna

Chhoti line mein yaad rakh bhai
Package = Folder jisme related classes rakhe jaate hain, jisse code organized aur reusable hota hai.
         */
    }
}
