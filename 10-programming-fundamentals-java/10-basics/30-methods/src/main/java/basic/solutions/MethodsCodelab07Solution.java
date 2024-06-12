package basic.solutions;


public class MethodsCodelab07Solution {

    public static void main(String[] args) {
        System.out.println(add(divide(add(4.5, 3.5), 2.0), multiply(2.0, subtract(4.5, 1.5))));
    }

    private static double add(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }

    private static double subtract(double leftOperand, double rightOperand) {
        return leftOperand - rightOperand;
    }

    private static double divide(double leftOperand, double rightOperand) {
        return leftOperand / rightOperand;
    }

    private static double multiply(double leftOperand, double rightOperand) {
        return leftOperand * rightOperand;
    }

}
