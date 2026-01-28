package com.OOPs;

/*
==================================================
        OOPS PRINCIPLES IN JAVA (DAY 3)
==================================================

OOPS = Object Oriented Programming System

Java follows 4 main OOPS principles:
1) Encapsulation
2) Abstraction
3) Inheritance
4) Polymorphism

 In SDE interviews sirf definition nahi,
WHY use kiya + REAL WORLD example + TYPES puchte hain.

==================================================
*/

public class Day3 {

    public static void main(String[] args) {

        System.out.println("Day 3: OOPS Principles in Java");

        // Encapsulation
        Student s = new Student();
        s.setMarks(90);
        System.out.println("Marks: " + s.getMarks());

        // Abstraction
        Vehicle car = new Car();
        car.start();

        // Inheritance + Runtime Polymorphism
        Shape shape = new Circle();
        shape.draw();
    }
}

/*
==================================================
1 ENCAPSULATION
==================================================

 Simple meaning:
Encapsulation = Data ko protect karna + control dena

- Data (variables) ko direct access se hide karte hain
- Access sirf methods ke through dete hain

--------------------------------------------------
WHY ENCAPSULATION?
--------------------------------------------------
- Data secure rehta hai
- Invalid data set hone se bachta hai
- Internal changes ka impact bahar nahi jata
- Code maintainable hota hai

--------------------------------------------------
REAL WORLD EXAMPLE:
--------------------------------------------------
ATM Machine:
- Tum directly cash box access nahi kar sakte
- Sirf buttons (methods) ke through kaam hota hai

--------------------------------------------------
HOW TO ACHIEVE?
--------------------------------------------------
- Variables → private
- Methods → public (getter / setter)

--------------------------------------------------
DEFINITION (INTERVIEW):
--------------------------------------------------
Encapsulation is the mechanism of wrapping data
and methods into a single unit and restricting
direct access to the data.
*/

class Student {

    private int marks;   // data hidden

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {   // validation
            this.marks = marks;
        }
    }

    public int getMarks() {
        return marks;
    }
}
/*
==================================================
DATA HIDING vs ENCAPSULATION (IMPORTANT)
==================================================

 Dono kaafi related hain, but SAME nahi hain.
Interview me difference poocha jaata hai.

--------------------------------------------------
DATA HIDING
--------------------------------------------------

Meaning:
Data Hiding ka matlab hai
data (variables) ko direct access se chhupa dena.

Focus:
- Security
- Unauthorized access se protection

Kaise achieve hota hai?
- private access modifier use karke

Example:
*/
class DataHidingExample {

    private int balance;   // data hidden

    // bahar se direct access allowed nahi
}

/*
Real World Example:
ATM ka cash box
- User direct access nahi kar sakta
- Cash hidden rehta hai

--------------------------------------------------
ENCAPSULATION
--------------------------------------------------

Meaning:
Encapsulation ka matlab hai
data + methods ko ek unit (class) me wrap karna
aur data ko CONTROLLED way me access dena.

Focus:
- Security
- Control
- Validation
- Maintainability

Kaise achieve hota hai?
- private variables
- public getter/setter methods

Example:
*/
class EncapsulationExample {

    private int balance;   // data hidden

    public void setBalance(int balance) {
        if (balance >= 0) {        // validation
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}

/*
Real World Example:
ATM Machine
- Cash hidden (Data Hiding)
- Withdraw / Check Balance buttons (Encapsulation)

--------------------------------------------------
KEY DIFFERENCE (INTERVIEW TABLE)
--------------------------------------------------

Data Hiding:
- Concept hai
- Sirf data ko hide karta hai
- Security pe focus

Encapsulation:
- Mechanism hai
- Data + methods dono ko wrap karta hai
- Security + control dono deta hai

--------------------------------------------------
RELATIONSHIP
--------------------------------------------------
- Encapsulation USES Data Hiding
- Data Hiding Encapsulation ka PART hai
 Dono same nahi hain

--------------------------------------------------
ONE-LINER (INTERVIEW GOLD)
--------------------------------------------------
Data hiding focuses on hiding the data,
while encapsulation focuses on wrapping
data and methods together and controlling access.

==================================================
*/


/*
==================================================
2 ABSTRACTION
==================================================

 Simple meaning:
Abstraction = KYA kaam ho raha hai dikhana,
KAISE ho raha hai chhupa dena

User sirf functionality dekhta hai,
implementation details nahi.

--------------------------------------------------
WHY ABSTRACTION?
--------------------------------------------------
- Complexity kam hoti hai
- User confused nahi hota
- Loose coupling
- System scalable hota hai

--------------------------------------------------
REAL WORLD EXAMPLE:
--------------------------------------------------
Car:
- Tum sirf start() karte ho
- Engine ke andar kya chal raha hai, nahi pata

--------------------------------------------------
TYPES OF ABSTRACTION IN JAVA
--------------------------------------------------
1 Abstract Class
2 Interface

--------------------------------------------------
ABSTRACT CLASS:
--------------------------------------------------
- Abstract + non-abstract methods allowed
- Constructor ho sakta hai
- Jab classes closely related ho

--------------------------------------------------
INTERFACE:
--------------------------------------------------
- Multiple inheritance support
- Pure abstraction
- Jab unrelated classes same behavior follow karein

--------------------------------------------------
DEFINITION (INTERVIEW):
--------------------------------------------------
Abstraction is the process of hiding implementation
details and showing only essential features.
*/

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with key");
    }
}

/*
==================================================
3 INHERITANCE
==================================================

 Simple meaning:
Inheritance = Ek class dusri class ke features reuse kare

--------------------------------------------------
WHY INHERITANCE?
--------------------------------------------------
- Code reuse
- Duplication kam
- Easy maintenance
- Hierarchical structure

--------------------------------------------------
REAL WORLD EXAMPLE:
--------------------------------------------------
Human → Student
Student inherits basic human properties

--------------------------------------------------
Inheritance = IS-A relationship
Example:
Dog IS-A Animal

Keyword: extends
*/

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

/*
--------------------------------------------------
1 SINGLE INHERITANCE
--------------------------------------------------
Animal → Dog

WHY?
- Simple
- No confusion
*/

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

/*
--------------------------------------------------
2 MULTILEVEL INHERITANCE
--------------------------------------------------
Animal → Mammal → Puppy

WHY?
- Step-by-step specialization
- Real-world hierarchy
*/

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammal is walking");
    }
}

class Puppy extends Mammal {
    void play() {
        System.out.println("Puppy is playing");
    }
}

/*
--------------------------------------------------
3 HIERARCHICAL INHERITANCE
--------------------------------------------------

        Animal
        /    \
     Dog    Cat

WHY?
- Common behavior parent me
- Different behavior child classes me
*/

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

/*
--------------------------------------------------
4 MULTIPLE INHERITANCE (IMPORTANT)
--------------------------------------------------

Meaning:
Ek child class do parent classes se inherit kare

 Java does NOT support this using classes

--------------------------------------------------
WHY NOT SUPPORTED? (VERY IMPORTANT)
--------------------------------------------------

-- DIAMOND PROBLEM

        A
      /   \
     B     C
      \   /
        D

- B aur C dono me same method ho
- D confuse ho jata hai:
  kis parent ka method call kare?

 Java ambiguity avoid karta hai
isliye multiple inheritance via classes allow nahi karta

- BUT:
Java interface ke through multiple inheritance allow karta hai
kyunki ambiguity resolve ho jaati hai
*/


/*
==================================================
4 POLYMORPHISM
==================================================

 Simple meaning:
Polymorphism = Same method name, different behavior

Matlab:
Ek hi method, alag-alag situation me
alag kaam karta hai.

--------------------------------------------------
WHY POLYMORPHISM?
--------------------------------------------------
- Code flexible hota hai
- New features add karna easy hota hai
- Runtime pe behavior change ho sakta hai
- SDE-level scalable design ke liye important

--------------------------------------------------
REAL WORLD EXAMPLE:
--------------------------------------------------
Payment System:
pay()

- pay() via UPI
- pay() via Card
- pay() via NetBanking

User ke liye method same hai,
andar ka behavior alag-alag.

--------------------------------------------------
TYPES OF POLYMORPHISM IN JAVA
--------------------------------------------------

Java me Polymorphism 2 types ka hota hai:

1 Compile-time Polymorphism
2 Run-time Polymorphism

==================================================
1 COMPILE-TIME POLYMORPHISM
(Method Overloading)
==================================================

 Meaning:
Same method name,
but different parameters.

Decision:
Compile time pe ho jata hai
(compiler decide karta hai kaunsa method call hoga)

--------------------------------------------------
RULES FOR METHOD OVERLOADING:
--------------------------------------------------
- Method name same
- Parameters different (number / type / order)
 Sirf return type change karke overloading nahi hoti

--------------------------------------------------
EXAMPLE:
--------------------------------------------------
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

--------------------------------------------------
WHY USE COMPILE-TIME POLYMORPHISM?
--------------------------------------------------
- Readable code
- Same logical operation, multiple ways
- Performance better (no runtime overhead)

--------------------------------------------------
INTERVIEW LINE:
--------------------------------------------------
"Method overloading is compile-time polymorphism
because method resolution happens at compile time."

==================================================
2 RUN-TIME POLYMORPHISM
(Method Overriding)
==================================================

 Meaning:
Parent class ka method,
child class apne version me redefine kare.

Decision:
Runtime pe hota hai
(JVM object ke type ke basis pe decide karta hai)

--------------------------------------------------
RULES FOR METHOD OVERRIDING:
--------------------------------------------------
- Same method name
- Same parameters
- IS-A relationship (inheritance required)
- Access modifier same ya wider hona chahiye
 static / final methods override nahi hote

--------------------------------------------------
EXAMPLE (Runtime Polymorphism):
--------------------------------------------------
*/

// Runtime polymorphism example
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

/*
--------------------------------------------------
IMPORTANT CONCEPT:
--------------------------------------------------
Shape shape = new Circle();
shape.draw();

 Reference type = Shape
 Object type    = Circle

Method call runtime pe resolve hoti hai,
isliye Circle ka draw() call hota hai.

--------------------------------------------------
WHY USE RUN-TIME POLYMORPHISM?
--------------------------------------------------
- Dynamic behavior
- Loose coupling
- Easily extensible systems
- Core concept in frameworks (Spring, Hibernate)

--------------------------------------------------
INTERVIEW LINE:
--------------------------------------------------
"Runtime polymorphism is achieved using method overriding
and dynamic method dispatch."

==================================================
SUMMARY (POLYMORPHISM)
==================================================

Compile-time Polymorphism:
- Method Overloading
- Compile time decision
- Faster

Run-time Polymorphism:
- Method Overriding
- Runtime decision
- Flexible & dynamic
==================================================
*/

/*
==================================================
FINAL INTERVIEW GOLD (GFG + AMAZON LEVEL)
==================================================

- Encapsulation → Data hiding
- Abstraction → Implementation hiding
- Inheritance → Code reuse
- Polymorphism → One name, many forms

ADVANCED POINTS:
- Overloading → Compile time
- Overriding → Runtime
- Prefer Composition to Inheritance
- OOPS = base of Low Level Design (LLD)

ONE-LINER:
"OOPS helps in building scalable, maintainable,
and flexible software systems."

==================================================
*/

