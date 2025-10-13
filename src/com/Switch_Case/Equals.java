package com.Switch_Case;

import java.util.*;
public class Equals {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         /*
         diff between == and .equals()
         eg:
         string1 = "apple";
         string2 = "apple";
         string1==string2;   return True;
         kyuki ye dono alg alg variable same object to target kr rhe h
         agr alg object hote same name ke to false hota;

         but if we use .equals() the in both the cases we get true;
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
