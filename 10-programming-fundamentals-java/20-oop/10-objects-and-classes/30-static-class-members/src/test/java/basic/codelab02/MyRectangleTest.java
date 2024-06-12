package basic.codelab02;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

class MyRectangleTest {


    public static final String CLASS_NAME = "basic.codelab02.MyRectangle";

    @Test
    void myRectangleExistsAndHasFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("xCoordinate", int.class),
                        field("yCoordinate", int.class),
                        field("width", int.class),
                        field("height", int.class)
                );
    }

    @Test
    void checkDefaultConstructor() {
        onClass(CLASS_NAME)
                .callConstructor()
                .expectField("xCoordinate").toHaveValue(5)
                .expectField("yCoordinate").toHaveValue(10)
                .expectField("width").toHaveValue(50)
                .expectField("height").toHaveValue(100);
    }

    @Test
    void check4ParameterConstructor() {
        onClass(CLASS_NAME)
                .callConstructor(9, 9, 9, 9)
                .expectField("xCoordinate").toHaveValue(9)
                .expectField("yCoordinate").toHaveValue(9)
                .expectField("width").toHaveValue(9)
                .expectField("height").toHaveValue(9);
    }

    @Test
    void checkGetters() {
        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("getXCoordinate").expectReturnToBe(5)
                .and()
                .callMethod("getYCoordinate").expectReturnToBe(10)
                .and()
                .callMethod("getWidth").expectReturnToBe(50)
                .and()
                .callMethod("getHeight").expectReturnToBe(100);
    }

    @Test
    void checkSetters() {
        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("setDimensions", 9, 8)
                .and()
                .expectField("width").toHaveValue(9)

                .expectField("height").toHaveValue(8);
    }

    @Test
    void checkArea() {
        onClass(CLASS_NAME)
                .callConstructor(0, 0, 5, 10)
                .callMethod("calculateArea").expectReturnToBe(50);
    }

    @Test
    void checkLabel() {
        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("setLabel", "aCircle")
                .and()
                .callMethod("getLabel").expectReturnToBe("aCircle");
    }

    @Test
    void checkInstanceCount() {
        onClass(CLASS_NAME)
                .callConstructor();
        onClass(CLASS_NAME)
                .callConstructor();
        onClass(CLASS_NAME)
                .callConstructor();
        onClass(CLASS_NAME)
                .callConstructor()
                .expectField("instanceCount").toHaveValue(4);
    }
}
