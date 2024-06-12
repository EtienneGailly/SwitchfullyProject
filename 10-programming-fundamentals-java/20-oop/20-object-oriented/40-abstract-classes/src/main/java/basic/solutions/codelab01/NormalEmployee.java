package basic.solutions.codelab01;

public class NormalEmployee extends Employee {

    public static final int MONTHS_IN_A_YEAR = 12;

    public NormalEmployee(String name, double basicAnnualSalary) {
        super(name, basicAnnualSalary);
    }

    @Override
    public double calculateMonthlySalary() {
        return getBasicAnnualSalary() / MONTHS_IN_A_YEAR;
    }
}
