package basic.solutions;


public class StringsCodelab05Solution {

    public static void main(String[] args) {
        System.out.println(replaceCharacter("This is an axe, Sweet HUH?", 's','L'));
        System.out.println(replaceCharacter("This text contains stuff", 's','t'));
    }

    public static String replaceCharacter(String text, char characterToReplace, char characterToReplaceWith) {
        String toReplaceUppercase = Character.toString(characterToReplace).toUpperCase();
        String toReplaceLowercase = Character.toString(characterToReplace).toLowerCase();
        String toReplaceWith = Character.toString(characterToReplaceWith);
        return text.replaceAll(toReplaceLowercase, toReplaceWith).replaceAll(toReplaceUppercase, toReplaceWith);
    }

}
