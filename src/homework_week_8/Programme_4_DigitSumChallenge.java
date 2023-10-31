package homework_week_8;
import java.util.Scanner;
/**
 * . Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments
 */
public class Programme_4_DigitSumChallenge {
    public static void sumDigits(int number) {//main method
        if (number >= 10) {
            int sum = 0;
            while (number > 0) {
                sum = sum + (number % 10);// to get last digit ans sum with previous last digit
                number = number / 10;  // to get remaining number after removing last digit
            }
            System.out.println("Adition of digits is : " + sum);
        }
        System.out.println();
    }
    //main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.println("Please input 3 digit number:");
        int number = scanner.nextInt();
        sumDigits(number);
        scanner.close();//scanner close
    }
}
