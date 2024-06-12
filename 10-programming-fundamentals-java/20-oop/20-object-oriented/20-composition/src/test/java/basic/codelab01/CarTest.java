package basic.codelab01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class CarTest {

    @Test
    void checkCarClassAndFields() {
        onClass("basic.codelab01.Car")
                .expectFields(
                        field("engine", onClass("basic.codelab01.Engine").retrieveClass()),
                        field("driver", onClass("basic.codelab01.Driver").retrieveClass()),
                        field("passengers", Array.newInstance(onClass("basic.codelab01.Passenger").retrieveClass(), 1).getClass())
                );
    }

    @Test
    void checkCarConstructor() {
        Object passengers = Array.newInstance(onClass("basic.codelab01.Passenger").retrieveClass(), 1);
        Array.set(passengers, 0, onClass("basic.codelab01.Passenger").callConstructor("Ann").retrieveObject());

        onClass("basic.codelab01.Car")
                .callConstructor(
                        onClass("basic.codelab01.Engine").callConstructor(20).retrieveObject(),
                        onClass("basic.codelab01.Driver").callConstructor("James", 18).retrieveObject(),
                        passengers
                );
    }

    @Test
    void checkToString() {
        Object passengers = Array.newInstance(onClass("basic.codelab01.Passenger").retrieveClass(), 1);
        Array.set(passengers, 0, onClass("basic.codelab01.Passenger").callConstructor("Ann").retrieveObject());

        onClass("basic.codelab01.Car")
                .callConstructor(
                        onClass("basic.codelab01.Engine").callConstructor(20).retrieveObject(),
                        onClass("basic.codelab01.Driver").callConstructor("James", 18).retrieveObject(),
                        passengers
                )
                .callMethod("toString").expectReturnToBe("I am car with 1 passenger(s) (Ann), a driver called James of 18 years old and engine with 20 horse-power");
    }
}
