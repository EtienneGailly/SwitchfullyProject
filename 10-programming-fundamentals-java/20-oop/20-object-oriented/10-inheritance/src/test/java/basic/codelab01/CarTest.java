package basic.codelab01;

import com.switchfully.Field;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.switchfully.ReflectionTestUtil.onClass;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private static final String CLASS_NAME = "basic.codelab01.Car";

    @Test
    void checkCarClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        Field.field("identifier", String.class),
                        Field.field("model", String.class),
                        Field.field("color", Color.class)
                );
    }

    @Test
    void checkCarConstructor() {
        onClass(CLASS_NAME)
                .callConstructor("anIdentifier", "aModel", Color.green)
                .expectField("identifier").toHaveValue("anIdentifier")
                .expectField("model").toHaveValue("aModel")
                .expectField("color").toHaveValue(Color.green);
    }

    @Test
    void checkGetHorsepower() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black)
                .callMethod("getHorsepower").expectReturnToBe("120hp");
    }

    @Test
    void checkTurnOnEngine() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black)
                .callMethod("turnOnEngine")
                .expectToBePrinted("""
                        Vroom vroom
                        """);
    }

    @Test
    void checkGetters() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black)
                .callMethod("getColor").expectReturnToBe(Color.black)
                .and()
                .callMethod("getModel").expectReturnToBe("Golf vw");
    }
}
