package console_programs;

/*
 * This program prompts the user to enter a word, and then checks 
 * if it is a palindrome. A palindrome is a word that is spelled 
 * the same way forward and backward. It uses a for loop to 
 * reverse the letters of the word and store it in a variable 
 * called reverse. Then it compares the original word and the 
 * reversed word, using the equalsIgnoreCase() method to compare 
 * them case-insensitively. If they are the same, it prints that 
 * the word is a palindrome. Otherwise, it prints that the word is 
 * not a palindrome.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a new Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Initialize an empty string to hold the reversed word
        String reverse = "";

        // Loop through the word in reverse order
        for (int i = word.length() - 1; i >= 0; i--) {
            // Add each character to the reversed string
            reverse += word.charAt(i);
        }

        // Compare the original word and the reversed word
        if (word.equalsIgnoreCase(reverse)) {
            // If they are the same, the word is a palindrome
            System.out.println(word + " is a palindrome");
        } else {
            // If they are not the same, the word is not a palindrome
            System.out.println(word + " is not a palindrome");
        }
    }
}

