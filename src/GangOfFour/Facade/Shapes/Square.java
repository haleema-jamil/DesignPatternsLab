package GangOfFour.Facade.Shapes;

public class Square implements Shape {

   @Override
   public void draw(String... arguments) {
      StringBuilder sb = new StringBuilder("Square::draw(");
      for (String arg : arguments) {
         sb.append(arg).append(", ");
      }
      sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
      sb.append(")");
      System.out.println(sb.toString());
   }
}
