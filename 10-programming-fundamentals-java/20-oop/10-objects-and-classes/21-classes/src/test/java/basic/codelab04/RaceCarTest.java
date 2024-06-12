package basic.codelab04;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class RaceCarTest {
    public static final String CLASS_NAME = "basic.codelab04.RaceCar";

    @Test
    void checkThatRaceCarClassHasBeenCreated() {
        onClass(CLASS_NAME);
    }

    @Test
    void checkThatRaceCarHasTheCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("numberOfGears", int.class),
                        field("currentGear", int.class)
                );
    }

    @Test
    void checkConstructorRaceCar() {
        onClass(CLASS_NAME)
                .callConstructor(10, 2)
                .expectField("numberOfGears").toHaveValue(10)
                .expectField("currentGear").toHaveValue(2);
    }

    @Test
    void checkDefaultConstructorRaceCar() {
        onClass(CLASS_NAME)
                .callConstructor()
                .expectField("numberOfGears").toHaveValue(6)
                .expectField("currentGear").toHaveValue(0);
    }

    @Test
    void checkConstructorRaceCarCurrentGearNotLowerThan0() {
        onClass(CLASS_NAME)
                .callConstructor(6, -1)
                .expectField("currentGear").toHaveValue(0);
    }

    @Test
    void checkConstructorRaceCarCurrentGearNotHigherThanAmountOfGears() {
        onClass(CLASS_NAME)
                .callConstructor(6, 8)
                .expectField("currentGear").toHaveValue(6);
    }

    @Test
    void checkShiftGearDown() {
        onClass(CLASS_NAME)
                .callConstructor(6, 1)
                .callMethod("shiftGearDown")
                .and()
                .expectField("currentGear").toHaveValue(0);
    }

    @Test
    void checkShiftGearDownNotLowerThan0() {
        onClass(CLASS_NAME)
                .callConstructor(6, 0)
                .callMethod("shiftGearDown")
                .and()
                .expectField("currentGear").toHaveValue(0);
    }

    @Test
    void checkShiftGearUp() {
        onClass(CLASS_NAME)
                .callConstructor(6, 0)
                .callMethod("shiftGearUp")
                .and()
                .expectField("currentGear").toHaveValue(1);
    }

    @Test
    void checkShiftGearUpNotHigherThanCurrentGear() {
        onClass(CLASS_NAME)
                .callConstructor(6, 6)
                .callMethod("shiftGearUp")
                .and()
                .expectField("currentGear").toHaveValue(6);
    }

    @Test
    void checkToString() {
        onClass(CLASS_NAME)
                .callConstructor(6, 0)
                .callMethod("toString")
                .expectReturnToBe("Racecar with 6 in total, currently in 0 gear.");
    }

}
