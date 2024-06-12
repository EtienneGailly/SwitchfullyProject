package basic;

public class MethodsCodelab02 {

    public static void main(String[] args) {
        // Call the legalDrinkingAge() method and print (write to the console) its returned value.
        int returnedValue = legalDrinkingAge();
        System.out.println(returnedValue);
    }

    // Do mind the static keyword!
    // It's required here if we want to call this method from the main method.
    // (don't change this method)
    private static int legalDrinkingAge() {
        return 16;
    }

}
