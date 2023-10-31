package methodoverriding24;
//Test class to create object and call the methods
public class Test2 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        Icici i = new Icici();
        Axis a = new Axis();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getrateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getrateOfInterest());
    }
}
