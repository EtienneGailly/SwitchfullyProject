package basic.codelab02;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class RailroadCarTest {

    private static String CLASS_NAME = "basic.codelab02.RailroadCar";

    @Test
    void checkThatRailroadCarHasTheCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("serialNumber", String.class),
                        field("isFirstClass", boolean.class),
                        field("numberOfSeats", int.class),
                        field("hasToilet", boolean.class)
                );
    }

    @Test
    void checkIfConstructorWith1ParameterExists() {
        onClass(CLASS_NAME)
                .callConstructor("serialNumber")
                .expectField("serialNumber").toHaveValue("serialNumber")
                .expectField("isFirstClass").toHaveValue(false)
                .expectField("numberOfSeats").toHaveValue(100)
                .expectField("hasToilet").toHaveValue(false);

    }

    @Test
    void checkIfConstructorWith4ParameterExists() {
        onClass(CLASS_NAME)
                .callConstructor("serialNumber", true, 125, true)
                .expectField("isFirstClass").toHaveValue(true)
                .expectField("numberOfSeats").toHaveValue(125)
                .expectField("hasToilet").toHaveValue(true);
    }

    @Test
    void checkToString() {
        onClass(CLASS_NAME)
                .callConstructor("serialNumber", true, 125, true)
                .callMethod("toString")
                .expectReturnToBe("RailroadCar serialNumber: Number of seats: 125 - First class: true - Has a toilet: true");
    }

    @Test
    void checkSetFirstClass() {
        onClass(CLASS_NAME)
                .callConstructor("serialNumber", true, 125, true)
                .callMethod("setFirstClass", false)
                .and()
                .expectField("isFirstClass").toHaveValue(false);
    }

    @Test
    void checkToggleToilet() {
        onClass(CLASS_NAME)
                .callConstructor("serialNumber", true, 125, true)
                .callMethod("toggleToilet")
                .and()
                .expectField("hasToilet").toHaveValue(false);
    }
}
