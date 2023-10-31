package carpet_cost_calculator;

public class Floor {
    double width;//instance variable
    double length;//instance variable
    public Floor(double width, double length){//constructor method
        if(width > 0 && length < 0){//if else used
            this.width = width;
            this.length = 0.0;
        }else if(width < 0 && length > 0){
            this.width = 0.0;
            this.length = length;
        }else if(width < 0 && length < 0){
            this.width = width;
            this.length = length;
        }else{
            this.width = width;
            this.length = length;
        }
    }
    public double getArea(){//instance method
        return this.width * this.length;//return value
    }
}
