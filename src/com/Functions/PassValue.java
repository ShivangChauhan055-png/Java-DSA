package com.Functions;


// Parameters Integer Function.......
public class PassValue {
//    public static void main(String[] args) {
//        int ans = sum(60, 50);
//        System.out.println(ans);
//    }
//
//    static int sum(int a, int b) {
//        int sum1 = a + b;
//        return sum1;
//    }

// pass the value of numbers when you are calling the method in main()

// Parameters String Function.......
public static void main(String[] args) {
    String personalised = myGreet("Shivang Chauhan");
    System.out.println(personalised);
}
static String myGreet(String name){
    String message = "Hello "+name;
    return message;
}
}