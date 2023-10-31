package carpet_cost_calculator;
public class Carpet {
    double cost;//instance variable

    public Carpet(double cost) {//conctructor method
        if (cost < 0) {//if else used
            this.cost = 0.0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost() {//instance method
        return this.cost;
    }//return value
}
