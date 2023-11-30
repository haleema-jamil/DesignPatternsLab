package GangOfFour.Composite.EmployeeBonus;

public class Teacher extends BaseEmployee {
    private String qualification;
    private String status;

    public Teacher(String name, int salary, String qualification, String status) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
    }

    @Override
    public void giveBonus(int bonusPercentage) {
        // Implement bonus logic for Teacher
        int bonus = (int) (salary * bonusPercentage / 100);
        this.salary += bonus;
        System.out.println(name + " received a bonus of " + bonus);
    }
}