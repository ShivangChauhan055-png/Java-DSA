
package com.Conditions__Loops;

// FOR LOOP


//public class Loops {
//    public static void main(String[] args) {
//        // Q. Print numbers from 1 to 10000
//        // ans. we use loops to print not manually print this
//        /*
//        Syntax of for loop:
//        for(initialization; condition; increment/decrement){
//             // body
//        }
//        question . WAP TO PRINT NUMBERS BETWEEN 1 TO 10
//         */
//        for (int num = 1; num<=10; num +=1 ){
//            System.out.println(num);
//        }
//    }
//}



// Q.) WAP to print numbers between 1 to n

//import java.util.*;
//public class Loops {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the value of n: ");
//        int n = input.nextInt();
//        for (int i = 1; i<=n; i++ ){
//            System.out.println(i);
//        }
//    }
//}

// Enhanced for loop (for each)
class ForEachExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // normal for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // foreach loop
        // Syntax:

        // for (dataType variable : arrayOrCollection) {
        // code to be executed
        // }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}



// WHILE LOOP

/*
Syntax of while loops
initialization;
while(condition){
     body
     increment/decrement
}
 */
//  Q.) WAP to print even number between 1 - 10
//public class Loops {
//    public static void main(String[] args) {
//        int a =2;
//        while (a<=10){
//            System.out.println(a);
//            a += 2;
//        }
//    }
//}


// DIFFERENCE BETWEEN FOR & WHILE LOOPS
/*
for loop:-
Jab tumhe pata ho ki kitni baar loop chalana hai.
Matlab iterations ki fixed count hai.
Mostly counting, array traversal, pattern printing jaisi cheezon me use hota hai.

while loop:-
Jab tumhe pata na ho ki kitni baar loop chalega.
Matlab bas ek condition satisfy hoti rahe tab tak loop chalta rahe.
Mostly user input, waiting conditions, infinite loops me use hota hai.
 */

// DO WHILE LOOP :- ye loop atleast ek baar ek to chlega hi chae condition satisfy ho ya na ho
/*
Syntax

initialization;
do {
   body
   increment/decrement
} while(condition){

  }
 */
//public class Loops {
//    public static void main(String[] args) {
//        int a =1;
//        do {
//            System.out.print(a + " ");
//            a++;
//        }while (a<=5);
////        do{
////            System.out.println(a);
////        }while (a != 1); // condition false h fir bhi ek baar loop chal hi rha h
//    }
//}








