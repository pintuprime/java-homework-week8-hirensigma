package homework_week_8;
/**
 *Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
import java.util.Scanner;
public class Programme_8_SymbolTriangle {
    //main method
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//Scanner declaration for reading input form console
        System.out.println("Entered right angle triangle pattern rows : ");
        int rows = scanner.nextInt();
        System.out.println("Print right angled triangle star pattern");
        // for loop used
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
            scanner.close();//closing scanner object
        }
    }
}
