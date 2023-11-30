package GangOfFour.Composite.EmployeeBonus;

public class DOO extends BaseEmployee {
    private String rank;

    public DOO(String name, int salary, String rank) {
        super(name, salary);
        this.rank = rank;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        // Implement bonus logic for DOO
        int bonus = (int) (salary * bonusPercentage / 100);
        this.salary += bonus;
        System.out.println(name + " received a bonus of " + bonus);
    }
}