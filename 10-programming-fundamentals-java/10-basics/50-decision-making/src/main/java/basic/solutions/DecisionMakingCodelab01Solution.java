package basic.solutions;

public class DecisionMakingCodelab01Solution {

    public static void main(String[] args) {
        System.out.println(is1Or2MoreThanAMultipleOf20(20));
        System.out.println(is1Or2MoreThanAMultipleOf20(21));
    }

    /**
     * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
     * If the given number is negative, always return false
     * Tip: use the modulus operator
     * is1Or2MoreThanAMultipleOf20(20) → false
     * is1Or2MoreThanAMultipleOf20(21) → true
     * is1Or2MoreThanAMultipleOf20(22) → true
     * is1Or2MoreThanAMultipleOf20(23) → false
     * is1Or2MoreThanAMultipleOf20(41) → true
     */
    public static boolean is1Or2MoreThanAMultipleOf20(int numberToCheck) {
        return numberToCheck % 20 == 1 || numberToCheck % 20 == 2;
    }


}
