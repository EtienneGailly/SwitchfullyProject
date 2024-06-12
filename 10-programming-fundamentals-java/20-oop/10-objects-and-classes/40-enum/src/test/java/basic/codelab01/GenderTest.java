package basic.codelab01;

import org.junit.jupiter.api.Test;

import static com.switchfully.ReflectionTestUtil.onClass;

public class GenderTest {

    @Test
    void checkEnumValues() {
        onClass("basic.codelab01.Gender")
                .expectEnumConstants("MALE","FEMALE","OTHER");
    }
}
