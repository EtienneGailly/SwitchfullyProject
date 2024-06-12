package basic.codelab02;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class PersonTest {
    @Test
    void checkClassAndFields() {
        onClass("basic.codelab02.Person")
                .expectFields(
                        Field.field("fullName", String.class),
                        Field.field("emailAddress", String.class)
                );
    }
}
