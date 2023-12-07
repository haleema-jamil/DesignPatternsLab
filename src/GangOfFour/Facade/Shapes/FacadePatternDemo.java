package GangOfFour.Facade.Shapes;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle("red", "bordered");
        shapeMaker.drawRectangle("blue");
        shapeMaker.drawSquare("green", "filled");
    }
}