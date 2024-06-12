package basic.codelab01;

public class Train {


    private int hoursDelayed;

    public Train() {
        hoursDelayed = 0;
    }

    public int getHoursDelayed() {
        return hoursDelayed;
    }

    public void setHoursDelayed(int hoursDelayed) {
        this.hoursDelayed = Math.max(hoursDelayed, 0);
    }

    public String customerSatisfaction() {
        String customerSatisfaction;
        customerSatisfaction = switch (hoursDelayed) {
            case 0 -> "Nice ‘n’ rolling!";
            case 1 -> "Just another day at the train …";
            case 2 -> "This train is annoying me!";
            case 3 -> "B-u-u-urn it!";
            default -> throw new IllegalArgumentException("Invalid hours delayed!");
        };
        return customerSatisfaction;
    }
}
