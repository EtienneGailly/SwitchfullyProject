package basic.solutions.codelab01;

public class Manager extends Employee {

    public static final double BONUS_UPPER_BOUND = 250;
    public static final double BONUS_LOWER_BOUND = 100;
    public static final double PAYED_MANAGER_MONTHS = 11;
    private double bonus;

    public Manager(String name, double basicAnnualSalary, double bonus) {
        super(name, basicAnnualSalary);
        this.bonus = normalizeBonus(bonus);
    }

    private double normalizeBonus(double bonus) {
        return Math.min(BONUS_UPPER_BOUND, Math.max(BONUS_LOWER_BOUND, bonus));
    }

    public void setBonus(double bonus) {
        this.bonus = normalizeBonus(bonus);
    }

    @Override
    public double calculateMonthlySalary() {
        return getBasicAnnualSalary() / PAYED_MANAGER_MONTHS + bonus;
    }
}
