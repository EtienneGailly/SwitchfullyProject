package basic.codelab01;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class TimeTest {

    public static final String CLASS_NAME = "basic.codelab01.Time";

    @Test
    void timeExistsAndHasTheCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("hour", int.class),
                        field("minute", int.class),
                        field("second", double.class)
                );
    }

    @Test
    void timeHasDefaultConstructor() {
        onClass(CLASS_NAME)
                .callConstructor()
                .expectField("hour").toHaveValue(13)
                .expectField("minute").toHaveValue(30)
                .expectField("second").toHaveValue(0.0);
    }

    @Test
    void timeHasConstructorForHoursAndMinutes() {
        onClass(CLASS_NAME)
                .callConstructor(10, 50)
                .expectField("hour").toHaveValue(10)
                .expectField("minute").toHaveValue(50)
                .expectField("second").toHaveValue(0.0);
    }

    @Test
    void timeHasConstructorForHoursMinutesAndSeconds() {
        onClass(CLASS_NAME)
                .callConstructor(10, 50, 20.12)
                .expectField("hour").toHaveValue(10)
                .expectField("minute").toHaveValue(50)
                .expectField("second").toHaveValue(20.12);
    }

    @Test
    void timeHasToString() {
        onClass(CLASS_NAME)
                .callConstructor(10, 50, 20.12)
                .callMethod("toString").expectReturnToBe("The time is 10:50:20.12");
    }

    @Test
    void timeHasGetters() {
        onClass(CLASS_NAME)
                .callConstructor(10, 50, 20.12)
                .callMethod("getHour").expectReturnToBe(10)
                .and()
                .callMethod("getMinute").expectReturnToBe(50);
    }

    @Test
    void timeHasConstant() {
        onClass(CLASS_NAME)
                .expectConstants(field("TEA_TIME_HOUR", int.class));
    }

    @Test
    void highestHourHigherHour() {
        Object time = onClass(CLASS_NAME)
                .callConstructor(10, 50)
                .retrieveObject();

        Object otherTime = onClass(CLASS_NAME)
                .callConstructor(9, 50)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("highestHour", time, otherTime).expectReturnToBe(time);
    }

    @Test
    void highestHourHigherMinutes() {
        Object time = onClass(CLASS_NAME)
                .callConstructor(9, 51)
                .retrieveObject();

        Object otherTime = onClass(CLASS_NAME)
                .callConstructor(9, 50)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("highestHour", time, otherTime).expectReturnToBe(time);
    }

    @Test
    void highestHourHigherSeconds() {
        Object time = onClass(CLASS_NAME)
                .callConstructor(9, 50, 10.0)
                .retrieveObject();

        Object otherTime = onClass(CLASS_NAME)
                .callConstructor(9, 50, 9.0)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("highestHour", time, otherTime).expectReturnToBe(time);
    }

    @Test
    void highestHourSameTime() {
        Object time = onClass(CLASS_NAME)
                .callConstructor(9, 50, 10.0)
                .retrieveObject();

        Object otherTime = onClass(CLASS_NAME)
                .callConstructor(9, 50, 10.0)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("highestHour", time, otherTime).expectReturnToBe(otherTime);
    }

    @Test
    void otherTimeIsHigher() {
        Object time = onClass(CLASS_NAME)
                .callConstructor(9, 50, 10.0)
                .retrieveObject();

        Object otherTime = onClass(CLASS_NAME)
                .callConstructor(10, 50, 10.0)
                .retrieveObject();

        onClass(CLASS_NAME)
                .callConstructor()
                .callMethod("highestHour", time, otherTime).expectReturnToBe(otherTime);
    }
}
