package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        // initialise it
        for (int i = 0; i < 3; i++) {
            a.add(new ArrayList<>(10));
        }
        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(a);

    }
}
