package com.OOPs.ExceptionHandling;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b =0;
        //System.out.println(a/b);  // Arithmetic Exception is come
        // to avoid this we use some keyword like try and catch;

        try {
            int c =a/b;
        }catch (Exception e){
            System.out.println(e.getMessage());
            // print the message i.e. - / by zero
        }finally {
            System.out.println("tihs will always execute");
        }

    }


    // lamba function
    public static class LambaFunction {
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                arr.add(i+1);
            }
            // use lamba function
            arr.forEach((item) -> System.out.print(item*2+" "));
        }
        int sum(int a,int b){
            return a+b;
        }
    }
}
