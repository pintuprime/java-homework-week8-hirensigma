package homework_week_8;
/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the valueof the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 */
public class SimpleCalculator {
    double firstNumber;//instance variable
    double secondNumber;//instance variable
    public static void main(String[] args) {//   main method
        SimpleCalculator calculator = new SimpleCalculator();//object created
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
    public double getFirstNumber() {//instance method
        return firstNumber;//return value
    }
    public double getSecondNumber() {//instance method
        return secondNumber;//return value
    }
    public void setFirstNumber(double firstNumber) {//instance method with 1 arguments
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {//instance method with 1 arguments
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {// instance method
        return firstNumber + secondNumber;//return value
    }
    public double getSubtractionResult() {// instance method
        return firstNumber - secondNumber;//return value
    }
    public double getMultiplicationResult() {//instance method
        return firstNumber * secondNumber;//return value
    }
    public double getDivisionResult() {// instance method
        if (secondNumber == 0) {//if else loop used
            return this.secondNumber = 0;
        } else {
            return firstNumber / secondNumber;
        }
    }
}
