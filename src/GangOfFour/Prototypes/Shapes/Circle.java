package GangOfFour.Prototypes.Shapes;

public class Circle extends Shape {

   public Circle() {
      type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Circle circle = (Circle) obj;
      return getType().equals(circle.getType()) && getId().equals(circle.getId());
   }
}