package console_programs;

import java.util.Scanner;

/*
 * This program prompts the user to enter a number and then calculates 
 * the factorial of that number. It uses a for loop to iterate from 1 
 * to the entered number and multiplies the factorial by the current 
 * number in the loop at each iteration. The final result is then 
 * printed out.
 */

public class Factorial {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Initialize the factorial variable to 1
        int factorial = 1;

        // Loop from 1 to the entered number
        for (int i = 1; i <= num; i++) {
            // Multiply the factorial by the current number in the loop
            factorial *= i;
        }

        // Print out the result
        System.out.println("The factorial of " + num + " is: " + factorial);
    }
}
