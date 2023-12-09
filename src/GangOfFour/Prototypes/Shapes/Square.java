package GangOfFour.Prototypes.Shapes;

public class Square extends Shape {

   public Square() {
      type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Square square = (Square) obj;
      return getType().equals(square.getType()) && getId().equals(square.getId());
   }
}