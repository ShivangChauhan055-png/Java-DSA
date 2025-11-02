package com.LogicBuildingQues;

import java.util.Scanner;
import java.util.SortedMap;

public class Problem8 {
    public static void main(String[] args) {

        //Java Program Vowel Or Consonant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch); // lower case m convert krne ke liye
        if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u'){
            System.out.println(ch + " is a vowel");
        } else if (ch>='a' && ch<='z') {
            System.out.println(ch +" is a constant");
        }else{
            System.out.println(ch+" ois not an alphabat");
        }

    }
}
