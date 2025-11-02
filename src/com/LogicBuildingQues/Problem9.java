package com.LogicBuildingQues;

import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        /*Define two methods to print the maximum and the minimum number respectively
          among three numbers entered by the user.*/
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b =sc.nextInt();
        System.out.print("enter c: ");
        int c = sc.nextInt();
        System.out.println("max number: "+FindMax(a,b,c));
        System.out.println("min number: "+FindMin(a,b,c));
    }
    static int FindMax(int a,int b,int c){
        return (a>b && a>c) ? a:(b>c ? b:c);
    }
    static int FindMin(int a,int b,int c){
        return (a<b && a<c) ? a:(b<c ? b:c);
    }
}
