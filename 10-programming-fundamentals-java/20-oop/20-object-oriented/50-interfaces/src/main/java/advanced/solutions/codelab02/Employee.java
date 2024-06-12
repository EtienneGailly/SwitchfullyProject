package advanced.solutions.codelab02;

public class Employee {

    private String name;
    private double yearlySalary;
    private SalaryType salaryType;

    private Employee(String name, double yearlySalary, SalaryType salaryType) {
        this.name = name;
        this.yearlySalary = yearlySalary;
        this.salaryType = salaryType;
    }

    public static Employee createManager(String name, double yearlySalary, double bonus) {
        return new Employee(name, yearlySalary, new ManagerSalary(bonus));
    }

    public static Employee createEmployee(String name, double yearlySalary) {
        return new Employee(name, yearlySalary, new NormalSalary());
    }

    public double calculateMonthlySalary() {
        return salaryType.calculateMonthlySalary(yearlySalary);
    }

    public void changeBonus(double bonus) {
        this.salaryType = new ManagerSalary(bonus);
    }

    public void removeBonus() {
        this.salaryType = new NormalSalary();
    }
}
