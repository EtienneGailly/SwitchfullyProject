package basic.solutions.codelab02;

import java.time.LocalTime;

public class Person {
    private boolean isVampire;

    private Person(boolean isVampire) {
        this.isVampire = isVampire;
    }

    public static Person createHuman() {
        return new Person(false);
    }

    public static Person createVampire() {
        return new Person(true);
    }

    public void bites(Person human, LocalTime localTime) {
        if (localTime.isAfter(LocalTime.of(0, 0)) && localTime.isBefore(LocalTime.of(7, 0))) {
            human.makeVampire();
        }
    }

    private void makeVampire() {
        this.isVampire = true;
    }

    public boolean isVampire() {
        return isVampire;
    }
}
