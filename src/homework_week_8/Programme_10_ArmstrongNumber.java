package homework_week_8;
import java.util.Scanner;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3) where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27 so 1+125+27=153 by using scanner class
 */
public class Programme_10_ArmstrongNumber {
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner object created
        int temp;
        int total = 0;
        System.out.println("Enter 3 digit number : ");
        int num = scanner.nextInt();
        int number = num;
       //for loop used
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        //if else loop used
        if (total == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        scanner.close();//scanner close

    }
}
