package GangOfFour.Facade.Shapes;

public class ShapeMaker {
   private Shape circle;
   private Shape rectangle;
   private Shape square;
   private Shape triangle;

   public ShapeMaker() {
      circle = new Circle();
      rectangle = new Rectangle();
      square = new Square();
      triangle = new Triangle();
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

   public void drawTriangle(String... arguments) {
      triangle.draw(arguments);
   }
}
