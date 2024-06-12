package advanced.solutions.codelab02;

public class ManagerSalary implements SalaryType {

    private static final int LOWER_BOUND = 100;
    private static final int UPPER_BOUND = 250;

    private final double bonus;

    public ManagerSalary(double bonus) {
        this.bonus = normalize(bonus);
    }

    private double normalize(double bonus) {
        if(bonus < LOWER_BOUND) {
            return LOWER_BOUND;
        }
        if( bonus > UPPER_BOUND) {
            return UPPER_BOUND;
        }
        return bonus;
    }

    @Override
    public double calculateMonthlySalary(double yearlySalary) {
        return yearlySalary / 11 + bonus;
    }
}
