package basic;

public class MethodsCodelab01 {

    public static void main(String[] args) {
        // Call the legalDrinkingAge() method.
        legalDrinkingAge();
    }

    // Do mind the static keyword!
    // It's required here if we want to call this method from the main method.
    // (don't change this method)
    private static void legalDrinkingAge() {
        System.out.println(16);
    }

}
