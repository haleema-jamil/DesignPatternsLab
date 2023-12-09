package GangOfFour.Prototypes.Shapes;

public class Rectangle extends Shape {

   public Rectangle() {
      type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Rectangle rectangle = (Rectangle) obj;
      return getType().equals(rectangle.getType()) && getId().equals(rectangle.getId());
   }
}