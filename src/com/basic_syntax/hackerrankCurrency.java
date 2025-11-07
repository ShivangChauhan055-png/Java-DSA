package com.basic_syntax;
import java.util.*;
import java.util.regex.*;
import java.text.*;

public class hackerrankCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String usFormated = us.format(payment);
        String indiaFormatted = india.format(payment);
        String chinaFormatted = china.format(payment);
        String franceFormatted = france.format(payment);

        System.out.println("US: " + usFormated);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}

/*
1️ Locale kya hota hai

Locale ka matlab hota hai — language + country ka combination
jo decide karta hai:
Kaunsa currency symbol use hoga
Number formatting kaisa hoga (comma, dot, space)
Language aur region rules

Locale.US → English, United States
Locale.CHINA → Chinese, China
new Locale("en", "IN") → English, India


2. NumberFormat.getCurrencyInstance(locale)
Ye ek Java class hai jo kisi country ke format me currency print karti hai.
NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
Ab us ek formatter ban gaya jo:
Currency symbol $
Format pattern #,###.##
use karega.


3. formatter.format(payment)
Double number ko currency string me convert karta hai
 */

