package basic;

public class MethodsCodelab08 {

    public static void main(String[] args) {
        // Create a method increment
        // Method increment should define one parameter, an int
        // Method increment should increment the value of the parameter by one (using the increment operator)
        // Method increment should print the message "Value <OLD_VALUE> incremented by 1. New value is <NEW_VALUE>"
        // Method increment should return the new (incremented) value
        // call the increment method with argument 10
        increment(10);
    }
    public static int increment(int value){
        System.out.println("Value " + value + " incremented by 1. New value is " + (++value));
        return value;
    }
}
