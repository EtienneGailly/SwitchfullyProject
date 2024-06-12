package advanced.solutions;

public class DecisionMakingCodelab01Solution {

    public static void main(String[] args) {
        System.out.println("Your tax rate is: " + calculateTaxRate(52000, 3000, true, 4));
    }

    public static double calculateTaxRate(int earnings, int fringeBenefits, boolean dependentChildren, int vacationDays) {
        if (earnings <= 40000) {
            return 0.2;
        } else if (fringeBenefits < 2000) {
            return 0.3;
        } else if (!dependentChildren) {
            return 0.4;
        } else if (vacationDays > 5) {
            return 0.35;
        } else if (fringeBenefits < 5000) {
            return 0.33;
        }
        return 0.34;
    }
}
