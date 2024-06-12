package basic.solutions.codelab03.staff;

import basic.solutions.codelab03.house.Bathroom;

public class Plumber {

    private final String name;

    public Plumber(String name) {
        this.name = name;
    }

    void fixBathroom(Bathroom bathroom) {
        System.out.println("Plumber " + name + " is fixing the bathroom");
        bathroom.fixLeak();
    }
}
