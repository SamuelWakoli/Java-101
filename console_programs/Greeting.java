package console_programs;

import java.time.LocalTime;
import java.util.Scanner;

/*
 * In this code, the program gets the current time using 
 * the "LocalTime.now()"" method and then gets the hour 
 * of the day using the getHour() method. Then, it uses 
 * an if-else statement to check the hour of the day and 
 * greet the user based on the time of the day. 
 */
public class Greeting {
    public static void main(String[] args) {
        // create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        //get the current time
        LocalTime currentTime = LocalTime.now();
        //get the hour of the day
        int hour = currentTime.getHour();
        // greet the user based on the time of the day
        if(hour >= 6 && hour < 12) {
            System.out.println("Good morning " + name);
        }
        else if(hour >= 12 && hour < 18) {
            System.out.println("Good afternoon " + name);
        }
        else if(hour >= 18 && hour < 22) {
            System.out.println("Good evening " + name);
        }
        else {
            System.out.println("Good night " + name);
        }
        // close the scanner object
        input.close();
    }
}
