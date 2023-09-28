package GangOfFour.Decorator.ColorPriceDecoration;

public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle();

      Shape redCircle = new RedShapeDecorator(new Circle());
      Shape PriceOfCircle = new PriceDecorator(new Circle());

      Shape redRectangle = new RedShapeDecorator(new Rectangle());
      Shape PriceOfRectangle = new PriceDecorator(new Rectangle());

      System.out.println("Circle with normal border");
      circle.draw();
      circle.computeCost();

      System.out.println("\nCircle of red border");
      redCircle.draw();
      PriceOfCircle.computeCost();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
      
   }
}