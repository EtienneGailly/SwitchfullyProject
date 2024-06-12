package basic.solutions.codelab03.house;

import basic.solutions.codelab03.staff.Staff;

public class House {

    private final Bathroom bathroom;
    private final Kitchen kitchen;
    private final Diningroom diningroom;
    private final Garden garden;
    private final Staff staff;

    public House(Bathroom bathroom, Kitchen kitchen, Diningroom diningroom, Garden garden, Staff staff) {
        this.bathroom = bathroom;
        this.kitchen = kitchen;
        this.diningroom = diningroom;
        this.garden = garden;
        this.staff = staff;
    }

    public void tendToGarden() {
        staff.tendToGarden(garden);
    }

    public void serveFood() {
        staff.serveFood(kitchen, diningroom);
    }

    public void fixBathroom() {
        staff.fixBathroom(bathroom);
    }
}
