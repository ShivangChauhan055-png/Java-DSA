package com.MemoryManangement;

public class Refrences {
    public static void main(String[] args) {
        /*
 1. Strong Reference (Default type)

Ye sabse common reference hota hai.

Jab tum normally koi object bnaate ho, wo strong reference hota hai.

String name = new String("Shivang");


Jab tak ye reference exist karega, Garbage Collector (GC) us object ko delete nahi karega.

Matlab: GC kabhi bhi “Strong referenced object” ko remove nahi karega jab tak reference hai.

 Example: Tumhara bag tumhare kandhe pe hai — jab tak tum pakad ke rakhe ho, koi usse nahi le sakta.

 2. Weak Reference

Ye thoda “soft” hota hai — GC isse delete kar sakta hai agar memory chahiye ho.

Isko WeakReference class se banate hain.

WeakReference<String> weakName = new WeakReference<>(new String("Shivang"));


Agar koi strong reference nahi hai, to GC free memory kar dega aur weak reference null ho jaayega.

 Example: Bag ground pe rakha hai — agar safai wala aaya to wo hata dega

 3. Soft Reference

GC tabhi delete karta hai jab memory kam pad rahi ho (low memory situation).

Isko SoftReference class se banate hain.

SoftReference<String> softName = new SoftReference<>(new String("Shivang"));


Ye cache jaisi situations mein useful hoti hai (jab data dobara banaya ja sakta hai).

 Example: Tumhara bag safe corner me rakha hai — jab tak zarurat nahi, koi usse nahi uthayega.

 4. Phantom Reference

Ye sabse “weakest” reference hota hai.

Object already deleted hota hai, bas GC ke cleanup ke baad track karne ke liye use hota hai.

PhantomReference class se banate hain, but directly object access nahi kar sakte.

PhantomReference<String> phantomName = new PhantomReference<>(new String("Shivang"), refQueue);


 Example: Tumhara bag gaya hi gaya — sirf uska record bacha hai system me
         */
    }
}
