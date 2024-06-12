package code_examples;

public class TernaryExpression {

    public static void main(String[] args) {
        System.out.println(checkAge(15));
        System.out.println(checkAgeTernary(15));
    }

    private static String checkAge(int age) {
        if(age > 18) {
            return "I am an adult";
        }
        return "I am still a child";
    }

    private static String checkAgeTernary(int age) {
        return age > 18 ? "I am an adult" : "I am still a child";
    }
}
