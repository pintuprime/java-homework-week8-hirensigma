package homework_week_8;
/**
 * 3. Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false
 */
public class Programme_13_ShareDigit {
    // Main method calling hasSharedDigit method and providing test data to check result.
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    // Static boolean method returning true or false according to if and while statement
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        // if any of the numbers are less than 10 or greater than 99 return false
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }
        // logic to find modulus and remainder in both digits and checking if they equal then return true or false accordingly
        int testFirstNumber = firstNumber;
        while (testFirstNumber != 0) {
            int testSecondNumber = secondNumber;
            while (testSecondNumber != 0) {
                if ((testFirstNumber % 10) == (testSecondNumber % 10)) {
                    return true;
                }
                testSecondNumber /= 10;
            }
            testFirstNumber /= 10;
        }
        return false;
    }
}


