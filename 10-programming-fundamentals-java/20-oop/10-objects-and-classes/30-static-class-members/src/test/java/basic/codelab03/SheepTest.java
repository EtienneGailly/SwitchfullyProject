package basic.codelab03;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SheepTest {


    public static final String CLASS_NAME = "basic.codelab03.Sheep";

    @Test
    void checkAmountOfSheeps() {
        int numberOfSheep = (int) onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.black)
                        .callMethod("amountOfActiveSheep").retrieveResult();
        onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.black);
        onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.black)
                .callMethod("amountOfActiveSheep").expectReturnToBe(numberOfSheep + 2);
    }

    @Test
    void checkClassAndFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("nickname", String.class),
                        field("price", double.class),
                        field("color", Color.class)
                );
    }

    @Test
    void checkConstructor() {
        onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.black)
                .expectField("nickname").toHaveValue("aNickname")
                .expectField("price").toHaveValue(10.50)
                .expectField("color").toHaveValue(Color.black);
    }

    @Test
    void checkConstructorWhite() {
        onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.WHITE)
                .expectField("nickname").toHaveValue("aNickname")
                .expectField("price").toHaveValue(10.50)
                .expectField("color").toHaveValue(Color.white);
    }

    @Test
    void checkDollyConstraint() {
        assertThatThrownBy(() -> onClass(CLASS_NAME).callConstructor("Dolly", 10.50, Color.black))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void checkColorConstraint() {
        assertThatThrownBy(() -> onClass(CLASS_NAME).callConstructor("Dolly", 10.50, Color.orange))
                .isInstanceOf(RuntimeException.class);
    }

    @Test
    void checkToStringBlack() {
        onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.black)
                .callMethod("toString").expectReturnToBe("I'm a sheep named aNickname (which is not Dolly) and I'm not white");

    }

    @Test
    void checkToStringWhite() {
        onClass(CLASS_NAME)
                .callConstructor("aNickname", 10.50, Color.white)
                .callMethod("toString").expectReturnToBe("I'm a sheep named aNickname (which is not Dolly) and I'm white");

    }
}
