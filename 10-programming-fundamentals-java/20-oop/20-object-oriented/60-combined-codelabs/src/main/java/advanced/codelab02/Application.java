package advanced.codelab02;

/**
 * Read the README.md file
 */
public class Application {

    public static void main(String[] args) {
        Employee employeeAdam = new Employee("Adam", 30000);
        Employee employeeBert = new Employee("Bert", 34000);
        Employee employeeCharlotte = new Employee("Charlotte", 36000);
        Employee employeeDavidWhoIsExceptional = new Employee("David", 36000);

        Employee[] employees = {employeeAdam, employeeBert, employeeCharlotte, employeeDavidWhoIsExceptional};

        BonusService.setBonusCalculatorsBasedOnYear(employees, 2015);

        String bonusesAsText = BonusService.calculateBonuses(employees);

        System.out.println(bonusesAsText);
    }

}
