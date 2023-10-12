package SoftPrinciples.Composition.Car;

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private String brand;
    private Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine(); 
    }

    public void startCar() {
        System.out.println(brand + " car is starting...");
        engine.start();
    }
}

public class Composition {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota");

        myCar.startCar();
    }
}