package basic.solutions;

public class MethodsCodelab02solution {

    public static void main(String[] args) {
        // Call the legalDrinkingAge() method and print (write to the console) its returned value.
        System.out.println(legalDrinkingAge());
    }

    // Do mind the static keyword!
    // It's required here if we want to call this method from the main method.
    // (don't change this method)
    private static int legalDrinkingAge() {
        return 16;
    }

}
