package presentationslides.classeschapter.encapsulation;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return hours + "h " + minutes + "m " + seconds + "s";
    }
}
