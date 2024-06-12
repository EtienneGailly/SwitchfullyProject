package basic.codelab03;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private List<Soldier> soldiers;

    public Army() {
        soldiers = new ArrayList<Soldier>();
    }

    public void enroll(Soldier soldier) {
        soldiers.add(soldier);
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public Soldier getFrontMan() {
        return soldiers.getFirst();
    }

    private void removeFrontMan(){
        this.soldiers.removeFirst();
    }

    public static boolean war(@NotNull Army army1, @NotNull Army army2) throws IllegalArgumentException {
        if(army1.getSoldiers().isEmpty() && army2.getSoldiers().isEmpty()) {
            throw new IllegalArgumentException("Both armies are empty");
        }
        while(!army1.getSoldiers().isEmpty() && !army2.getSoldiers().isEmpty()) {
            Soldier attacker = army1.getFrontMan();
            Soldier defender = army2.getFrontMan();
            if(attacker.fight(defender)) {
                army2.removeFrontMan();
            } else {
                army1.removeFrontMan();
            }
        }
        return army2.getSoldiers().isEmpty();
    }
}
