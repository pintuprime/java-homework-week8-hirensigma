package homework_week_8;
//Display left angle triangle of * using nested for loops
public class Programme_15_LeftAngleTriangle {
    //static method
    public static void printLeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {//nested for loop used
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //main method
    public static void main(String[] args) {
        int n = 5;
        printLeftTriangle(n);//static method called
    }

}