package GangOfFour.Decorator.ColorPriceDecoration;

public class PriceDecorator extends ShapeDecorator {

    private double price;

    public PriceDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public double getPrice() {
        System.out.println("Price: 100");
        return price;
    }
}
