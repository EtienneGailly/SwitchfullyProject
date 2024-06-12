package basic.codelab01;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.switchfully.ReflectionTestUtil.onClass;

public class ShopTest {

    public static final String CLASS_NAME = "basic.codelab01.Shop";

    @Test
    void checkGetCar() {
        Object car = onClass("basic.codelab01.Car")
                .callConstructor("1", "Peugeot", Color.white).retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("getCar", "1").expectReturnToBe(car);
    }
}
