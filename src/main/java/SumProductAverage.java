/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

// Re-run autograder

import java.util.Scanner;
public class SumProductAverage
{
    public static void main(String[] args)
    {
        // Prompt for number of runs
        System.out.print("How many times do you want to run the program?  ");
        int runs = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= runs; i++){
            // Prompt for 3 numbers
            System.out.print("Enter number 1:  ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number 2:  ");
            double num2 = sc.nextDouble();
            System.out.print("Enter number 3:  ");
            double num3 = sc.nextDouble();

            // Find the average of the numbers
            System.out.println();
            double avg = (num1+num2+num3)/3;
            System.out.println("The average is "+avg);

            // Find the sum of the numbers
            double sum = num1+num2+num3;
            System.out.println("The sum is "+sum);

            // Find the product of the numbers
            double product = num1*num2*num3;
            System.out.println("The product is "+product);
            System.out.println();
        }
    }
}
