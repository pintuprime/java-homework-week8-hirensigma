package carpet_cost_calculator;

public class Main {//main method
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);//object created carpet class
        Floor floor = new Floor(2.75, 4.0);//object created floor class
        Calculator calculator = new Calculator(floor, carpet);//obj created calculator class
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }
}
