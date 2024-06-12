package basic.solutions;

public class MethodsCodelab10Solution {

    public static void main(String[] args) {
        //--------
        // Try to remove the duplication of this code

        printRevolvesMessage("Earth");
        printRevolvesMessage("Mars");
        printRevolvesMessage("Mercury");
        printRevolvesMessage("Venus");
    }

    private static void printRevolvesMessage(String planet) {
        System.out.println(planet + " revolves around the sun");
    }
}
