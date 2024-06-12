package advanced.codelab02;

public class CustomTime {

    public static final CustomTime MIDNIGHT = new CustomTime(0, 0, 0);
    public static final CustomTime NOON = new CustomTime(12, 0, 0);

    private int hour;
    private int minute;
    private double second;

    public CustomTime() {
        this(0, 0, 0.0);
    }

    public CustomTime(int hour, int minute) {
        this(hour, minute, 0.0);
    }

    public CustomTime(int hour, int minute, double second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {
        return String.format("%02d:%02d:%04.1f",
                this.hour, this.minute, this.second);
    }

    /**
     * This is not the real equals method. It does not take in a parameter of type Object...
     * It is not correctly overriding the equals method of Object.
     * @param that the CustomTime object to check equality with.
     * @return boolean to indicate whether that is equal to this.
     */
    public boolean equals(CustomTime that) {
        return this.hour == that.hour
                && this.minute == that.minute
                && this.second == that.second;
    }

    public void add(CustomTime other) {
        double secondSum = this.second + other.second;
        int addMinutes = (int) secondSum / 60;
        this.second = secondSum % 60;

        int minuteSum = this.minute + other.minute + addMinutes;
        int addHours = minuteSum / 60;
        this.minute = minuteSum % 60;

        int hourSum = this.hour + other.hour + addHours;
        this.hour = hourSum % 24;
    }


}
