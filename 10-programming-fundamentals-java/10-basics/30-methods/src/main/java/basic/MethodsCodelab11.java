package basic;

import java.util.Locale;

public class MethodsCodelab11 {

    public static void main(String[] args) {

        // Sometimes duplication is a bit more hidden.
        // Can you remove the duplication from this code?
        // The formula for converting °F into °C is "(x - 32) * 5/9"

        //System.out.println("It's 14.0°F outside which is -10.0°C");
        //System.out.println("It's 32.0°F outside which is 0.0°C");
        //System.out.println("It's 50.0°F outside which is 10.0°C");
        //System.out.println("It's 68.0°F outside which is 20.0°C");
        //System.out.println("It's 86.0°F outside which is 30.0°C");

        printTemp(14.0);
        printTemp(32.0);
        printTemp(50.0);
        printTemp(68.0);
        printTemp(86.0);
    }
    public static double convertTemp(double tempF) {
        return (tempF - 32) * 5 / 9;
    }
    public static  void printTemp(double tempF) {
        String formattedTempF = String.format(Locale.ENGLISH, "%1.1f",tempF);
        double tempC = convertTemp(tempF);
        String formattedTempC = String.format(Locale.ENGLISH, "%1.1f",tempC);
        System.out.println("It's " + formattedTempF + "°F outside which is " + formattedTempC + "°C");
    }
}
