/**
 * CSC320 Module 4 Critical Thinking Assignment
 * Option #2 – Grade Statistics using a for-loop
 * Author: Amy Branson
 * Date: 2025-07-06
 */

import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int NUM_GRADES = 10;
        double total = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= NUM_GRADES; i++) {
            System.out.print("Enter grade #" + i + ": ");
            double grade = scanner.nextDouble();

            total += grade;

            if (grade > max) {
                max = grade;
            }
            if (grade < min) {
                min = grade;
            }
        }

        double average = total / NUM_GRADES;

        System.out.println("\n--- Grade Statistics ---");
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);

        scanner.close();
    }
}
