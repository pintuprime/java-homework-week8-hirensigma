package constructor_overloading;
//java program to overload constructors
public class Student5 {
    int id;//instance variable
    String name;//instance variable
    int age;
    //ceating two arg constructor
    Student5(int i, String n) {
        id = i;
        name = n;
    }
    //creating three arg constructor
    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }
    public void display() {//instance method
        System.out.println(id + " " + name + " " + age);
    }
    public static void main(String[] args) {//main method
        Student5 s1 = new Student5(111, "Karan");//object created
        Student5 s2 = new Student5(222, "Aryan");//object created
        s1.display();
        s2.display();
    }
}
