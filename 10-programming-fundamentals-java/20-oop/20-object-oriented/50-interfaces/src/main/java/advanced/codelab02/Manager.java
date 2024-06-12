package advanced.codelab02;

public class Manager extends Employee {

    private static final int LOWER_BOUND = 100;
    private static final int UPPER_BOUND = 250;
    public static final int MANAGER_MONTHS_IN_YEAR = 11;

    private double bonus;

    public Manager(String name, double yearlySalary, double bonus) {
        super(name, yearlySalary);
        this.bonus = normalize(bonus);
    }

    public void setBonus(double bonus) {
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
    public double calculateMonthlySalary() {
        return yearlySalary / MANAGER_MONTHS_IN_YEAR + bonus;
    }
}
