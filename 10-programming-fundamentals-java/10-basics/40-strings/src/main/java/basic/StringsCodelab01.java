package basic;

public class StringsCodelab01 {

    public static void main(String[] args) {
        System.out.println(helloName("Mom"));
        System.out.println(helloName("Dad"));
    }

    /**
     * Given a String name, e.g. "Karl",
     * return a greeting of the form "Hello Karl!".
     *        helloName("Karl") → "Hello Karl!"
     *        helloName("Moon") → "Hello Moon!"
     */
    public static String helloName(String name) {
        // implement me as described
        return "Hello " + name + "!";
    }

}
