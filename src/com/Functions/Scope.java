package com.Functions;

public class Scope {
    public static void main(String[] args) {
       /*
       1. What is Scope?
Scope = ek variable kahaan tak accessible hai (kitni life aur visibility hai).
Matlab variable bana to diya, but use kahan tak kar sakta hai → isko scope bolte hain.

       2. Types of Scope in Java:-

(a) Block Scope (Local Variables)
{ } ke andar jo variable bana, wo sirf usi block me valid hai.
Jaise loops, if-else, functions ke andar.
        */
        int x = 10; // yeh main ke liye valid hai
        if (true) {
            int y = 20; // sirf if-block ke andar valid
            System.out.println(x + y);
        }
        // System.out.println(y); //  Error, y ka scope khatam

        /*
 (b) Method Scope (Parameters + Local variables)
Function (method) ke andar jo variable bana ya parameter aya,
wo sirf us method ke andar accessible hai.

         */
        greet("Shivang");
        // System.out.println(name);  error, scope sirf greet ke andar
    }

    static void greet(String name) { // parameter "name" ka scope sirf is method tak
        System.out.println("Hello " + name);

        /*
(c) Loop Scope
Loop ke andar jo variable declare karega, uska scope sirf loop tak hai.
Har iteration me wo variable dobara ban sakta hai.
         */
        for (int i = 0; i < 5; i++) {  // i ka scope: sirf loop tak
            System.out.println(i);
        }
        // System.out.println(i);  error
        //Agar tu loop ke bahar use karna chahta hai, to loop ke bahar declare karna padega:
    }
}
        /*
        4. Shadowing (Variable Hiding)
Jab same naam ka variable ek inner scope me declare hota hai jo outer scope ke variable ko "chhupa deta hai".
Shadowing se confusion hota hai, isliye best practice ye hai ki different naam use karein.
         */
//        public class Scope {
//            static int x = 100; // class scope (static)
//
//            public static void main(String[] args) {
//                System.out.println(x); // 100
//
//                int x = 50; // shadowing (ye local x class ke x ko hide karega)
//                System.out.println(x); // 50
//                System.out.println(Scope.x); // 100 (class ka x access karne ke liye)
//            }
//        }



