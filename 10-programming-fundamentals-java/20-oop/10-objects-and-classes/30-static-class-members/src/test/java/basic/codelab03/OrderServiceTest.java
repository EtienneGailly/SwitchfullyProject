package basic.codelab03;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

class OrderServiceTest {

    public static final String CLASS_NAME = "basic.codelab03.OrderService";

    @Test
    void checkOrderSheep() {
        Object sheep = onClass("basic.codelab03.Sheep")
                .callConstructor("aNickname", 10.0, Color.black)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("orderSheep", sheep).expectReturnToBe(15.0);
    }

    @Test
    void checkConstant() {
        onClass(CLASS_NAME)
                .expectConstants(
                        field("ORDER_FEE", double.class)
                );
    }

    @Test
    void checkOrderSheepAsText() {
        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("orderFeeAsText").expectReturnToBe("The order fee is 5.0");
    }
}
