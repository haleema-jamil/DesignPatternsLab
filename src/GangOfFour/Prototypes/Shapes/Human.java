package GangOfFour.Prototypes.Shapes;

public class Human extends Avatar {

   public Human() {
      type = "Human";
   }

   @Override
   void display() {
      System.out.println("Human avatar");
   }
}