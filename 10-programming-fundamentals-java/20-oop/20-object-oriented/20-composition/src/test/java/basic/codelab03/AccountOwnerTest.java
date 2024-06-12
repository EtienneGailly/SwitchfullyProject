package basic.codelab03;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

class AccountOwnerTest {

    @Test
    void checkClassAndFields() {
        onClass("basic.codelab03.AccountOwner")
                .expectFields(
                        Field.field("firstname", String.class),
                        Field.field("lastname", String.class)
                );
    }

    @Test
    void checkConstructor() {
        onClass("basic.codelab03.AccountOwner")
                .callConstructor("aFirstname", "aLastname")
                .expectField("firstname").toHaveValue("aFirstname")
                .expectField("lastname").toHaveValue("aLastname")
                .callMethod("getFirstname").expectReturnToBe("aFirstname").and()
                .callMethod("getLastname").expectReturnToBe("aLastname").and()
                .callMethod("toString").expectReturnToBe("Mr. or Mrs. aFirstname, aLastname");
    }
}
