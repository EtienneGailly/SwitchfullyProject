package basic.codelab06;

import org.junit.jupiter.api.Test;

import static com.switchfully.Field.field;
import static com.switchfully.ReflectionTestUtil.onClass;

public class CoolEmployeeTest {

    public static final String CLASS_NAME = "basic.codelab06.CoolEmployee";

    @Test
    void checkThatCoolEmployeeClassHasBeenCreated() {
        onClass(CLASS_NAME);
    }

    @Test
    void checkThatCoolEmployeeHasTheCorrectFields() {
        onClass(CLASS_NAME)
                .expectFields(
                        field("id", int.class),
                        field("firstName", String.class),
                        field("lastName", String.class),
                        field("salary", int.class)
                );
    }

    @Test
    void checkDefaultConstructorCoolEmployee() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .expectField("id").toHaveValue(123)
                .expectField("firstName").toHaveValue("firstName")
                .expectField("lastName").toHaveValue("lastName")
                .expectField("salary").toHaveValue(4500);
    }

    @Test
    void checkGetters() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .callMethod("getId")
                .expectReturnToBe(123)
                .and()
                .callMethod("getFirstName")
                .expectReturnToBe("firstName")
                .and()
                .callMethod("getLastName")
                .expectReturnToBe("lastName")
                .and()
                .callMethod("getSalary")
                .expectReturnToBe(4500);
    }

    @Test
    void checkAnnualSalary() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .callMethod("getAnnualSalary")
                .expectReturnToBe(4500 * 13.9);
    }

    @Test
    void checkFullName() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .callMethod("getFullName")
                .expectReturnToBe("firstName lastName");
    }

    @Test
    void checkSetSalary() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .callMethod("setSalary", 2000)
                .and()
                .expectField("salary").toHaveValue(2000);
    }

    @Test
    void checkRaiseSalary() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .callMethod("raiseSalary", 0.5)
                .and()
                .expectField("salary").toHaveValue(6750);
    }

    @Test
    void checkToString() {
        onClass(CLASS_NAME)
                .callConstructor(123, "firstName", "lastName", 4500)
                .callMethod("toString")
                .expectReturnToBe("(123) firstName lastName - 4500 EUR / month");

    }
}
