package basic.codelab03;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.switchfully.ReflectionTestUtil.onClass;

public class PersonTest {

    public static final String CLASS_NAME = "basic.codelab03.Person";

    @ParameterizedTest(name = "age {0} will result in an allowance of {1}")
    @CsvSource({"10,100", "12,100", "13,105", "17,125", "18,0"})
    void certainAgeWillResultInCertainAllowance(int age, int allowance) {
        checkAllowance(age, allowance);
    }

    private void checkAllowance(int age, int allowance) {
        onClass(CLASS_NAME)
                .callConstructor(age)
                .callMethod("calculateAllowance")
                .expectReturnToBe(allowance);
    }
}
