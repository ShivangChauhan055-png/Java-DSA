package com.Functions;

       /*
 1. Comparator kya hota hai?
Comparator Java ka ek functional interface hai jise hum custom sorting rules banane ke liye use karte hain.
Collections.sort() ya List.sort() ko pata nahi hota ki objects ko kaise compare kare, isliye hum comparator provide karte hain.

2. Comparator ka kaam
Comparator batata hai:
“Do objects ko kaise compare karna hai aur kis order me sort karna hai.”
Yeh sorting ko fully customize kar deta hai.

3. Comparator kab use hota hai?
Jab hum user-defined objects (Student, Employee, Book, etc.) sort karna chahte hain.
Example:
CGPA descending
Name ascending
ID ascending

4. Comparator banane ke 3 tareeke
(A) Anonymous Class (Most Common in Exams)

Collections.sort(list, new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getCgpa(), s1.getCgpa());
    }
});

(B) Lambda Expression (Java 8+)

list.sort((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()));

(C) Comparator Utility Methods

list.sort(
    Comparator.comparing(Student::getCgpa).reversed()
);

5. Multiple Condition Sorting (Most Important)
Hum comparator me multiple rules chain kar sakte hain:
 Pehle CGPA (desc)
 Fir Name (asc)
 Fir ID (asc)
Ye interview aur coding platform dono me lagta hi lagta hai.

*/
// Hacker Rank Ques Java Sort Code
import java.util.*;

public class ComparatorFunc {

    static class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() { return id; }
        public String getFname() { return fname; }
        public double getCgpa() { return cgpa; }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();

        List<Student> studentList = new ArrayList<>();

        while(testCases > 0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            studentList.add(new Student(id, fname, cgpa));
            testCases--;
        }

        // IMPORTANT: Comparator is inside the same file
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {

                // 1. CGPA descending
                if(s1.getCgpa() != s2.getCgpa()) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa());
                }

                // 2. Name ascending
                int nameCompare = s1.getFname().compareTo(s2.getFname());
                if(nameCompare != 0) {
                    return nameCompare;
                }

                // 3. ID ascending
                return Integer.compare(s1.getId(), s2.getId());
            }
        });

        // Output
        for(Student st : studentList){
            System.out.println(st.getFname());
        }
    }
}


/*
Short Summary for Notes

Comparator = Object sorting rule
Implement compare(s1, s2)
Return: -1 (before), +1 (after), 0 (equal)
Used inside Collections.sort() / List.sort()
Supports multiple sorting levels
Very important for sorting custom objects
 */
