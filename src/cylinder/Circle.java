package cylinder;
public class Circle {
    double radius;//instance variable
    public Circle(double radius) {//constructor class with one parameter
        this.radius = radius;
        if (radius < 0) {
            this.radius = 0;
        }
    }
    public double getRadius() {// instance method
        return radius;//return value
    }
    public double getArea() {// instance method
        return (Math.pow(this.radius, 2) * Math.PI);//return value
    }
}
