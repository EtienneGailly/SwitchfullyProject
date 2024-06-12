package advanced.solutions.codelab01;

import advanced.solutions.codelab01.armor.LowArmor;
import advanced.solutions.codelab01.armor.MediumArmor;
import advanced.solutions.codelab01.armor.NoArmor;
import advanced.solutions.codelab01.armor.StrongArmor;
import advanced.solutions.codelab01.soldier.*;
import advanced.solutions.codelab01.weapon.*;

public class Main {

    public static void main(String[] args) {
        Army army1 = new Army("The Army", new Soldier[]{
                new Swordman("a sword man", 21, new Sword(), new MediumArmor()),
                new Archer("an archer", 21, new Bow(), new LowArmor()),
                new Axethrower("a axe thrower", 21, new Axe(), new MediumArmor()),
                new Pikeman("a pike man", 21, new Pike(), new StrongArmor()),
                new Slave("a slave", 21, new Dagger(), new NoArmor()),
        });

        Army army2 = new Army("The Army", new Soldier[]{
                new Swordman("a sword man", 21, new Sword(), new MediumArmor()),
                new Archer("an archer", 21, new Bow(), new LowArmor()),
                new Axethrower("a axe thrower", 21, new Axe(), new MediumArmor()),
                new Pikeman("a pike man", 21, new Pike(), new StrongArmor()),
                new Slave("a slave", 21, new Dagger(), new NoArmor()),
        });

        System.out.println("Total attacking power: " + army1.getTotalAttackingPower());

        System.out.println("Total defending power: " + army1.getTotalDefendingPower());

        System.out.println("Total number of soldiers: " + army1.getTotalNumberOfSoldiers());

        Army newArmy = Army.mergeArmies(army1, army2);

        System.out.println("Total number of soldiers: " + newArmy.getTotalNumberOfSoldiers());

        System.out.println("Total attacking power: " + newArmy.getTotalAttackingPower());

        System.out.println("Total defending power: " + newArmy.getTotalDefendingPower());
    }
}
