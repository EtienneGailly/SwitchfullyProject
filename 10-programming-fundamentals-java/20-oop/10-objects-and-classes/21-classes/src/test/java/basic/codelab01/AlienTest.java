package basic.codelab01;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class AlienTest {

    public static final String CLASS_NAME = "basic.codelab01.Alien";

    @Test
    void checkThatAlienClassHasBeenCreated() {
        onClass(CLASS_NAME);
    }

    @Test
    void checkThatAlienHasTheCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("firstName", String.class),
                        field("lastName", String.class),
                        field("numberOfHeads", int.class)
                );
    }

    @Test
    void checkThatAlienHasTheDefaultConstructor() {
        onClass(CLASS_NAME)
                .callConstructor()
                .expectField("firstName").toHaveValue("Unidentified")
                .expectField("lastName").toHaveValue("Unidentified")
                .expectField("numberOfHeads").toHaveValue(1);
    }

    @Test
    void checkThatAlienHasConstructorWith2Parameters() {
        onClass(CLASS_NAME)
                .callConstructor("firstName", "lastName")
                .expectField("firstName").toHaveValue("firstName")
                .expectField("lastName").toHaveValue("lastName")
                .expectField("numberOfHeads").toHaveValue(1);
    }

    @Test
    void checkThatAlienHasConstructorWith3Parameters() {
        onClass(CLASS_NAME)
                .callConstructor("firstName", "lastName", 5)
                .expectField("firstName").toHaveValue("firstName")
                .expectField("lastName").toHaveValue("lastName")
                .expectField("numberOfHeads").toHaveValue(5);
    }

    @Test
    void checkThatGetFullNameMethodExists() {
        onClass(CLASS_NAME)
                .callConstructor("firstName", "lastName", 5)
                .callMethod("getFullName")
                .expectReturnToBe("firstName lastName");
    }

    @Test
    void checkThatGetNumberOfHeadsMethodExists() {
        onClass(CLASS_NAME)
                .callConstructor("firstName", "lastName", 5)
                .callMethod("getNumberOfHeads")
                .expectReturnToBe(5);
    }
}
