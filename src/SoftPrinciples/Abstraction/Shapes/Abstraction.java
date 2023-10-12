package SoftPrinciples.Abstraction.Shapes;

abstract class Shape {
    
    String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double area();

    void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Circle extends Shape {

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

}

public class Abstraction {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 6.0);

        circle.displayInfo();
        System.out.println("Area: " + circle.area());

        rectangle.displayInfo();
        System.out.println("Area: " + rectangle.area());
    }
}