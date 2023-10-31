package homework_week_8;
import java.util.Scanner;
/**
 * . -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number
 */
public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {//main method
        Scanner scan = new Scanner(System.in);//scanner object created
        int largeNumber = Integer.MIN_VALUE; // Integer declaration to take minimum possible allowed value
        int smallNumber = Integer.MAX_VALUE; // Integer declaration to take maximum possible allowed value
        int number;                         // Integer declaration to assign value later for output
        do { // keeps asking user for number until they enter -111
            System.out.print("Please enter a number, or enter -111 to stop entering: ");
            number = scan.nextInt(); // storing values in integer number
            if (number == -111) { // will break out of the loop if -111 has been entered
                break;
            } else {
                if (number > largeNumber) {
                    largeNumber = number; // assigning largest entered number value to number integer
                } else {
                    if (number < smallNumber) {
                        smallNumber = number; // assigning smallest entered number value to number integer
                    }
                }
            }
        } while (number != -111); // will print out large and small numbers if number does not equal to -111
        System.out.println("The smallest number is: " + smallNumber);
        System.out.println("The largest number is: " + largeNumber);
        scan.close();
    }
}
