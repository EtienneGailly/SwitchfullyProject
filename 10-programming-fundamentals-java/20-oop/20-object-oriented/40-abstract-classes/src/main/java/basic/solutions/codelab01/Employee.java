package basic.solutions.codelab01;

public abstract class Employee {
    private final String name;
    private final double basicAnnualSalary;

    public Employee(String name, double basicAnnualSalary) {
        this.name = name;
        this.basicAnnualSalary = basicAnnualSalary;
    }

    public abstract double calculateMonthlySalary();

    protected double getBasicAnnualSalary() {
        return basicAnnualSalary;
    }
}
