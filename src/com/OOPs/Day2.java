package com.OOPs;

/*
==================================================
                JAVA PACKAGES
==================================================

 Package = classes ka folder

Packages are containers for classes.
Matlab:
- Classes ko organize karne ke liye
- Name clash avoid karne ke liye

Example:
Aap apni class ka naam List rakh sakte ho
aur wo java.util.List se clash nahi karegi
kyunki dono alag-alag packages me hain.

Packages hierarchical hote hain
aur unko explicitly import kr sakte hai.

--------------------------------------------------

Package ka role:
---------------
Package do kaam karta hai:
1) Naming mechanism  → class ka proper address deta hai
2) Visibility control → kya accessible hoga, kya nahi

--------------------------------------------------

Package create karna:
--------------------
package com.OOPs;

Ye statement hamesha file ki FIRST line hoti hai

--------------------------------------------------

Package & File System:
----------------------
Java packages ko folders ke form me store karta hai.

package com.OOPs;

Folder structure:
com/OOPs/

 Rules:
- Folder name exactly package name jaisa hona chahiye
- Case-sensitive hota hai (OOPs ≠ oops)

--------------------------------------------------

Package hierarchy example:
--------------------------
package java.awt.image;

Windows:
java\awt\image

Linux / Mac:
java/awt/image

 Package ka naam badalne ke liye
folder ka naam bhi badalna padta hai

--------------------------------------------------

Java package ko kaise dhundta hai?
----------------------------------
1) Current working directory
2) CLASSPATH environment variable
3) -classpath option (javac / java)

--------------------------------------------------

Access Control:
---------------
Package import karne ke baad
sirf PUBLIC members hi accessible hote hain
(non-subclasses ke liye)

==================================================
*/


public class Day2 {

    public static void main(String[] args) {

        System.out.println("Day 2: Packages + Static");

        // Same package ki class hai, isliye import ki need nahi
        MyList list = new MyList();
        list.show();

        // Static method demo
        Human kunal = new Human();
        kunal.message = "Kunal's message";
        Human.display(kunal);

        // Static block demo
        UseStatic.meth(42);

        // Static nested class demo
        StaticOuter.Test a = new StaticOuter.Test("Kunal");
        StaticOuter.Test b = new StaticOuter.Test("Rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}


/*
--------------------------------------------------
 Class inside same package
--------------------------------------------------
*/
class MyList {

    public void show() {
        System.out.println("Class List inside same package");
    }
}


/*
==================================================
            UNDERSTANDING STATIC
==================================================

 static = class se belong karta hai, object se nahi

Jab koi member static hota hai:
- Object banne se pehle use ho sakta hai
- Sirf ek hi copy hoti hai (class level)

Example:
main() static hota hai kyunki
program start hone se pehle
koi object exist nahi karta.

--------------------------------------------------

Static Method Rules (easy language):
-----------------------------------
 Class se call hota hai
 Object ki need nahi
 Sirf static data access kar sakta hai
 this / super use nahi kar sakta
 Direct non-static members access nahi kar sakta

--------------------------------------------------

Non-static members:
-------------------
- Object (instance) se belong karte hain
- Har object ki apni alag copy hoti hai
*/


class Human {

    String message = "Hello World"; // instance variable

    // static method me instance variable
    // sirf object reference se hi access hota hai
    public static void display(Human human) {
        System.out.println(human.message);
    }
}


/*
--------------------------------------------------
 Static Variables, Methods & Static Block
--------------------------------------------------
*/

class UseStatic {

    static int a = 3;   // static variable
    static int b;

    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // Static block:
    // Class load hote hi EK BAAR execute hota hai
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
}

/*
Execution samjho:
-----------------
1) Class load hoti hai
2) Static variables set hote hain
3) Static block execute hota hai
4) main() call hota hai
5) Static method call hota hai

Output:
Static block initialized.
x = 42
a = 3
b = 12
*/


/*
--------------------------------------------------
 Static Nested Class
--------------------------------------------------

IMPORTANT POINTS:
 Sirf nested classes hi static ho sakti hain
 Static nested class ko outer class ka object nahi chahiye
 Static nested class ke apne objects ho sakte hain
*/

class StaticOuter {

    // Static nested class
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
}

/*
Reason (simple):
----------------
Static nested class ka
outer class ke instance se koi relation nahi hota.

Jaise static method ke paas "this" nahi hota,
waise hi static nested class ke paas
outer class ka object nahi hota.

==================================================

SINGLETON CLASS
==================================================

 Singleton class = poore program me sirf EK object

Rules:
1) Constructor private
2) Static object
3) Public static method for access
*/

class Singleton {

    // Single object (class level)
    private static final Singleton INSTANCE = new Singleton();

    // Private constructor (new keyword block)
    private Singleton() {}

    // Global access point
    public static Singleton getInstance() {
        return INSTANCE;
    }
}

/*
Extra points (INTERVIEW):
------------------------
 Singleton memory save karta hai
 Database / Logger me use hota hai
 Static method override nahi hota
 Static methods compile-time pe resolve hote hain
*/
