package carpet_cost_calculator;
public class Calculator {
    Floor floor;//instance variable
    Carpet carpet;//instance variable

    public Calculator(Floor floor, Carpet carpet) {//constructor with 2 args
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost() {//instance method
        return floor.getArea() * carpet.getCost();
    }
}
