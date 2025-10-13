package com.Switch_Case;

import java.util.Scanner;

//public class Switch {
//    public static void main(String[] args) {
//        System.out.print("enter the fruit: ");
        /*
        In switch statements, you can jump to various cases based on your expression.
        SYNTAX:
        switch(expression){
        case one:
            // do something;
            break;
        case two:
            // do something;
            break;
        case three:
            // do something;
            break;
        default:
            // do something;
        }
         */

        /*
        NOTE:-
        - cases have to be the same type as expressions,must be a constant or literal
        - duplicate case values are not allowed
        - break is use to terminate the sequence
        - if break is not used, it will continue to the next case
        - default will execute when none of the above cases run
        - if default is not at the end,put break after it
         */


        //  PROBLEM 1 : DESCRIBE FRUIT
//        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();

//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits.");
//                break;
//            case "apple":
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("round gool h ");
//                break;
//            default:{
//                System.out.println("enter the valid fruit.");
//            }
//        }

        // ENHANCED 'SWITCH'
//        switch (fruit){
//            case "mango" -> System.out.println("king of fruits.");
//            case "apple" -> System.out.println("a sweet red fruit");
//            case "orange" -> System.out.println("a round fruit");
//            default -> System.out.println("enter a valid fruit");
//        }
//    }
//}


// PROBLEM 2 : DISPLAY DAY NAME B/W 1 & 7
public class Switch {
    public static void main(String[] args) {
        System.out.print("enter the day: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }
        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekends yeee");
        }
    }
}
