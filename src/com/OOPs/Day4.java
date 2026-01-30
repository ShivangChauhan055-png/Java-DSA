package com.OOPs;

/*
==================================================
        ACCESS CONTROL IN JAVA (DAY 4)
==================================================

Access Control ka matlab:
------------------------
Class ke members (variables / methods) ko
KAUN access kar sakta hai aur KAHA se,
ye decide karna.

Java me access control
ACCESS MODIFIERS ke through hota hai.

==================================================
*/

/*
==================================================
ACCESS MODIFIERS IN JAVA
==================================================

Java me 4 access levels hote hain:

1) public
2) protected
3) default (no modifier)
4) private

Access modifier lagta hai:
- class
- variable
- method
- constructor

==================================================
*/

public class Day4 {

    public static void main(String[] args) {
        System.out.println("Day 4: Access Control in Java");
    }
}

/*
==================================================
1 PUBLIC
==================================================

Meaning:
--------
public member ko
kahin se bhi access kar sakte ho.

- Same class
- Same package
- Different package
- Subclass
- Non-subclass

WHY use public?
---------------
- Jab feature sabko available karna ho
- APIs, libraries, utility methods

Example:
*/
class PublicExample {

    public int x = 10;

    public void show() {
        System.out.println("Public method");
    }
}

/*
==================================================
2 PRIVATE
==================================================

Meaning:
--------
private member sirf
USI class ke andar accessible hota hai.

- Same class
- Bahar kahin bhi nhi

WHY use private?
----------------
- Data hiding
- Security
- Encapsulation achieve karne ke liye

Real World Example:
------------------
ATM ka cash box
sirf ATM ke andar accessible

Example:
*/
class PrivateExample {

    private int balance = 1000;

    private void secret() {
        System.out.println("Private method");
    }
}

/*
==================================================
3 DEFAULT (NO MODIFIER)
==================================================

Meaning:
--------
Jab koi access modifier nahi lagate,
to wo DEFAULT hota hai.

Accessible:
-----------
- Same class
- Same package
- Different package nhi kr sakte h
- Subclass (different package) m nhi kr sakte h

WHY use default?
----------------
- Package-level access chahiye
- Internal helpers ke liye

Example:
*/
class DefaultExample {

    int data = 50;   // default access

    void show() {
        System.out.println("Default access");
    }
}

/*
==================================================
4 PROTECTED (MOST CONFUSING )
==================================================

Meaning (simple):
-----------------
protected member accessible hota hai:
1) Same package ke andar (ANY class)
2) Different package me SIRF subclass ke through

protected = default + inheritance

WHY protected?
---------------
- Subclasses ko power dene ke liye
- Lekin world ko nahi

==================================================
IMPORTANT RULE (YAAD RAKH)
==================================================

 Different package me protected member:
 Parent class ke object se access nahi
 Child class ke object se access hota h

==================================================
*/

/*
========================
PACKAGE ONE
========================
*/
class Base {

    protected void display() {
        System.out.println("Inside Base");
    }
}

/*
========================
PACKAGE TWO (IMAGINE)
========================

class Derived extends Base {

    void show() {

        new Base().display();      //  NOT ALLOWED
        new Derived().display();   //  ALLOWED
        display();                 //  ALLOWED
    }
}

--------------------------------------------------
WHY?
--------------------------------------------------

display() aur new Derived().display():
-------------------------------------
- Caller object Derived ka hai
- Derived is a subclass
- Subclass ko protected member ka access milta hai

new Base().display():
--------------------
- Object Base ka hai
- Base different package me hai
- Protected member ko parent ke object se
  access karna allowed nahi

==================================================
CORE IDEA (VERY IMPORTANT)
==================================================

Protected ka matlab ye nahi ki
"parent ka protected sab jagah accessible hai"

Protected ka matlab:
--------------------
 Subclass apne inherited member ko use kar sakta hai
 Subclass parent ke object ke through access nahi kar sakta

==================================================
*/

/*
==================================================
RULE IN ONE LINE (INTERVIEW GOLD)
==================================================

In a different package, a protected member can be
accessed only through a subclass reference,
not through a superclass reference.

==================================================
*/

/*
==================================================
INTUITION (REAL THINKING)
==================================================

Socho:
------
Class S extends C

Agar S ko allow kar diya jaaye ki
C ke kisi bhi object ka protected data access kare,
to S kisi aur subclass (S2) ka data bhi chhed sakta hai.

Ye dangerous hai.

Isliye Java rule banata hai:
-----------------------------
 Apna data (inherited) use karo
 Dusre subclass ka data mat chhedo

==================================================
*/

/*
==================================================
ACCESS SUMMARY (WORDS TABLE)
==================================================

public:
- Everywhere

private:
- Only same class

default:
- Same package only

protected:
- Same package (any class)
- Different package (only subclass, via subclass object)

==================================================
*/

/*
==================================================
FINAL INTERVIEW ONE-LINERS
==================================================

- private → maximum restriction
- public → minimum restriction
- default → package-level access
- protected → package + inheritance

- protected is about INHERITING, not OBJECT ACCESS

// diff between == & .equals
== compares references, .equals() compares content
Always use .equals() for object comparison
Override .equals() for custom classes

==================================================

/*
==================================================
INSTANCEOF OPERATOR IN JAVA
==================================================

-- instanceof operator check karta hai ki
koi object kisi particular class,
subclass ya interface ka instance hai ya nahi.

Result hamesha boolean hota hai:
true / false

==================================================
SYNTAX
==================================================

object instanceof ClassName

==================================================
*/

/*
==================================================
BASIC EXAMPLE
==================================================
*/
class AnimalInstance {}

class DogInstance extends AnimalInstance {}

class InstanceOfDemo {

    public static void main(String[] args) {

        AnimalInstance a = new DogInstance();

        System.out.println(a instanceof DogInstance);     // true
        System.out.println(a instanceof AnimalInstance);  // true
    }
}

/*
WHY?
-----
DogInstance extends AnimalInstance
Isliye DogInstance object,
AnimalInstance ka bhi instance hota hai.
*/

/*
==================================================
REAL WORLD EXAMPLE
==================================================

Vehicle → Car

Car IS-A Vehicle
Vehicle IS-NOT-A Car

instanceof IS-A relationship check karta hai
*/

/*
==================================================
INSTANCEOF WITH INTERFACE
==================================================
*/

interface Payment {}

class UPI implements Payment {}

class InterfaceInstanceOf {

    public static void main(String[] args) {

        Payment p = new UPI();

        System.out.println(p instanceof UPI);       // true
        System.out.println(p instanceof Payment);  // true
    }
}

/*
==================================================
INSTANCEOF WITH NULL (IMPORTANT)
==================================================
*/

class NullInstanceOf {

    public static void main(String[] args) {

        DogInstance d = null;

        System.out.println(d instanceof DogInstance); // false
    }
}

/*
NOTE:
-----
null kisi bhi class ka instance nahi hota,
isliye result hamesha false hota hai.
*/

/*
==================================================
INSTANCEOF FOR SAFE CASTING (INTERVIEW IMPORTANT)
==================================================

instanceof ka use:
- Downcasting se pehle
- ClassCastException avoid karne ke liye
*/

class CastingExample {

    public static void main(String[] args) {

        AnimalInstance a = new DogInstance();

        if (a instanceof DogInstance) {
            DogInstance d = (DogInstance) a; // safe casting
            System.out.println("Safe casting done");
        }
    }
}

/*
==================================================
INSTANCEOF vs getClass()
==================================================

a instanceof DogInstance
→ true (subclass bhi allowed)

a.getClass() == DogInstance.class
→ true sirf exact class ke liye

instanceof → IS-A relationship
getClass() → EXACT type check
*/

/*
==================================================
INTERVIEW ONE-LINERS (GOLD)
==================================================

 instanceof checks object type at runtime
 Works with class, subclass, and interface
 Used for safe downcasting
 null instanceof AnyClass = false

==================================================
*/



