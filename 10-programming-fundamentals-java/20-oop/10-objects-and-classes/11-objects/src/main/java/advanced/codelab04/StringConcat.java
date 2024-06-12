package advanced.codelab04;

import java.util.StringJoiner;

public class StringConcat {

    public static void main(String[] args) {
        String[] lorem = {"Lorem","ipsum","dolor","sit","amet"};
        System.out.println(joinLorem(lorem));
        System.out.println(buildLorem(lorem));
    }

    /**
     * Implement the joinLorem method to make the test succeed.
     * Hints: Look up information on StringJoiner, then create an object and use it.
     */
    static String joinLorem(String[] wordsToJoin) {
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : wordsToJoin) {
            joiner.add(word);
        }
        String joined = joiner.toString();
        return (joined+".");
    }

    /**
     * Implement the buildLorem method to make the test succeed.
     * Hints: Look up information on StringBuilder, then create an object and use it.
     */
    static String buildLorem(String[] wordsToBuild) {
        StringBuilder builder = new StringBuilder();
        int i = 1;
        for (String word : wordsToBuild) {
            builder.append(word);
            if (i == wordsToBuild.length) {
                builder.append(".");
            }
            else {
                builder.append(" ");
            }
            i += 1;
        }
        return (builder.toString());
    }

}
