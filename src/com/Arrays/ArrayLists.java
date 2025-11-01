package com.Arrays;
import java.util.*;


public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Arraylist tb use krte h jb hmme array ka size na pta ho
        Dynamic array ho
         */
        // Syntax....
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(56);  // array m element add kr sakte ho
//        list.add(54);
//
//        System.out.println(list);
//        System.out.println(list.contains(56));// for check item is in array or not
//        // esse hi list. se bhut saare function kr sakte ho

        // INPUT...
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        // becoz list[index] not work in arraylist
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
