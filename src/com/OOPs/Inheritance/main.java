package com.OOPs.Inheritance;

public class main {
    public static void main(String[] args) {
//        Box Box = new Box();
//        System.out.println(Box.h);

//        BoxWeight box2 = new BoxWeight();
//        System.out.println(box2.weight +" "+box2.h);

        BoxWeight  box3 = new BoxWeight(2,4,5,7);
        System.out.println(box3.h+" "+box3.weight);

        Box Box5 = new BoxWeight(4,5,6,7);
        // see in this reference variable box5 point kr rha box ko per object mene boxweight bna diya h
        // isliye ye boxweight ko access nhi krega
        //System.out.println( Box5.wieght); // error aa gya
        System.out.println(Box5.l); // box ki l ko print kr dega becoz usko hi point kr rha h



        // ab boxprice ka object bnaege and call krege
        BoxPrice box5 = new BoxPrice(3,5,6,80,79);
        System.out.println(box3.h+" "+box5.cost+" "+ box3.b);
    }
}
