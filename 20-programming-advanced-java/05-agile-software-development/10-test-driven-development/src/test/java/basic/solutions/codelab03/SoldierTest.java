package basic.solutions.codelab03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static basic.solutions.codelab03.Weapon.BARE_FISTS;
import static basic.solutions.codelab03.Weapon.SPEAR;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SoldierTest {

    @Test
    void getWeapon_givenNewSoldier_returnsBareFists() {
        Soldier soldier = new Soldier();

        Weapon actualWeapon = soldier.getWeapon();

        assertThat(actualWeapon).isEqualTo(BARE_FISTS);
    }

    @ParameterizedTest
    @EnumSource(Weapon.class)
    void getWeapon_givenNewSoldierWithWeapon_returnsWeapon(Weapon weapon) {
        Soldier soldier = new Soldier(weapon);

        Weapon actualWeapon = soldier.getWeapon();

        assertThat(actualWeapon).isEqualTo(weapon);
    }

    @Test
    void fight_givenAttackerWithWeakerWeapon_returnsTrue() {
        Soldier attacker = new Soldier(SPEAR);
        Soldier defender = new Soldier(BARE_FISTS);
        // in the absence of Mocking, this assertion in the GIVEN declares what a precondition is for this test to work.
        assertThat(attacker.getWeapon().getDamage()).isGreaterThan(defender.getWeapon().getDamage());

        boolean attackerWon = attacker.fight(defender);

        assertTrue(attackerWon);
    }

    @Test
    void fight_givenAttackerWithStrongerWeapon_returnsFalse() {
        Soldier attacker = new Soldier(BARE_FISTS);
        Soldier defender = new Soldier(SPEAR);
        // in the absence of Mocking, this assertion in the GIVEN declares what a precondition is for this test to work.
        assertThat(attacker.getWeapon().getDamage()).isLessThan(defender.getWeapon().getDamage());

        boolean attackerWon = attacker.fight(defender);

        assertFalse(attackerWon);
    }

    @Test
    void fight_givenAttackerWithEquallyStrongWeapon_returnsTrue() {
        Soldier attacker = new Soldier(SPEAR);
        Soldier defender = new Soldier(SPEAR);

        boolean attackerWon = attacker.fight(defender);

        assertTrue(attackerWon);
    }


}
