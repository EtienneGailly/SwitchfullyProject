package basic.solutions;


public class MethodsCodelab08Solution {

    public static void main(String[] args) {
        increment(10);
    }

    private static int increment(int valueToIncrement) {
        int oldValue = valueToIncrement;
        valueToIncrement++;
        // Printing using String.format. Google: "Java String format"
        System.out.println(String.format("Value %d incremented by 1. New value is %d", oldValue, valueToIncrement));
        // This works as well:
        // System.out.println("Value " + oldValue + " incremented by 1. New value is " + valueToIncrement);
        return valueToIncrement;
    }

}
