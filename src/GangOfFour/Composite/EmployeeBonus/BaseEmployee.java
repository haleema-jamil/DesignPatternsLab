package GangOfFour.Composite.EmployeeBonus;

public abstract class BaseEmployee implements IEmployee {
    protected String name;
    protected int salary;
    
    public BaseEmployee(String name, int Salary){
        this.name = name;
        this.salary = salary;
    }

}
