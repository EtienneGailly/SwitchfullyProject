package basic.codelab02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDate;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class AgendaTest {

    @Test
    void checkAgendaClassAndFields() {
        onClass("basic.codelab02.Agenda")
                .expectFields(
                        field("name", String.class),
                        field("owner", onClass("basic.codelab02.Person").retrieveClass()),
                        field("entries", Array.newInstance(onClass("basic.codelab02.Entry").retrieveClass(), 1).getClass())
                ).expectConstants(
                        field("MAX_NUMBER_OF_ENTRIES", int.class)
                );
    }

    @Test
    void checkAgendaConstructor() {
        onClass("basic.codelab02.Agenda")
                .callConstructor("my agenda",
                        onClass("basic.codelab02.Person").callConstructor("James Bond", "James.Bond@mi6.co.uk").retrieveObject()
                );
    }

    @Test
    void checkAddEntry() {
        Object entry = onClass("basic.codelab02.Entry").callConstructor(LocalDate.now(), "someTitle").retrieveObject();
        onClass("basic.codelab02.Agenda")
                .callConstructor("my agenda",
                        onClass("basic.codelab02.Person").callConstructor("James Bond", "James.Bond@mi6.co.uk").retrieveObject()
                )
                .callMethod("addEntry", entry);
    }
}
