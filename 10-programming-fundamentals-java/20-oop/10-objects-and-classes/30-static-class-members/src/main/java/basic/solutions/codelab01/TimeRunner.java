package basic.solutions.codelab01;

public class TimeRunner {
    public static void main(String[] args) {
        Time time1 = new Time(12,12,12);
        Time time2 = new Time();
        Time time3 = new Time(9,30);
        Time time4 = new Time(12,12,12);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(Time.highestHour(time1,time2));
        System.out.println(Time.highestHour(time1,time3));
        System.out.println(Time.highestHour(time1,time4));
        System.out.println(time1.equals(time2));
    }

}
