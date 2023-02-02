package console_programs;

import java.util.Calendar;
import java.util.Scanner;

public class AgeCalculator {
  public static void main(String[] args) {
    // Get the current date
    Calendar now = Calendar.getInstance();
    int currentYear = now.get(Calendar.YEAR);
    int currentMonth = now.get(Calendar.MONTH);
    int currentDay = now.get(Calendar.DAY_OF_MONTH);
    
    // Read the date of birth from the user
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your day of birth: ");
    int dayOfBirth = input.nextInt();
    System.out.print("Enter your month of birth (1-12): ");
    int monthOfBirth = input.nextInt() - 1; // Calendar uses 0-based months
    System.out.print("Enter your year of birth: ");
    int yearOfBirth = input.nextInt();
    
    // Create a Calendar instance to represent the date of birth
    Calendar dateOfBirth = Calendar.getInstance();
    dateOfBirth.set(yearOfBirth, monthOfBirth, dayOfBirth);
    
    // Calculate the age
    int age = currentYear - dateOfBirth.get(Calendar.YEAR);
    if (currentMonth < dateOfBirth.get(Calendar.MONTH)) {
      age--;
    } else if (currentMonth == dateOfBirth.get(Calendar.MONTH) && currentDay < dateOfBirth.get(Calendar.DAY_OF_MONTH)) {
      age--;
    }
    
    // Print the age
    System.out.println("Your age is: " + age);
  }
}
