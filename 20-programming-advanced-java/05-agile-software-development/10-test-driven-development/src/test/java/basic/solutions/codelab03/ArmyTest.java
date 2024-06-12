package basic.solutions.codelab03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static basic.solutions.codelab03.Weapon.BARE_FISTS;
import static basic.solutions.codelab03.Weapon.SPEAR;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArmyTest {

    private Army army;

    @BeforeEach
    void createArmy() {
        this.army = new Army();
    }

    @Test
    void enlistSoldier_givenSoldier_thenSoldierIsInArmy() {
        Soldier soldier = new Soldier();

        army.enlistSoldier(soldier);

        assertThat(army.getSoldiers()).contains(soldier);
    }

    @Test
    void enlistSoldier_givenNullSoldier_thenThrowException() {
        assertThatThrownBy(() -> army.enlistSoldier(null))
                .hasMessage("Cannot enlist null")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void enlistSoldier_givenFullArmy_thenThrowException() {
        for (int i = 0; i < Army.MAX_NUMBER_OF_SOLDIERS; i++) {
            army.enlistSoldier(new Soldier());
        }

        assertThatThrownBy(() -> army.enlistSoldier(new Soldier()))
                .hasMessage("Army is already full")
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    void getFrontMan_givenOneEnlistedSoldier_returnsOneEnlistedSoldier() {
        Soldier soldier = new Soldier();
        army.enlistSoldier(soldier);

        Soldier actualFrontMan = army.getFrontMan();

        assertThat(actualFrontMan).isEqualTo(soldier);

    }

    @Test
    void getFrontMan_givenMoreThanOneEnlistedSoldier_returnsFirstEnlistedSoldier() {
        Soldier soldier = new Soldier();
        army.enlistSoldier(soldier);
        Soldier soldier2 = new Soldier();
        army.enlistSoldier(soldier2);
        Soldier soldier3 = new Soldier();
        army.enlistSoldier(soldier3);

        Soldier actualFrontMan = army.getFrontMan();

        assertThat(actualFrontMan).isEqualTo(soldier);
    }

    @Test
    void getFrontMan_givenNoEnlistedSoldier_returnsNull() {
        assertThatThrownBy(() -> army.getFrontMan())
                .hasMessage("No front man because no soldiers")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void killFrontMan_givenNoEnlistedSoldier_thenThrowException() {
        assertThatThrownBy(() -> army.killFrontMan())
                .hasMessage("No front man because no soldiers")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void killFrontMan_givenEnlistedSoldier_thenNoSoldiersLeft() {
        Soldier soldier = new Soldier();
        army.enlistSoldier(soldier);

        army.killFrontMan();


        assertThatThrownBy(() -> army.getFrontMan())
                .hasMessage("No front man because no soldiers")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void killFrontMan_givenMoreThanOneEnlistedSoldier_thenSecondEnlistedSoldierBecomesFrontMan() {
        army.enlistSoldier(new Soldier());
        Soldier secondSoldier = new Soldier();
        army.enlistSoldier(secondSoldier);

        army.killFrontMan();

        assertThat(army.getFrontMan()).isEqualTo(secondSoldier);
    }

    @Test
    void killFrontMan_givenMoreThanOneEnlistedSoldierKilled_thenNthEnlistedSoldierBecomesFrontMan() {
        army.enlistSoldier(new Soldier());
        army.enlistSoldier(new Soldier());
        Soldier thirdSoldier = new Soldier();
        army.enlistSoldier(thirdSoldier);

        army.killFrontMan();
        army.killFrontMan();

        assertThat(army.getFrontMan()).isEqualTo(thirdSoldier);
    }

    @Test
    void engage_givenDefendingArmyNull_thenThrowException() {
        assertThatThrownBy(() -> army.engage(null))
                .hasMessage("Defender army is null")
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void engage_givenDefendingArmyWithWeakerSoldier_thenDefendingArmyHasNoSoldiersLeftAndThisArmyHasWon() {
        army.enlistSoldier(new Soldier(SPEAR));
        Army defenderArmy = new Army();
        defenderArmy.enlistSoldier(new Soldier(BARE_FISTS));

        boolean attackerArmyHasWon = army.engage(defenderArmy);

        assertThat(attackerArmyHasWon).isTrue();
        assertThat(army.hasSoldiersLeft()).isTrue();
        assertThat(defenderArmy.hasSoldiersLeft()).isFalse();
    }
}