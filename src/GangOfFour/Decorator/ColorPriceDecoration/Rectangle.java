package GangOfFour.Decorator.ColorPriceDecoration;

public class Rectangle implements Shape {

    private double price;

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public double computeCost() {
        return price;
    }
}
