package basic;

public class StringsCodelab05 {

    public static void main(String[] args) {
        System.out.println(replaceCharacter("This is an axe, Sweet HUH?", 's','L'));
        System.out.println(replaceCharacter("This text contains stuff", 's','t'));
    }

    /**
     * Given a String text and two characters (characterToReplace, characterToReplaceWith)
     * return the text in which, the characterToReplace (for all occurrences, both lower and uppercase) is replaced by characterToReplaceWith
     *      e.g.: "This is an axe. Sweet, HUH?", 's' (to replace) and 'L' (replace with),
     *      should return "ThiL iL an axe, Lweet HUH?"
     * Using the documentation of String:
     *      Search for the replaceAll method
     *      Search for the upperCase / Lowercase method
     * Also: search how you can convert a char to a String, you'll need this as well.
     */
    public static String replaceCharacter(String text, char characterToReplace, char characterToReplaceWith) {
        // implement me as described
        text = text.replace(Character.toUpperCase(characterToReplace),characterToReplaceWith);
        text = text.replace(Character.toLowerCase(characterToReplace),characterToReplaceWith);
        return text;
    }

}
