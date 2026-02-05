package com.OOPs;

import java.util.*;
import java.util.function.*;

/*
==================================================
        OOP DAY 6
        Generics, Custom ArrayList,
        Lambda Expressions, Exception Handling,
        Object Cloning ( Shallow + Deep Copy )
==================================================

*/

public class Day6 {

    public static void main(String[] args) {

        System.out.println("Day 6: Advanced OOP");

/*
==================================================
1  GENERICS
==================================================

** Simple meaning:
Generics allow type-safety at compile time.

Instead of Object, we use:
<T>, <E>, <K,V>

WHY GENERICS?
-------------
- Avoid ClassCastException
- Type safety
- Reusable code

INTERVIEW LINE:
---------------
Generics provide compile-time type checking
and eliminate explicit casting.

--------------------------------------------------
GENERIC CLASS EXAMPLE
--------------------------------------------------
*/

        class GenericBox<T> {

            private T value;

            GenericBox(T value) {
                this.value = value;
            }

            public T getValue() {
                return value;
            }
        }

/*
Advanced Notes:
--------------
T → Type
E → Element
K,V → Key, Value

Bounded Generics:
<T extends Number>
Wildcards:
<?>, <? extends T>, <? super T>
*/

/*
==================================================
2 CUSTOM ARRAYLIST (BASIC IMPLEMENTATION)
==================================================

WHY?
----
Interview me poocha jaata hai:
"ArrayList internally kaise kaam karta hai?"

Core idea:
---------
- Backed by array
- Auto resize
*/

        class MyArrayList<T> {

            private Object[] data = new Object[2];
            private int size = 0;

            public void add(T value) {

                if (size == data.length) {
                    grow();
                }
                data[size++] = value;
            }

            private void grow() {
                data = Arrays.copyOf(data, data.length * 2);
            }

            public T get(int index) {
                return (T) data[index];
            }

            public int size() {
                return size;
            }
        }

/*
INTERVIEW POINT:
---------------
ArrayList grows by ~1.5x internally.
Time Complexity:
get() → O(1)
add() → Approx O(1)
*/

/*
==================================================
3 LAMBDA EXPRESSIONS
==================================================

=> Lambda = Anonymous function

Syntax:
(parameters) -> expression

WHY LAMBDA?
-----------
- Short code
- Functional programming
- Used heavily in Streams API

Works with:
-------------
Functional Interface (only ONE abstract method)

Examples:
Runnable
Comparator
Predicate
Consumer
Supplier
*/

/*
Example already shown in main()

INTERVIEW LINE:
--------------
Lambda expressions provide implementation
of functional interfaces.

/*
==================================================
4 EXCEPTION HANDLING (DETAILED)
==================================================

Exception = Runtime problem jo program ka
normal flow tod deti hai.

Example:
- Divide by zero
- Null pointer
- File not found

Agar handle na karo → Program crash ho jaata hai.

--------------------------------------------------
WHY EXCEPTION HANDLING?
--------------------------------------------------
- Program crash se bachata hai
- Proper error message deta hai
- Graceful recovery allow karta hai

Interview line:
--------------
Exception handling allows a program to continue
execution even after runtime errors.

==================================================
JAVA EXCEPTION KEYWORDS
==================================================

1 try      → risky code
2 catch    → exception handle
3 finally  → cleanup (always runs)
4 throw    → manually exception throw
5 throws   → exception declare

--------------------------------------------------
BASIC EXAMPLE
--------------------------------------------------
*/

        class ExceptionDemo {

            public static void main(String[] args) {

                try {
                    int x = 10 / 0;
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero");
                } finally {
                    System.out.println("Finally block always executes");
                }
            }
        }

/*
==================================================
TYPES OF EXCEPTIONS
==================================================

1 Checked Exceptions (Compile time)
----------------------------------
Compiler force karta hai handle karne ko.

Examples:
IOException
SQLException

2 Unchecked Exceptions (Runtime)
----------------------------------
Compiler force nahi karta.

Examples:
NullPointerException
ArrayIndexOutOfBoundsException

3 Errors (System level)
------------------------
OutOfMemoryError
(StackOverflowError)

Usually handle nahi karte.

==================================================
throw vs throws
==================================================

throw:
------
Manually exception create karta hai.

throws:
-------
Method bolta hai:
"main handle nahi karunga, caller kare"

--------------------------------------------------
EXAMPLE
--------------------------------------------------
*/

        class ThrowThrowsDemo {

            static void checkAge(int age) throws Exception {

                if (age < 18) {
                    throw new Exception("Not eligible");
                }

                System.out.println("Eligible");
            }
        }

/*
==================================================
CUSTOM EXCEPTION (ADVANCED)
==================================================

Apni exception bana sakte ho.
*/

        class MyCustomException extends Exception {

            MyCustomException(String msg) {
                super(msg);
            }
        }
    }
}

/*
Use:
throw new MyCustomException("Custom error");

==================================================
TRY-WITH-RESOURCES (Java 7+)
==================================================

Auto close resources.

Example:

try(FileReader fr = new FileReader("a.txt")) {
}

No need finally block.

==================================================
IMPORTANT INTERVIEW RULES
==================================================

- Multiple catch allowed
- Parent exception hamesha last me
- try ke bina catch nahi hota
- finally almost always runs
- Cloneable is marker interface (related concept)

==================================================
REAL WORLD ANALOGY
==================================================

try     → kaam karo
catch   → problem sambhalo
finally → safai karo

==================================================
INTERVIEW GOLD ONE-LINERS
==================================================

- Checked exceptions → compile time
- Unchecked exceptions → runtime
- finally always executes
- throw creates exception
- throws declares exception

==================================================
*/


/*
==================================================
5 OBJECT CLONING + SHALLOW COPY + DEEP COPY
==================================================

-- Object Cloning ka matlab:
Existing object ka exact copy banana.

Java me cloning karne ke liye:

1) Class ko Cloneable interface implement karna padta hai
2) clone() method override karna padta hai

--------------------------------------------------
IMPORTANT POINTS (INTERVIEW)
--------------------------------------------------

- clone() Object class ka protected method hota hai
- Cloneable ek MARKER interface hai (empty interface)
- Agar Cloneable implement nahi kiya →
   CloneNotSupportedException aata hai

==================================================
SHALLOW COPY
==================================================

-- Shallow copy me:

- Primitive values copy ho jaati hain
- Object references SAME rehte hain

Matlab:
Original aur cloned object
same inner object share karte hain

--------------------------------------------------
SHALLOW COPY EXAMPLE
--------------------------------------------------
*/

class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class PersonShallow implements Cloneable {

    String name;
    Address address;

    PersonShallow(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // SHALLOW COPY
    }
}

/*
Effect:
-------
Agar address change karo cloned object me,
original me bhi change ho jaata hai.

WHY?
----
Kyuki dono same Address object share kar rahe hote hain.

==================================================
DEEP COPY
==================================================

-- Deep copy me:

- Primitive values bhi copy hoti hain
- Inner objects ka bhi NEW object ban jaata hai

Matlab:
Original aur cloned object
completely independent hote hain.

--------------------------------------------------
DEEP COPY EXAMPLE
--------------------------------------------------
*/

class PersonDeep implements Cloneable {

    String name;
    Address address;

    PersonDeep(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        // First shallow copy
        PersonDeep temp = (PersonDeep) super.clone();

        // Then deep copy inner object
        temp.address = new Address(this.address.city);

        return temp;
    }
}

/*
==================================================
COMPARISON (INTERVIEW TABLE)
==================================================

SHALLOW COPY:
-------------
- Faster
- References shared
- Not safe for mutable objects

DEEP COPY:
----------
- Completely independent objects
- Safe
- Slightly slower

==================================================
REAL WORLD ANALOGY
==================================================

Shallow Copy:
-------------
Photocopy of house key
(same house access)

Deep Copy:
----------
New house + new key

==================================================
INTERVIEW GOLD ONE-LINERS
==================================================

- Shallow copy shares references
- Deep copy creates new inner objects
- Cloneable is marker interface
- clone() performs shallow copy by default
- Deep copy must be manually implemented

==================================================
*/




/*
INTERVIEW POINTS:
---------------
✔ clone() protected hota hai (Object class me)
✔ Cloneable is marker interface
✔ Without Cloneable → CloneNotSupportedException

==================================================
FINAL INTERVIEW SUMMARY
==================================================

✔ Generics → Type safety
✔ Custom ArrayList → Dynamic array logic
✔ Lambda → Functional programming
✔ Exception Handling → Runtime safety
✔ Cloning → Object copying

ONE-LINER:
----------
These concepts improve robustness, reusability,
and modern Java design.

==================================================
*/

