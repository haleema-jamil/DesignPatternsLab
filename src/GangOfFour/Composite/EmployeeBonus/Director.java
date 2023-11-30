package GangOfFour.Composite.EmployeeBonus;

import java.util.ArrayList;
import java.util.List;

public class Director extends BaseEmployee {
    private List<IEmployee> subordinates;

    public Director(String name, int salary) {
        super(name, salary);
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(IEmployee subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        // Implement bonus logic for Director
        int bonus = (int) (salary * bonusPercentage / 100);
        this.salary += bonus;
        System.out.println(name + " received a bonus of " + bonus);

        // Give bonus to subordinates
        for (IEmployee subordinate : subordinates) {
            subordinate.giveBonus(bonusPercentage);
        }
    }
}
