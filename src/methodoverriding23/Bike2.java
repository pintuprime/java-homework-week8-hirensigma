package methodoverriding23;
//creating a child class
public class Bike2 extends Vehicle{
    //defining the same method in the parent class
    public void run(){
        System.out.println("bike is running safely");
    }
    public static void main(String[] args) {
        Bike2 obj = new Bike2();//creating object
        obj.run();//calling method
    }
}
