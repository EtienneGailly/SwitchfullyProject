package basic.codelab01;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class PassengerTest {
    @Test
    void checkClassAndFields() {
        onClass("basic.codelab01.Passenger")
                .expectFields(
                        Field.field("name", String.class)
                );
    }

    @Test
    void checkConstructor() {
        onClass("basic.codelab01.Passenger")
                .callConstructor("Ann")
                .expectField("name").toHaveValue("Ann");
    }
}
