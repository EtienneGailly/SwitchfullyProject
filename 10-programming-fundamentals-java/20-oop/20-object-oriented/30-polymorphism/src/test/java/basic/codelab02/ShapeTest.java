package basic.codelab02;

import com.switchfully.Field;
import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class ShapeTest {

    @Test
    void checkClassAndFields() {
        onClass("basic.codelab02.Shape")
                .expectFields(
                        Field.field("color", onClass("basic.codelab02.Color").retrieveClass())
                );
    }

    @Test
    void checkGetArea() {
        onClass("basic.codelab02.Shape")
                .callConstructor(onClass("basic.codelab02.Color").getEnumValue("RED"))
                .callMethod("getArea").expectReturnToBe(0.0);
    }

    @Test
    void checkToString() {
        onClass("basic.codelab02.Shape")
                .callConstructor(onClass("basic.codelab02.Color").getEnumValue("RED"))
                .callMethod("toString").expectReturnToBe("Red");
    }
}
