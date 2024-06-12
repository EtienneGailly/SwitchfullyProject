package basic.solutions.codelab01;

import java.util.Objects;

public class Time {

    private static final int TEA_TIME_HOUR = 16;

    private int hour = 13;
    private int minute = 30;
    private double second = 0.0;


    public Time() {
    }

    public Time(int hour, int minutes) {
        this.hour = hour;
        this.minute = minutes;
    }

    public Time(int hours, int minute, double second) {
        this.hour = hours;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public static Time highestHour(Time time, Time otherTime) {
        if(time.hour > otherTime.hour) {
            return time;
        }
        if(time.hour == otherTime.hour && time.minute > otherTime.minute) {
            return time;
        }
        if(time.minute == otherTime.minute && time.second > otherTime.second) {
            return time;
        }
        return otherTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute && Double.compare(time.second, second) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, minute, second);
    }

    @Override
    public String toString() {
        return "The time is " + hour + ":" + minute + ":" + second;
    }
}
