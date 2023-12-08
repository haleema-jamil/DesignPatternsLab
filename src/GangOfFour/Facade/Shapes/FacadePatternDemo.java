package GangOfFour.Facade.Shapes;

public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();

      shapeMaker.drawCircle("red", "large");
      shapeMaker.drawRectangle("blue", "medium");
      shapeMaker.drawSquare("green", "small");
      shapeMaker.drawTriangle("yellow", "extra large");
   }
}
