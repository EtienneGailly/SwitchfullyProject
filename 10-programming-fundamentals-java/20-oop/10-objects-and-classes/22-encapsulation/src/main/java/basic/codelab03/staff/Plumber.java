package basic.codelab03.staff;

import basic.codelab03.house.Bathroom;

public class Plumber {

    public String name;

    public Plumber(String name) {
        this.name = name;
    }

    public void fixBathroom(Bathroom bathroom) {
        System.out.println("Plumber " + name + " is fixing the bathroom");
        bathroom.fixLeak();
    }
}
