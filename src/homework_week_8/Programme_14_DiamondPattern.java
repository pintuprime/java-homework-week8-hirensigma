package homework_week_8;
import java.util.Scanner;
/**
 * . Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class Programme_14_DiamondPattern {
    //main method
    public static void main(String[] args) {
        int number = 7; //Variable initialized to the row where max star
        // should be there as after that they decrease to give diamond pattern
        int m = 1; // Diamond starting with single star in first row
        int n;

        // Outer loop 1 which Prints the first half of the diamond
        while (m <= number) {
            n = 1;
            while (n++ <= number - m) { // Inner loop 1 which Prints space until n++ <= number - m is false
                System.out.print(" "); // Print whitespaces in between
            }
            n = 1;
            while (n++ <= m * 2 - 1) { // Inner loop 2 which Prints star until n++ <= m * 2 - 1 is false
                System.out.print("*");
            }
            System.out.println();
            m++; // Incrementing by one for pyramid generation
        }
        // Outer loop 1 which Prints the second half of the diamond
        m = number - 1; //variable to be initialized be should one lesser than number
        while (m > 0) { // Outer loop 2 which Prints the second half diamond
            n = 1;

            while (n++ <= number - m) { // Inner loop 1 which Prints spaces until n++ <= number - m is false
                System.out.print(" "); // // leave space in between rows
            }

            n = 1;
            while (n++ <= m * 2 - 1) { // Inner loop 2 which Prints star until n++ <= m * 2 - 1 is false
                System.out.print("*");
            }
            System.out.println();
            m--;   // Decrementing as we want lower part of  pyramid
        }
    }

}
