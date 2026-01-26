package com.OOPs.Inheritance;

// ye extends se box(parent class) ke sb values boxweight m access kr dega
public class BoxWeight extends Box{
    int weight;
    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(int l,int h,int b,int weight){
        super(l,h,b); // what is this ??
        // ye super keyword parent class constructor jo ki box h usko call kr rha h
        // use to initialise values present in  parent class
        this.weight=weight;
    }
}
