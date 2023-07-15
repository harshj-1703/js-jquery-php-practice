class Vehicle {
    private double wheels;

    public Vehicle() {
    }

    public Vehicle(double wheels) {
        this.wheels = wheels;
    }

    public void getWheels() {
        System.out.println("total wheels are : " + wheels);
    }
}

public class Inheritence extends Vehicle {
    public Inheritence(double wheels) {
        super(wheels);
    }

    public static void main(String[] args) {
        double wheels1 = 2;
        double wheels2 = 4;
        Vehicle vehicle = new Vehicle(wheels1);
        vehicle.getWheels();
        Inheritence vehicle1 = new Inheritence(wheels2);
        vehicle1.getWheels();
    }
}