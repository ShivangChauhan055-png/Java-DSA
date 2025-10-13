package com.Conditions__Loops;

import java.util.*;

    public class CalculateCGPA {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();

            double totalGradePoints = 0;
            double totalCredits = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Enter grade point for subject " + i + ": ");
                double gradePoint = sc.nextDouble();

                System.out.print("Enter credit for subject " + i + ": ");
                double credit = sc.nextDouble();

                totalGradePoints += gradePoint * credit;
                totalCredits += credit;
            }

            double cgpa = totalGradePoints / totalCredits;

            System.out.printf("\nYour CGPA is: %.2f\n", cgpa);

            // Optionally convert CGPA to percentage
            double percentage = cgpa * 10.0;
            System.out.printf("Equivalent Percentage: %.2f%%\n", percentage);

            sc.close();
        }
    }


