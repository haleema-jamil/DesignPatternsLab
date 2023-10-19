package GangOfFour.Visitor.ComputerParts;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        ComputerPartVisitor displayVisitor = new ComputerPartDisplayVisitor();
        ComputerPartsMaintainer maintainer = new SpecificPartsMaintainer();
        
        // Add specific parts to maintain (e.g., Mouse and Multimedia)
        maintainer.addPartToMaintain(new Mouse());
        maintainer.addPartToMaintain(new Multimedia());

        // Display parts and perform maintenance
        computer.accept(displayVisitor);
        computer.accept(maintainer);
    }
}