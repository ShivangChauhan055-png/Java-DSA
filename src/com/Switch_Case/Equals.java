package com.Switch_Case;

import java.util.*;
public class Equals {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         /*
          == kya karta hai?

            == memory address check karta hai.
            Matlab do objects same jagah memory me store hain ya nahi.
            Primitive types (int, float, char) me ye value check karta hai.

           Example:
           String a = new String("hello");
           String b = new String("hello");
           System.out.println(a == b);     // false   (memory location alag)

     ️  .equals() kya karta hai?

        .equals() objects ki value compare karta hai.
         Matlab string ke andar jo likha hai wo same h ya nahi.

         Example:
         System.out.println(a.equals(b)); // true   (value same)

          */
        System.out.println("enter the fruit : ");
        String fruit = in.next();
        if (fruit.equals("mango")) {
            System.out.println("king of fruits.");
        }
        if (fruit.equals("apple")) {
            System.out.println("red sweet of fruits.");
        }
    }

}
