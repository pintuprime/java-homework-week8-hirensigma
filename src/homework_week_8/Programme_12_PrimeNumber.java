package homework_week_8;
import java.util.Scanner;
/**
 * . Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12_PrimeNumber {
    //main method
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//scanner object created
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        if (isPrime(n)) {// if else loop used
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        s.close();//scanner closed
    }
    //static method with arguments
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;//return type
    }
}
