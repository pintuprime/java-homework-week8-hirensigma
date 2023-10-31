package pool_area;
//child class inheriate parent class
public class Cuboid extends Rectangle {//inheritance by extend keywords
    double height;//instance variable
    public Cuboid(double width, double length, double height) {//constructor with three parameters
        super(width, length);
        if (height < 0) {//if else loop used
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {//instance method
        return height;//return value of height
    }
    public double getVolume() {//instance method
        return (getArea() * height);//return value
    }
}



