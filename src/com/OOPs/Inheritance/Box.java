package com.OOPs.Inheritance;


// class box
public class Box {
    int l;
    int b;
    int h;

    // Box constructors
    Box(){
        this.h = 34;
        this.l = 90;
        this.b =69;
    }
    Box(int side){

        // super(); to call the constructor of object class
        this.l = side;
        this.b = side;
        this.h = side;
    }
    Box(int l,int h,int b){
        this.l =l;
        this.b =b;
        this.h =h;
    }
    public void info(){
        System.out.println("Running the box");
    }
}


