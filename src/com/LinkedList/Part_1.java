package com.LinkedList;

/*
========================================
        LINKED LIST - FULL NOTES
========================================

--> WHAT IS LINKED LIST?

Linked List ek linear data structure hai
jisme elements "nodes" ke form me store hote hain

Har node ke paas 2 cheeze hoti hain:
1. Data
2. Next pointer (next node ka reference)

----------------------------------------
--> REAL LIFE INTUITION:

Soch train  jisme har bogie ek node hai

[Data | Next] -> [Data | Next] -> [Data | Next] -> null

----------------------------------------
--> ARRAY VS LINKED LIST:

ARRAY:
-- Fixed size
-- Contiguous memory
-- Insert/delete costly not possible

LINKED LIST:
-- Dynamic size
-- Non-contiguous memory
-- Easy insertion/deletion
-- Extra memory (pointer) --> 12 BYTES (3X more than array)

----------------------------------------
 IMPORTANT TERMS:

HEAD → first node
TAIL → last node (next = null)

----------------------------------------
 NODE STRUCTURE:
*/

class Node {
    int data;
    Node next;

    // constructor
    Node(int data) {
        this.data = data; // this.data represents variable node and  = data is parameter of constructor
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

/*
========================================
        HOW LINKED LIST WORKS
========================================

Example:
arr = [2,5,8,7]

2 -> 5 -> 8 -> 7 -> null

----------------------------------------
-- MEMORY:

Array:
[2][5][8][7] (continuous)

Linked List:
2 -> (random memory)
5 -> (random memory)
8 -> (random memory)

----------------------------------------
-- POINTER / REFERENCE (JAVA):

Java me direct pointer nahi hota
→ hum "reference" use karte hain

Node next → next node ka reference store karta hai

----------------------------------------
*/

public class Part_1 {
    /*
    ========================================
            CREATE LINKED LIST
    ========================================
    */
    public static Node createList(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        return head;
    }

    /*
    ========================================
            TRAVERSE LINKED LIST
    ========================================
    */
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    /*
    ========================================
            INSERT AT BEGINNING
    ========================================
    */
    public static Node insertAtHead(Node head, int val) {

        Node newNode = new Node(val);
        newNode.next = head;

        return newNode;
    }

    /*
    ========================================
            INSERT AT END
    ========================================
    */
    public static Node insertAtTail(Node head, int val) {

        Node newNode = new Node(val);

        if (head == null) return newNode;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    /*
    ========================================
            DELETE HEAD
    ========================================
    */
    public static Node deleteHead(Node head) {

        if (head == null) return null;

        return head.next;
    }

    /*
    ========================================
            DELETE TAIL
    ========================================
    */
    public static Node deleteTail(Node head) {

        if (head == null || head.next == null) return null;

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    /*
    ========================================
            MAIN METHOD (TESTING)
    ========================================
    */
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 7};

        Node head = createList(arr);

        System.out.print("Original: ");
        printList(head);

        head = insertAtHead(head, 1);
        System.out.print("After Insert Head: ");
        printList(head);

        head = insertAtTail(head, 10);
        System.out.print("After Insert Tail: ");
        printList(head);

        head = deleteHead(head);
        System.out.print("After Delete Head: ");
        printList(head);

        head = deleteTail(head);
        System.out.print("After Delete Tail: ");
        printList(head);
    }
}


/*
========================================
        TYPES OF LINKED LIST
========================================

1 Singly Linked List
   → only next pointer
   → forward traversal only

2 Doubly Linked List
   → prev + next
   → forward + backward traversal

3 Circular Linked List
   → last node → head
   → loop ban jata hai

----------------------------------------
========================================
        MEMORY ANALYSIS
========================================

32-bit:
int = 4 bytes
pointer = 4 bytes → total = 8 bytes

64-bit:
int = 4 bytes
pointer = 8 bytes → total = 12 bytes

----------------------------------------
========================================
        APPLICATIONS
========================================

✔ Stack
✔ Queue
✔ Dynamic memory allocation
✔ Browser history
✔ Undo/Redo systems

----------------------------------------
========================================
        INTERVIEW IMPORTANT POINTS
========================================

🔥 WHY LINKED LIST?
→ Dynamic size
→ Fast insertion/deletion

🔥 DRAWBACK:
→ Random access nahi hota
→ extra memory lagta hai

🔥 MUST KNOW OPERATIONS:
✔ Traversal
✔ Insertion
✔ Deletion
✔ Reverse Linked List (VERY IMPORTANT)

----------------------------------------
========================================
        GOLDEN LINE
========================================

"Linked List = Nodes connected by pointers, not by memory location"

========================================
*/


