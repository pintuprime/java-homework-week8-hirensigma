package homework_week_8;
import java.util.Scanner;
/**
 *  Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 */
public class Programme_1_ReadingUserInputChallenge {
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//scanner object
        int count = 1; // Integer Declaration
        int sum = 0;
        while (count <= 10) { // While loop ensuring only 10 inputs are allowed
            System.out.println("Please Enter number " + count); // Asking user to enter numbers in sequence
            boolean validateNumber = scanner.hasNextInt(); // Making sure user only enters numbers
            if (validateNumber) {
                int number = scanner.nextInt();
                sum += number; // Assignment operator for adding the numbers inserted
                count++; // incrementing count value displayed everytime user enters a number
            } else {
                System.out.println("Invalid number!"); // Will tell user they have not entered a number
            }
            // Asking for new user input
            scanner.nextLine();
        }
        System.out.println("Sum of all numbers = " + sum); // Printing the total of all 10 numbers entered
        scanner.close();
    }
}



