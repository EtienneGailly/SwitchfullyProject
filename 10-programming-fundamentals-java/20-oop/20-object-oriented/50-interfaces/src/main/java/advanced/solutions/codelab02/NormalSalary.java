package advanced.solutions.codelab02;

public class NormalSalary implements SalaryType {

    @Override
    public double calculateMonthlySalary(double yearlySalary) {
        return yearlySalary / 12;
    }
}
