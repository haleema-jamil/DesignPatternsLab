package GangOfFour.Decorator.ColorPriceDecoration;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    private double price;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public double computeCost() {
        decoratedShape.computeCost();
        return price;
    }
}