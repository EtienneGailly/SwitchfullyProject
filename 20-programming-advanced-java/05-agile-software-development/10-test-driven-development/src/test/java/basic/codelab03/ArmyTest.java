package basic.codelab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArmyTest {
    @Test
    void givenAnArmyAndASolider_whenArmyEnrollsSoldier_soldierIsEnrolled() {
        Army army = new Army();
        Soldier soldier = new Soldier();
        army.enroll(soldier);
        Assertions.assertTrue(army.getSoldiers().contains(soldier));
    }

    @Test
    void givenAnArmy_whenSoldiersAreEnrolled_thenTheFirstSoldierIsFrontMan() {
        Army army = new Army();
        Soldier frontMan = new Soldier();
        army.enroll(frontMan);
        for(int i = 0; i < 10; i++) {
            army.enroll(new Soldier());
        }
        Assertions.assertEquals(frontMan, army.getFrontMan());
    }

    @Test
    void givenArmiesAtWar_WhenFrontManLoses_FrontManIsRemovedFromArmy() {
        Army army1 = new Army();
        for(int i = 0; i < 3; i++) {
            army1.enroll(new Soldier(Weapon.SWORD));
        }
        Army army2 = new Army();
        army2.enroll(new Soldier());
        Army.war(army1,army2);
        Assertions.assertTrue(army2.getSoldiers().isEmpty());
    }

    @Test
    void givenArmiesAtWarAndArmy1IsBetter_thenArmy1Win() {
        Army army1 = new Army();
        for(int i = 0; i < 3; i++) {
            army1.enroll(new Soldier(Weapon.SWORD));
        }
        Army army2 = new Army();
        for(int i = 0; i < 10; i++) {
            army2.enroll(new Soldier());
        }
        Assertions.assertTrue(Army.war(army1,army2));
    }

    @Test
    void givenArmiesAtWarAndArmy2IsBetter_thenArmy1Win() {
        Army army2 = new Army();
        for(int i = 0; i < 3; i++) {
            army2.enroll(new Soldier(Weapon.SWORD));
        }
        Army army1 = new Army();
        for(int i = 0; i < 10; i++) {
            army1.enroll(new Soldier());
        }
        Assertions.assertFalse(Army.war(army1,army2));
    }

    @Test
    void GivenWarBetweenTwoEmptyArmies_thenIllegalArgumentExceptionIsThrown() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Army.war(new Army(), new Army());
        });
    }

    @Test
    void givenFirstArmyIsNull_thenIllegalArgumentExceptionIsThrown() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Army.war(null, new Army());
        });
    }

    @Test
    void givenSecondArmyIsNull_thenIllegalArgumentExceptionIsThrown() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Army.war(new Army(), null);
        });
    }


}
