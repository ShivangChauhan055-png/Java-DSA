package com.basic_syntax;

// WAP to print sum of two numbers and take user input

import java.util.Scanner;
    public class Sum {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int num1= input.nextInt();
            int num2= input.nextInt();
            int sum = num1+num2;
            System.out.println("sum is :" + sum);
        }
    }
