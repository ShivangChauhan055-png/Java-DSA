package com.OOPs.Inheritance;

public class BoxPrice extends BoxWeight{
    int cost;
    BoxPrice(){
        super();
        this.cost =97;
    }
    public BoxPrice(int l ,int h,int b,int weight,int cost){
        super(l,h,b,weight);
        this.cost = cost;
    }
}
