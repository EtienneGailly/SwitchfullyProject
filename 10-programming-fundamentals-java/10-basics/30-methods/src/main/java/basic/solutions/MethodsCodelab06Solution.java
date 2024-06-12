package basic.solutions;

import java.util.Locale;

public class MethodsCodelab06Solution {

    public static void main(String[] args) {
        // String format is a locale aware, if your PC is in french or dutch it will provide a , instead of .
        // therefor we give it the Locale.ENGLISH
        String str = String.format(Locale.ENGLISH, "%1.2f", add(80.51, 10.01));
        System.out.println(str);
    }

    private static double add(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }

}
