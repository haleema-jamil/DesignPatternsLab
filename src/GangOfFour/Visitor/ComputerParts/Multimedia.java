package GangOfFour.Visitor.ComputerParts;

public class Multimedia implements ComputerPart {

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}