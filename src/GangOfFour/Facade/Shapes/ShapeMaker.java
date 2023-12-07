package GangOfFour.Facade.Shapes;

class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(String... arguments) {
        circle.draw(arguments);
    }

    public void drawRectangle(String... arguments) {
        rectangle.draw(arguments);
    }

    public void drawSquare(String... arguments) {
        square.draw(arguments);
    }
}