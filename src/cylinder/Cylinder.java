package cylinder;
//child cylinder inheritance parent class circle
public class Cylinder extends Circle {
    double height;//instance variable
    public Cylinder(double radius, double height) {//constructor with two parameters
        super(radius);
        this.height = height;
        if (height < 0) {//if condition used
            this.height = 0;
        }
    }
    public double getHeight() {//instance method
        return height;//return value
    }
    public double getVolume() {//instance method
        return (super.getArea() * getHeight());//return value
    }
}