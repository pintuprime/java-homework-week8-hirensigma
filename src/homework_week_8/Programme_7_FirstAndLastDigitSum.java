package homework_week_8;
import java.util.Scanner;
public class Programme_7_FirstAndLastDigitSum {
   public static int sumFirstAndLastDigits(int number) {//static method
        int first = number;
        int last = number % 10;
        for (first = number; first >= 10; first = first / 10) ;
        return first + last;
    }
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//scanner object
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
       // System.out.println("The sum of the first and Last digits: " + sumFirstAndLastDigits(number));
        System.out.println(sumFirstAndLastDigits(252));
        System.out.println(sumFirstAndLastDigits(257));
        System.out.println(sumFirstAndLastDigits(0));
        System.out.println(sumFirstAndLastDigits(5));
        System.out.println(sumFirstAndLastDigits(-10));
        scanner.close();//scanner close
    }
}
