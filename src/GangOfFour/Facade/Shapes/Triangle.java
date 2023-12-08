/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GangOfFour.Facade.Shapes;

public class Triangle implements Shape {

   @Override
   public void draw(String... arguments) {
      StringBuilder sb = new StringBuilder("Triangle::draw(");
      for (String arg : arguments) {
         sb.append(arg).append(", ");
      }
      sb.delete(sb.length() - 2, sb.length()); // Remove the last comma and space
      sb.append(")");
      System.out.println(sb.toString());
   }
}
