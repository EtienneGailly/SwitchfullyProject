package basic.codelab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SoldierTest {
    @Test
    void givenSoldier_thenWeaponEquippedIsBareFists() {
        Soldier soldier = new Soldier();
        Assertions.assertEquals(Weapon.BAREFISTS, soldier.getWeapon());
    }

    @Test
    void givenAttackingSoldierHasWorseWeapon_whenAttacking_thenAttackingLoose(){
        Soldier attacking = new Soldier();
        Soldier defending = new Soldier(Weapon.SPEAR);

        Assertions.assertFalse(attacking.fight(defending));
    }

    @Test
    void givenAttackingSoldierHasSameWeapon_whenAttacking_thenAttackingWin(){
        Soldier attacking = new Soldier();
        Soldier defending = new Soldier();

        Assertions.assertTrue(attacking.fight(defending));
    }

    @Test
    void givenAttackingSoldierHasBetterWeapon_whenAttacking_thenAttackingWin(){
        Soldier attacking = new Soldier(Weapon.AXE);
        Soldier defending = new Soldier();

        Assertions.assertTrue(attacking.fight(defending));
    }
}
