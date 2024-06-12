package advanced.codelab02;

public class NormalEmployee extends Employee {

    public static final int MONTHS_IN_YEAR = 12;

    public NormalEmployee(String name, double yearlySalary) {
        super(name, yearlySalary);
    }

    @Override
    public double calculateMonthlySalary() {
        return yearlySalary / MONTHS_IN_YEAR;
    }
}
