public class Vehicle {
    protected String brand;
    public void honk() {
        System.out.println("Tuut, tuut");
    }
}
class Car extends Vehicle
{
    public String modelName = "Mustang";

}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
