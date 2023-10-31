package pool_area;
//parent class
public class Rectangle {
    double width;//instance variable
    double length;//instance variable
    public Rectangle(double width, double length) {//constructor with 2 parameters
        if ((width < 0) && (length < 0)) {//nested if used
            this.width = 0;
            this.length = 0;
        } else if ((width < 0) && (length > 0)) {
            this.width = 0;
            this.length = length;
        } else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        } else {
            this.width = width;
            this.length = length;
        }
    }
    public double getWidth() {//instance method
        return width;//return value
    }
    public double getLength() {//instance method
        return length;//return value
    }
    public double getArea() {//instance method
        return (width * length);//return value
    }
}
