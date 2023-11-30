package GangOfFour.Composite.EmployeeBonus;

import java.util.Iterator;

public interface CompositeEmployee {
    void addSubordinate(IEmployee employee);
    Iterator<IEmployee> iterator();
}
