package basic.codelab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeaponTest {
    @Test
    void givenAxe_thenDamageIs3(){
        Weapon weapon = Weapon.AXE;
        Assertions.assertEquals(3, weapon.getDamage());
    }

    @Test
    void givenSword_thenDamageIs2(){
        Weapon weapon = Weapon.SWORD;
        Assertions.assertEquals(2, weapon.getDamage());
    }

    @Test
    void givenBareFists_thenDamageIs1(){
        Weapon weapon = Weapon.BAREFISTS;
        Assertions.assertEquals(1, weapon.getDamage());
    }

    @Test
    void givenSpear_thenDamageIs3point5(){
        Weapon weapon = Weapon.SPEAR;
        Assertions.assertEquals(3.5, weapon.getDamage());
    }

}
