
// WAP to convert temp in Celsius(C) into Fahrenheit(F)

package com.basic_syntax;

import java.util.*;
public class TempChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temp in C : ");
        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5)+32;
        System.out.println("the temp in F is : " + tempF);


    }
}
