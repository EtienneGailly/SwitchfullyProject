package basic.codelab01;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class SUVTest {
    private static final String CLASS_NAME = "basic.codelab01.SUV";

    @Test
    void checkCarClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("is4WheelDrive", boolean.class)
                );
    }

    @Test
    void checkCarConstructor() {
        onClass(CLASS_NAME)
                .callConstructor("anIdentifier", "aModel", Color.green, true)
                .expectField("is4WheelDrive").toHaveValue(true);
    }

    @Test
    void checkGetHorsepower() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black, true)
                .callMethod("getHorsepower").expectReturnToBe("200hp");
    }

    @Test
    void checkTurnOnEngine() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black, true)
                .callMethod("turnOnEngine")
                .expectToBePrinted("""
                        Vroom vroom
                        """);
    }

    @Test
    void checkGetters() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black, true)
                .callMethod("getColor").expectReturnToBe(Color.black)
                .and()
                .callMethod("getModel").expectReturnToBe("Golf vw");
    }
}
