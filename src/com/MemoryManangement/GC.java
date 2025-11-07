package com.MemoryManangement;

public class GC {
    public static void main(String[] args) {
        /*
        // MEMORY MANANGEMENT.......

/*
Garbage collection in Java is an automatic memory management process that helps Java programs run efficiently.
Two types of garbage collection activities usually happen in Java. These are:
Minor or incremental Garbage Collection (GC): This occurs when unreachable objects in the Young Generation heap memory are removed.
Major or Full Garbage Collection (GC): This happens when objects that survived minor garbage collection are removed from the Old Generation heap memory. It occurs less frequently than minor garbage collection.
Key Concepts on Garbage Collection

Advantages of Garbage Collection...
The advantages of Garbage Collection in Java are:
It makes java memory-efficient because the garbage collector removes the unreferenced objects from heap memory.
It is automatically done by the garbage collector (a part of JVM), so we don't need extra effort.
*/

/*
Memory Management in C vs Java

The main difference between memory management in c and memory management in Java is listed below:
In C language, programmers manually allocate and free memory. If a programmer forgets to free memory then it causes a memory leak.
In Java language, memory is managed automatically with the help of a garbage collector. The task of garbage collector is to find objects that are no longer used and free up their memory.


C language:
Tumhe khud memory lena (allocate) aur chhodna (free) padta hai — malloc() aur free() se.
Agar tum free karna bhool jao, toh memory leak ho jaata hai (yaani memory waste ho jaati hai).

Java language:
Java mein yeh sab automatically hota hai.
Ek Garbage Collector (GC) hota hai jo unused objects ko dhoondh kar unki memory free kar deta hai.
Matlab programmer ko manually free karne ki zarurat nahi hai.
Short mein:
C = manual memory management
Java = automatic memory management (garbage collector)
 */


    }
}
