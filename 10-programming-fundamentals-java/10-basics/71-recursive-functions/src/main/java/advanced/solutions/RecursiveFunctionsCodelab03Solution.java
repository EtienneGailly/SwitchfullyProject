package advanced.solutions;

public class RecursiveFunctionsCodelab03Solution {

    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
    }

    /**
     * Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
     * e.g. pairStar("hello") → "hel*lo"
     * e.g. pairStar("xxyy") → "x*xy*y"
     * e.g. pairStar("aaaa") → "a*a*a*a"
     */
    public static String pairStar(String input) {
        return pairStar(input, input.length() - 1);
    }

    private static String pairStar(String input, int index) {
        if (index == 0) {
            return "" + input.charAt(0);
        }

        return pairStar(input, index - 1) + getPrefix(input, index) + input.charAt(index);
    }

    private static String getPrefix(String input, int index) {
        if (input.charAt(index) == input.charAt(index - 1)) {
            return "*";
        }
        return "";
    }
}

