package com.OOPs;

/*
==================================================
 ABSTRACT CLASSES, INTERFACES, ANNOTATIONS
                (DAY 5)
==================================================

Kabhi-kabhi hume aisi superclass banani hoti hai
jo sirf ek GENERAL structure define kare,
aur actual implementation subclasses pe chhod de.

Example:
- Sab Vehicles start hote hain
- Lekin Car key se start hoti hai
- Bike kick se start hoti hai

Is problem ko Java solve karta hai:
1) Abstract Classes
2) Interfaces
3) Annotations

==================================================
*/

public class Day5 {

    public static void main(String[] args) {

        // Abstract class reference (runtime polymorphism)
        TransportVehicle vehicle = new CarVehicle();
        vehicle.start();
        vehicle.stop();

        // Interface reference
        PaymentMode payment = new UpiPayment();
        payment.pay(500);
    }
}

/*
==================================================
1 ABSTRACT CLASS
==================================================

-- Simple language:
Abstract class = Incomplete class

- Iska object direct nahi ban sakta
- Ye base structure define karti hai
- Kuch methods complete ho sakte hain
- Kuch methods incomplete (abstract) hote hain

--------------------------------------------------
ABSTRACT METHOD
--------------------------------------------------

Abstract method:
- Sirf method declaration hota hai
- Method body nahi hoti

Syntax:
abstract returnType methodName(parameters);

Ye method subclass ki RESPONSIBILITY hoti hai,
isliye ise "subclass responsibility" bhi kehte hain.

--------------------------------------------------
IMPORTANT RULES (VERY IMPORTANT)
--------------------------------------------------

= Agar class me ek bhi abstract method ho,
  to class ko abstract banana hi padega

= Abstract class ka object nahi ban sakta

= Abstract constructor  allowed nahi
= Abstract static method  allowed nahi

WHY abstract static method allowed nahi?
---------------------------------------
Static method class ke through call hota hai.
Abstract ka matlab empty method.
Class ke through empty method call karna
koi sense nahi banata.

= Abstract class me static methods allowed hain
= Abstract class me concrete (normal) methods allowed hain

= Subclass ko:
   - saare abstract methods implement karne honge
   - warna subclass ko bhi abstract banana padega

--------------------------------------------------
POLYMORPHISM POINT (INTERVIEW GOLD)
--------------------------------------------------

Abstract class ka object nahi ban sakta,
lekin uska REFERENCE ban sakta hai.

Ye runtime polymorphism ka base hai.
*/

abstract class TransportVehicle {

    // abstract method (subclass responsibility)
    abstract void start();

    // concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }

    // static method allowed
    static void info() {
        System.out.println("Transport vehicle info");
    }
}

/*
--------------------------------------------------
CONCRETE SUBCLASS
--------------------------------------------------
*/

class CarVehicle extends TransportVehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

/*
NOTE ON CONSTRUCTOR:
--------------------
Abstract class me constructor ho sakta hai,
lekin public constructor ka direct use nahi hota
kyunki abstract class ka object nahi ban sakta.

Constructor subclass ke through call hota hai.
*/

/*
==================================================
2 INTERFACE
==================================================

 Simple language:
Interface = PURE CONTRACT

- Sirf batata hai KYA hona chahiye
- KAISE hoga, ye implementing class decide karti hai

--------------------------------------------------
INTERFACE RULES
--------------------------------------------------

= Interface ka object nahi ban sakta
- Interface methods by default:
   public + abstract
- Interface variables by default:
   public static final
- Interface multiple inheritance support karta hai

--------------------------------------------------
WHY INTERFACE?
--------------------------------------------------

= Multiple inheritance chahiye
= Loose coupling chahiye
= Framework design (Spring, Hibernate)

--------------------------------------------------
INTERFACE EXAMPLE
--------------------------------------------------
*/

interface PaymentMode {

    // public static final by default
    int MAX_LIMIT = 10000;

    // public abstract by default
    void pay(int amount);
}

/*
--------------------------------------------------
IMPLEMENTING CLASS
--------------------------------------------------
*/

class UpiPayment implements PaymentMode {

    @Override
    public void pay(int amount) {
        System.out.println("Paid via UPI: " + amount);
    }
}

/*
==================================================
3 ABSTRACT CLASS vs INTERFACE
==================================================

-------------------------------
TYPE OF METHODS
-------------------------------
Abstract Class:
- Abstract + Concrete methods
- Java 8 se default & static methods bhi allowed

Interface:
- Java 7: only abstract methods
- Java 8+: default & static methods allowed

-------------------------------
VARIABLES
-------------------------------
Abstract Class:
- final / non-final
- static / non-static

Interface:
- Only public static final

-------------------------------
INHERITANCE
-------------------------------
Abstract Class:
- extends keyword
- Single class inheritance

Interface:
- implements keyword
- Multiple inheritance supported

-------------------------------
IMPLEMENTATION
-------------------------------
Abstract Class:
- Interface ka implementation de sakti hai

Interface:
- Abstract class ka implementation nahi de sakti

-------------------------------
ACCESS MODIFIERS
-------------------------------
Abstract Class:
- private, protected, default, public

Interface:
- Members public by default

--------------------------------------------------
INTERVIEW ONE-LINER
--------------------------------------------------
Use abstract class when classes are closely related
and share common code.
Use interface when unrelated classes follow
the same contract.
*/

/*
==================================================
4 ANNOTATIONS
==================================================

-- Annotation = Metadata

Matlab:
Code ke baare me extra information dena,
jo compiler ya framework use karta hai.

--------------------------------------------------
COMMON ANNOTATIONS
--------------------------------------------------

@Override
- Compile-time check for method overriding

@Deprecated
- Method / class outdated hai

@SuppressWarnings
- Compiler warnings suppress karta hai

--------------------------------------------------
ANNOTATION EXAMPLE
--------------------------------------------------
*/

class AnnotationDemo {

    @Override
    public String toString() {
        return "Annotation Demo";
    }

    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

/*
==================================================
FINAL INTERVIEW GOLD SUMMARY
==================================================

- Abstract class = Partial abstraction + shared code
- Interface = Full abstraction + contract
- Abstract class supports runtime polymorphism
- Interface supports multiple inheritance
- Annotations provide metadata to compiler/frameworks

ONE-LINER:
----------
Abstract class is used for IS-A relationship
with shared behavior,
Interface is used for CAN-DO relationship.

==================================================
*/
