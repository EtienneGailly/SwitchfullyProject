package basic.codelab02;

import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class DogTest {

    public static final String CLASS_NAME = "basic.codelab02.Dog";

    @Test
    void checkPetClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields(

                );
    }

    @Test
    void checkConstructor() {
        onClass(CLASS_NAME)
                .callConstructor("Chonky", 10.0, true);
    }

    @Test
    void checkGetters() {
        onClass(CLASS_NAME)
                .callConstructor("Chonky", 10.0, true)
                .callMethod("getName").expectReturnToBe("Chonky").and()
                .callMethod("getPrice").expectReturnToBe(10.0).and()
                .callMethod("isHealthy").expectReturnToBe(true);
    }

    @Test
    void checkBuy() {
        onClass(CLASS_NAME)
                .callConstructor("Chonky", 10.0, true)
                .callMethod("buy", 11.0).expectReturnToBe(true);
    }

    @Test
    void checkBuyNotHealthy() {
        onClass(CLASS_NAME)
                .callConstructor("Chonky", 10.0, false)
                .callMethod("buy", 11.0).expectReturnToBe(false);
    }

    @Test
    void checkBuyNotEnoughMoney() {
        onClass(CLASS_NAME)
                .callConstructor("Chonky", 10.0, true)
                .callMethod("buy", 9.0).expectReturnToBe(false);
    }
}
