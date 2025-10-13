package com.Conditions__Loops;

public class If {
    public static void main(String[] args) {
        /*
          syntax of if else statements
          if(expression){
             // body
          }
          else{
              // body
          }
        */
        int salary = 50000;
        if(salary > 20000){
            salary=salary+1000;
        }
        else{
            salary+=500;
        }
        System.out.println(salary);
    }
}
