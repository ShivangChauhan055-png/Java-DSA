package com.basic_syntax;

public class Precedence {
    public static void main(String[] args) {
        // Operator Associativity in Java
        /*
        1. Left-to-Right Associativity
        Operators with left-to-right associativity include:
         Arithmetic operators: +, -, *, /, %
         Relational operators: >, <, >=, <=
         Logical AND/OR: &&, ||
         Bitwise operators: &, |, ^, <<, >>

         2. Right-to-Left Associativity
         Operators with right-to-left associativity include:
         Assignment operators: =, +=, -=, etc.
         Unary operators: ++, --, !, ~
         */
        int result = 100 + 200 / 10 - 3 * 10;
        System.out.println(result);
    }
}
