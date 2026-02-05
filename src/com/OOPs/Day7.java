package com.OOPs;

import java.util.*;

/*
==================================================
        DAY 7 – COLLECTIONS, VECTOR, ENUMS
==================================================

Topics:
1) Collections Framework
2) Vector Class
3) Enums in Java (Deep)

==================================================
*/

public class Day7 {

    public static void main(String[] args) {

        /*
        ==================================================
        COLLECTIONS DEMO
        ==================================================
        */

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("ArrayList: " + list);

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(20);

        System.out.println("HashSet: " + set);

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);

        System.out.println("HashMap: " + map);

        /*
        ==================================================
        VECTOR DEMO
        ==================================================
        */

        Vector<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("DSA");
        vector.add("OOPS");

        System.out.println("Vector: " + vector);

        /*
        ==================================================
        ENUM DEMO
        ==================================================
        */

        System.out.println(Color.RED);

        for (Color c : Color.values()) {
            System.out.println(c + " ordinal = " + c.ordinal());
        }

        Color col = Color.valueOf("GREEN");
        System.out.println("valueOf(): " + col);

        // == comparison
        System.out.println(Color.RED == Color.RED); // true
    }
}

/*
==================================================
1 COLLECTIONS FRAMEWORK
==================================================

--> Collections Framework = Ready-made data structures

Hierarchy:

Iterable
  |
Collection
  |
------------------------------------------------
List        Set        Queue
------------------------------------------------
ArrayList  HashSet    PriorityQueue
LinkedList TreeSet
Vector

Map is separate:
HashMap, TreeMap, LinkedHashMap

--------------------------------------------------
WHY COLLECTIONS?
--------------------------------------------------
- Dynamic size
- Built-in algorithms (sort, search)
- Performance optimized
- Industry standard

--------------------------------------------------
LIST
--------------------------------------------------
- Allows duplicates
- Maintains insertion order
Example: ArrayList, LinkedList, Vector

--------------------------------------------------
SET
--------------------------------------------------
- No duplicates
- Order not guaranteed (HashSet)
- Sorted (TreeSet)

--------------------------------------------------
MAP
--------------------------------------------------
- Key-Value pair
- Keys unique

--------------------------------------------------
INTERVIEW POINTS
--------------------------------------------------
ArrayList → Fast random access
LinkedList → Fast insertion/deletion
HashSet → No duplicates
HashMap → Key-value storage

ArrayList internally uses dynamic array.
Time:
get() → O(1)
add() → Amortized O(1)

==================================================
*/

/*
==================================================
2 VECTOR CLASS
==================================================

-- Vector is legacy class (Java 1.0)

Properties:
-----------
-Thread-safe (synchronized)
- Allows duplicates
- Maintains order
- Slower than ArrayList

--------------------------------------------------
WHY VECTOR IS RARELY USED TODAY?
--------------------------------------------------
Because:
- Every method synchronized
- Performance slow

Modern replacement:
Collections.synchronizedList()
or CopyOnWriteArrayList

--------------------------------------------------
INTERVIEW ONE-LINER:
--------------------------------------------------
Vector is synchronized, ArrayList is not.

==================================================
*/

/*
==================================================
3 ENUMS IN JAVA (DEEP)
==================================================

** Enum = Enumeration = Named constants

Example:
RED, BLUE, GREEN

In Java:
Enum is a CLASS TYPE.

--------------------------------------------------
DECLARATION
--------------------------------------------------
Enum can be:
- Outside class
- Inside class
- Inside method (not allowed)

--------------------------------------------------
INTERNAL WORKING
--------------------------------------------------

enum Color { RED, BLUE }

Internally becomes:

class Color {
  public static final Color RED = new Color();
  public static final Color BLUE = new Color();
}

--------------------------------------------------
ENUM RULES
--------------------------------------------------

- All enums implicitly extend java.lang.Enum
- Enum cannot extend any other class
- Enum cannot be superclass
- Enum can implement interfaces
- toString() already overridden
- == can be used for comparison
= equals() also works (same constant required)

--------------------------------------------------
VALUES(), ORDINAL(), VALUEOF()
--------------------------------------------------

values()  → returns all constants
ordinal() → index (0 based)
valueOf() → string to enum

--------------------------------------------------
ENUM + CONSTRUCTOR
--------------------------------------------------

- Enum can have constructor
- Runs once per constant at class loading
- Constructor must be private/default
- public/protected not allowed

WHY?
Because public constructor allows creating new objects
which breaks enum concept.

--------------------------------------------------
ENUM + METHODS
--------------------------------------------------

- Enum can have concrete methods
- Enum cannot have abstract methods

--------------------------------------------------
ENUM + INHERITANCE
--------------------------------------------------

- Enum extends java.lang.Enum
- Enum cannot extend any other class
- Enum can implement multiple interfaces

--------------------------------------------------
EQUALITY
--------------------------------------------------

Color.RED == Color.RED  → true
equals() also true

Different enums having same ordinal
will NOT be equal.

--------------------------------------------------
INTERVIEW GOLD LINES
--------------------------------------------------

- Enum is type-safe constant
- Enum instances are singleton by default
- == preferred over equals()
- Enum constructor executes per constant
- valueOf throws exception if invalid string

==================================================
*/

/*
--------------------------------------------------
ENUM EXAMPLE
--------------------------------------------------
*/

enum Color {

    RED, GREEN, BLUE;

    // constructor (private by default)
    Color() {
        System.out.println("Enum constructor called for " + this);
    }
}

/*
==================================================
FINAL INTERVIEW SUMMARY
==================================================

- Collections = Data structure framework
- Vector = synchronized ArrayList (legacy)
- Enum = class of constants
- Enum extends java.lang.Enum
- Enum supports methods + constructors
- == works safely with enums

ONE-LINER:
----------
Enums are type-safe constants implemented as classes,
Collections provide optimized data structures.

==================================================
*/

