package advanced.solutions.codelab01;

import advanced.solutions.codelab01.soldier.Soldier;

public class Army {

    private String name;
    private Soldier[] soldiers;

    public Army(String name, Soldier[] soldiers) {
        this.name = name;
        this.soldiers = soldiers;
    }

    public int getTotalAttackingPower() {
        int result = 0;
        for (Soldier soldier : soldiers) {
            result += soldier.getAttackingPower();
        }
        return result;
    }

    public int getTotalDefendingPower() {
        int result = 0;
        for (Soldier soldier : soldiers) {
            result += soldier.getDefendingPower();
        }
        return result;
    }

    public int getTotalNumberOfSoldiers() {
        int result = 0;
        for (Soldier soldier : soldiers) {
            if (soldier != null) {
                result += 1;
            }
        }
        return result;
    }

    public static Army mergeArmies(Army army1, Army army2) {
        Soldier[] newListOfSoldiers = new Soldier[army1.soldiers.length + army2.soldiers.length];
        int index = 0;
        for(Soldier soldier: army1.soldiers) {
            newListOfSoldiers[index++] = soldier;
        }
        for(Soldier soldier: army2.soldiers) {
            newListOfSoldiers[index++] = soldier;
        }
        return new Army("the new army", newListOfSoldiers);
    }
}
