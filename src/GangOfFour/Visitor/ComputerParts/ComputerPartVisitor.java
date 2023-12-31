package GangOfFour.Visitor.ComputerParts;

public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);

    public void visit(Multimedia aThis);
}