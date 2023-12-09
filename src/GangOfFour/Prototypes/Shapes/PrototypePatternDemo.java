package GangOfFour.Prototypes.Shapes;

// PrototypePatternDemo.java
public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());

      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());

      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());

      // Create Fish and Human clones
      Avatar fish1 = new Fish();
      fish1.setId("4");

      Avatar human1 = new Human();
      human1.setId("5");

      Avatar fishClone = (Avatar) fish1.clone();
      Avatar humanClone = (Avatar) human1.clone();

      // Compare the clones
      System.out.println("Fish clone equals original? " + fish1.equals(fishClone));
      System.out.println("Human clone equals original? " + human1.equals(humanClone));
   }
}
