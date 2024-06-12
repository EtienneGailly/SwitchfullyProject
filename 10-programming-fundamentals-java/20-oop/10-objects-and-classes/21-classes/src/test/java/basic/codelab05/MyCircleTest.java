package basic.codelab05;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class MyCircleTest {

    public static final String CLASS_NAME = "basic.codelab05.shapes.MyCircle";

    @Test
    void checkThatMyCircleClassHasBeenCreated() {
        onClass(CLASS_NAME);
    }

    @Test
    void checkThatMyCircleHasTheCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("radius", double.class),
                        field("color", String.class)
                );
    }

    @Test
    void checkConstructorMyCircle() {
        onClass(CLASS_NAME)
                .callConstructor(2.5)
                .expectField("radius").toHaveValue(2.5)
                .expectField("color").toHaveValue("blue");
    }

    @Test
    void checkDefaultConstructorMyCircle() {
        onClass(CLASS_NAME)
                .callConstructor()
                .expectField("radius").toHaveValue(1.0)
                .expectField("color").toHaveValue("blue");
    }

    @Test
    void checkGetRadius() {
        onClass(CLASS_NAME)
                .callConstructor(2.5)
                .callMethod("getRadius")
                .expectReturnToBe(2.5);
    }

    @Test
    void checkGetArea() {
        onClass(CLASS_NAME)
                .callConstructor(2.5)
                .callMethod("getArea")
                .expectReturnToBe(Math.pow(2.5, 2) * Math.PI);
    }

    @Test
    void checkGetColor() {
        onClass(CLASS_NAME)
                .callConstructor(2.5)
                .callMethod("getColor")
                .expectReturnToBe("blue");
    }

    @Test
    void checkSetColor() {
        onClass(CLASS_NAME)
                .callConstructor(2.5)
                .callMethod("setColor", "red")
                .and()
                .expectField("color").toHaveValue("red");
    }
}
