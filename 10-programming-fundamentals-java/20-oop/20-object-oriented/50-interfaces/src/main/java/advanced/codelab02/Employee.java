package advanced.codelab02;

public abstract class Employee {

    private String name;
    protected double yearlySalary;

    public Employee(String name, double yearlySalary) {
        this.name = name;
        this.yearlySalary = yearlySalary;
    }

    public abstract double calculateMonthlySalary();
}
