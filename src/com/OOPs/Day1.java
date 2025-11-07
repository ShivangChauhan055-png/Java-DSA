package com.OOPs;

import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        // try to understand what is oops and why we need this

        // let's assume store 5 int value in a data structure
        // simple I can make array of 5 int
        int[] arr = new int[5];

        // now store 5 names
        // simple we can make string array
        String[] names = new String[5];

        // now the questions is store data of 5 students:
        // data includes(names,roll no,marks);
        // simple I can make three array of it
        // ome is for names,and roll no,marks three different arrays

        // but the questions to store data in one line
        // as we store like above 5 names and 5 int value like this

        // Here, the concepts of class and objects is come...
        // in simple words if we combine these three entity(names, marks,roll no)
        // we can combine in single line via a classes..

        // one more definition: if you make your own datatypes you can use classes

        Student[] students = new Student[5];

//        Student Shivang = new Student();
//        Shivang.rollNo =13;
//        Shivang.marks = 92.5f;
//        Shivang.Names = "Shivang Chauhan";
//
//        System.out.println(Shivang.rollNo);
//        System.out.println(Shivang.marks);
//        System.out.println(Shivang.Names);
    }


        // CREATE A CLASS.....SYNTAX
        class Student{
            int rollNo;
            float marks;
            String Names;
    }

    /* A class is an template of an objects;
     like if we make car we use some rules like engine,5,7 seater,colour,that rules is apply on every car
     that rules is classes and the physical parts like engine,colour,etc.. are objects
     a class is like an blueprint that help to make an object
     proper defination: An object is an instance of class
     if a baby is born , a baby is an instance for human class */


    // CLASS vs OBJECT
    /*
    Class --> logical construct
    Object --> physical reality(occupy space in memory)
     */

    // Instance Variable = Variables inside the objects are instance variables

    // Use .(dot) operator you can access any instance variable
    /* eg: we have 3 objects - stu1,stu2,stu3 each have names,marks,address
    if we have to access address of stu3 we can write
    System.out.println(stu3.address);  */

    // Default values of data types when there are not intiliaze;
    /*
    int --> 0
    float --> 0.0
    boolean--> false
    String/object --> null
     */

    /* CONSTRUCTOR in Java
     A constructor basically defines what happens when your objects will be created
     Constructor is special function, that varies when you create an object
     and it allocates some variables.
     eg:-
     Student Data = new Student(13,"Shivang",85.1);
     Student(){
     this.rollno =13;
     this.name = "Shivang";
     this.marks = 85.1f;
     }
      student( ) is a special type of function in the class which is called constructor
    */
     /* use of THIS keyword
     this can be used inside any method to refer to the current object.
     this basically means what object you are using.
     you can call a constructor from another constructor using this keyword..

     what is Final Keyword
     final Keyword:
     A field can be declared as final. Doing so prevents its contents from being modified, making it, a constant.
     This means that you must initialize a final field when it is declared.

     in simple way final in java is like an constant variable
     eg:- final int bonus = 2;

     Note:- primitives data types m value change nhi kr sakte final use kroge to
     but other than primitives m values change kr sakte h referenced obj change nhi hoga

     //"when a non primitive is final,you cannot ressign it. you can change value"

     eg:-
     final Student data = new Student();
     data.name = "new name" ;   // yha change kr sakte ho
      */









}


