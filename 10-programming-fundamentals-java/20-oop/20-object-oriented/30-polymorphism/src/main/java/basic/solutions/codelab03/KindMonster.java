package basic.solutions.codelab03;

public class KindMonster extends Monster {

    public static final int KIND_MONSTER_ATTACK_POWER = 1;

    public KindMonster(String name) {
        super(name, KIND_MONSTER_ATTACK_POWER);
    }

    @Override
    public void fight(Monster monster) {
        if (isAlive()) {
            monster.addHealth(getAttackPower());
        }
    }
}
