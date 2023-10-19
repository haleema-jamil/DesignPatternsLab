package GangOfFour.Visitor.ComputerParts;

import java.util.HashSet;
import java.util.Set;

public class SpecificPartsMaintainer implements ComputerPartsMaintainer {
    private Set<ComputerPart> partsToMaintain;

    public SpecificPartsMaintainer() {
        partsToMaintain = new HashSet<>();
    }

    public void addPartToMaintain(ComputerPart part) {
        partsToMaintain.add(part);
    }

    @Override
    public void maintain(ComputerPart computerPart) {
        if (partsToMaintain.contains(computerPart)) {
            System.out.println("Maintaining " + computerPart.getClass().getSimpleName() + ".");
        }
    }
}