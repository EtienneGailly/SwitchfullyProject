package basic.codelab01;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

class HumanTest {

    public static final String CLASS_NAME = "basic.codelab01.Human";

    @Test
    void checkClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("firstname", String.class),
                        field("lastname", String.class),
                        field("gender", onClass("basic.codelab01.Gender").retrieveClass())
                );
    }

    @Test
    void checkConstructor() {
        Object maleGender = onClass("basic.codelab01.Gender")
                .callStaticMethod("valueOf", "MALE").retrieveResult();

        onClass(CLASS_NAME)
                .callConstructor("aFirstname", "aLastname", maleGender)
                .expectField("firstname").toHaveValue("aFirstname")
                .expectField("lastname").toHaveValue("aLastname")
                .expectField("gender").toHaveValue(maleGender);

    }

    @Test
    void checkToString() {
        Object maleGender = onClass("basic.codelab01.Gender")
                .getEnumValue("MALE");

        onClass(CLASS_NAME)
                .callConstructor("aFirstname", "aLastname", maleGender)
                .callMethod("toString").expectReturnToBe("aFirstname aLastname has gender MALE");
    }
}
