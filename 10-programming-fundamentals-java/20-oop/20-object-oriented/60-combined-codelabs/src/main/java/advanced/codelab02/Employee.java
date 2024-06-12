package advanced.codelab02;

/**
 * Read the README.md file
 */
public class Employee {

    private double yearlySalary;
    private String name;
    private BonusCalculator bonusCalculator;

    public Employee(String name, double yearlySalary) {
        this.name = name;
        this.yearlySalary = yearlySalary;
    }

    public String getName() {
        return name;
    }

    void setBonusCalculator(BonusCalculator bonusCalculator) {
        this.bonusCalculator = bonusCalculator;
    }

    double getBonus() {
        if(bonusCalculator != null) {
            return bonusCalculator.calculate(yearlySalary);
        } else {
            throw new IllegalStateException("Impossible to calculate a bonus when no bonusCalculator is set");
        }
    }
}
