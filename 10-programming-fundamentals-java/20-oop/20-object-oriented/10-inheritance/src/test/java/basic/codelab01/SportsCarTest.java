package basic.codelab01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.switchfully.ReflectionTestUtil.onClass;
import static org.assertj.core.api.Assertions.assertThat;

public class SportsCarTest {
    private static final String CLASS_NAME = "basic.codelab01.SportsCar";

    @Test
    void checkCarClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields();
    }

    @Test
    void checkGetHorsepower() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black)
                .callMethod("getHorsepower").expectReturnToBe("350hp");
    }

    @Test
    void checkTurnOnEngine() {
        onClass(CLASS_NAME)
                .callConstructor("1-AAA-111", "Golf vw", Color.black)
                .callMethod("turnOnEngine")
                .expectToBePrinted("""
                        Brabrabrabraaa
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
