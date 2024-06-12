package basic.solutions.codelab03;

import java.util.Arrays;

public class Army {

    public static final int MAX_NUMBER_OF_SOLDIERS = 10;
    Soldier[] soldiers = new Soldier[MAX_NUMBER_OF_SOLDIERS];
    private int numberOfSoldiers = 0;

    public void enlistSoldier(Soldier soldier) {
        if (soldier == null) {
            throw new NullPointerException("Cannot enlist null");
        }
        if (numberOfSoldiers == MAX_NUMBER_OF_SOLDIERS) {
            throw new IllegalStateException("Army is already full");
        }
        soldiers[numberOfSoldiers] = soldier;
        numberOfSoldiers++;
    }

    public Soldier[] getSoldiers() {
        return Arrays.copyOf(soldiers, MAX_NUMBER_OF_SOLDIERS);
    }

    public Soldier getFrontMan() {
        if (numberOfSoldiers == 0) {
            throw noFrontManException();
        }
        return soldiers[0];
    }

    public void killFrontMan() {
        if (!hasSoldiersLeft()) {
            throw noFrontManException();
        }
        this.soldiers = Arrays.copyOfRange(this.soldiers, 1, this.soldiers.length);
        this.numberOfSoldiers--;
    }

    public boolean hasSoldiersLeft() {
        return this.numberOfSoldiers > 0;
    }

    public boolean engage(Army defender) {
        if (defender == null) {
            throw new NullPointerException("Defender army is null");
        }
        while (this.hasSoldiersLeft() && defender.hasSoldiersLeft()) {
            if (this.getFrontMan().fight(defender.getFrontMan())) {
                defender.killFrontMan();
            } else {
                this.killFrontMan();
            }
        }
        return this.hasSoldiersLeft();
    }

    private static NullPointerException noFrontManException() {
        return new NullPointerException("No front man because no soldiers");
    }
}
