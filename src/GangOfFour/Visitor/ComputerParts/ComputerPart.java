package GangOfFour.Visitor.ComputerParts;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}