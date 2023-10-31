package homework_week_8;
import java.util.Scanner;
// Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
public class Programme_9_FibonacciNumber {
    //main method
    public static void main(String[] args) {
        int fibLength;
        Scanner scanner = new Scanner(System.in);//scanner object created
        System.out.println("Please enter Length");
        fibLength = scanner.nextInt();
        int[] num = new int[fibLength];
        //initialized first element to 0
        num[0] = 0;
        //initialized second element to 1
        num[1] = 1;
        //New number should be the sum of the last two numbers of the series.
        for (int i = 2; i < fibLength; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        System.out.println("Fibonacci series : ");
        for (int i = 0; i < fibLength; i++) {
            System.out.println(num[i] + " ");
        }
        scanner.close();//scanner close
    }
}
