package advanced.solutions.codelab02;

public class Main {

    public static void main(String[] args) {
        Employee johanna = Employee.createEmployee("Johanna", 1800);
        System.out.println(johanna.calculateMonthlySalary());

        Employee nora = Employee.createManager("Nora", 2000, 250);
        System.out.println(nora.calculateMonthlySalary());

        Employee kurt = Employee.createManager("Kurt", 2000, 300);
        System.out.println(kurt.calculateMonthlySalary());

        Employee cecilia = Employee.createManager("Cecilia", 2000, 300);
        cecilia.changeBonus(150);
        System.out.println(cecilia.calculateMonthlySalary());
    }
}
