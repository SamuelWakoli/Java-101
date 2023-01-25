package console_programs;

import java.util.Scanner;

/*
 * This program prompts the user to enter the number of terms 
 * for the Fibonacci series and then generates the series using 
 * a for loop. It uses three integer variables a, b and c to 
 * keep track of the previous two terms and the next term. It
 * starts by initializing a and b as 0 and 1 respectively, and
 * then prints out the first two terms. In each iteration of 
 * the loop, it adds a and b to get the next term and prints it
 * out. Then it shifts the values of a and b over so that they
 * are ready for the next iteration.
 */

 public class Fibonacci {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int numOfTerms = scanner.nextInt();

        // Initialize the first two terms
        int a = 0, b = 1;

        // Print out the first two terms
        System.out.print(a + " " + b);

        // Loop from 2 to the number of terms
        for (int i = 2; i < numOfTerms; i++) {
            // Add the two previous terms to get the next term
            int c = a + b;
            // Print out the next term
            System.out.print(" " + c);
            // Shift the terms over for the next iteration
            a = b;
            b = c;
        }
    }
}
