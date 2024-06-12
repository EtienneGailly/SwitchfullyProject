package basic.solutions.codelab03;

/**
 * Do the following
 * ------------------
 * 1. Create a main method (we need it to run/execute the PersonRunner)
 * 2. In the body of the main method, create a Person object
 * 3. Then, for this person (Person object):
 *      set its name to "Robert"
 *      set its heightInCm to 178
 * 4. Afterwards:
 *      call the askPersonAboutHimself() method and print the result.
 *          The result should be:
 *              "Hello! My name is Robert and I'm 178cm tall"
 * 5. Then, create another Person object, but this time with name "Emma" and height 180.
 *      Finally, repeat step 4 for this object.
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person robert = new Person();
        robert.setName("Robert");
        robert.setHeightInCm(178);

        Person emma = new Person();
        emma.setName("Emma");
        emma.setHeightInCm(180);
    }
}
