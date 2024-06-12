package basic.solutions;

public class MethodsCodelab11Solution {

    public static void main(String[] args) {

        // Sometimes duplication is a bit more hidden.
        // Can you remove the duplication from this code?
        // The formula for converting °F into °C is "(x - 32) * 5/9"

        printOutConversion(14.0);
        printOutConversion(32.0);
        printOutConversion(50.0);
        printOutConversion(68.0);
        printOutConversion(86.0);
    }

    private static void printOutConversion(double degreesInFahrenheit) {
        double degreesInCelsius = convertToCelsius(degreesInFahrenheit);
        System.out.println("It's " + degreesInFahrenheit + "°F outside which is " + degreesInCelsius + "°C");
    }

    private static double convertToCelsius(double degreesInFahrenheit) {
        return (degreesInFahrenheit - 32) * 5 / 9;
    }
}
