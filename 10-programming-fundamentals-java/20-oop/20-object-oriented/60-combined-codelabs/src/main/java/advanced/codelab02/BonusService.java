package advanced.codelab02;

import java.util.StringJoiner;

/**
 * Read the README.md file
 */
class BonusService {

    static void setBonusCalculatorsBasedOnYear(Employee[] employees, int bonusYear) {
        // complete me!
    }

    static String calculateBonuses(Employee[] employees) {
        StringJoiner joiner = new StringJoiner("\n");
        for(Employee employee: employees) {
            joiner.add("Bonus for " + employee.getName() + " is " + employee.getBonus());
        }
        return joiner.toString();
    }

    private static boolean isABadYear(int bonusYear) {
        return bonusYear == 2014 || bonusYear == 2015 || bonusYear == 2016;
    }

}
