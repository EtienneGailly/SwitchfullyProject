package basic.codelab02;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.switchfully.ReflectionTestUtil.onClass;

public class EntryTest {

    @Test
    void checkClassAndFields() {
        onClass("basic.codelab02.Entry")
                .expectFields(
                        Field.field("date", LocalDate.class),
                        Field.field("title", String.class)
                );
    }
}
