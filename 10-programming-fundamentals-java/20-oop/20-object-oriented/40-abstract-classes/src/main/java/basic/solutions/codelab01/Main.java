package basic.solutions.codelab01;

public class Main {

    public static void main(String[] args) {
        Manager theBoss = new Manager("The boss", 60000, 275);
        System.out.println(theBoss.calculateMonthlySalary());

        theBoss.setBonus(90);
        System.out.println(theBoss.calculateMonthlySalary());

        NormalEmployee theServant = new NormalEmployee("The servant", 20000);
        System.out.println(theServant.calculateMonthlySalary());
    }
}
