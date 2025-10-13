package com.Switch_Case;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // nested switch case means switch case ke andar switch case
        Scanner sc = new Scanner(System.in);
        int employee = sc.nextInt();
        String department = sc.next();
        switch (employee){
            case 1:
                System.out.println("mukund johari");
                break;
            case 2:
                System.out.println("Shivang Chauhan");
                break;
            case 3:
                System.out.println("department name");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    case "EC":
                        System.out.println("EC Department");
                        break;
                    default:
                        System.out.println("enter exist department");
                        break;
                }
                break;
            default:{
                System.out.println("enter correct employee");
            }
        }
    }
}
