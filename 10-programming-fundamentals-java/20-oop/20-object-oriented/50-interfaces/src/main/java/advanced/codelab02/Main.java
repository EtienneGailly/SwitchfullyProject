package advanced.codelab02;

public class Main {

    public static void main(String[] args) {
        NormalEmployee johanna = new NormalEmployee("Johanna", 1800);
        System.out.println(johanna.calculateMonthlySalary());

        Manager nora = new Manager("Nora", 2000, 250);
        System.out.println(nora.calculateMonthlySalary());

        Manager kurt = new Manager("Kurt", 2000, 300);
        System.out.println(kurt.calculateMonthlySalary());

        Manager cecilia = new Manager("Cecilia", 2000, 300);
        cecilia.setBonus(150);
        System.out.println(cecilia.calculateMonthlySalary());
    }
}
