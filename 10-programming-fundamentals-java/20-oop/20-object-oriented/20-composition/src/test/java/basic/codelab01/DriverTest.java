package basic.codelab01;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class DriverTest {
    @Test
    void checkClassAndFields() {
        onClass("basic.codelab01.Driver")
                .expectFields(
                        Field.field("name", String.class),
                        Field.field("age", int.class)
                );
    }

    @Test
    void checkConstructor() {
        onClass("basic.codelab01.Driver")
                .callConstructor("James", 18)
                .expectField("name").toHaveValue("James")
                .expectField("age").toHaveValue(18);
    }

}
