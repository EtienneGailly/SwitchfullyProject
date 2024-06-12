package basic.codelab03;

import com.google.common.reflect.ClassPath;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import static java.lang.reflect.Modifier.FINAL;
import static java.lang.reflect.Modifier.PRIVATE;
import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.tuple;

class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;


    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void checkNothingBroke() {
        Main.main(null);
        Assertions.assertThat(outContent.toString()).isEqualToNormalizingNewlines(
                """
                Gardener Patrick will tend to the garden
                Garden: Weeds are removed
                Garden: Hedges are trimmed
                Garden: Grass is mowed
                ********************
                Cook Hendrick is preparing some tasty chicken
                Kitchen: preparing Tasty chicken
                Butler Sofia is serving Tasty chicken in the dining room
                Dining room: Tasty chicken is being served!
                ********************
                Plumber Alexia is fixing the bathroom
                Bathroom: Leak is being fixed
                """
        );
    }


    @Test
    void checkAllFieldsPrivateFinal() throws IOException {
        Assertions.assertThat(ClassPath.from(MainTest.class.getClassLoader()).getTopLevelClassesRecursive("basic.codelab02"))
                .extracting(classInfo -> classInfo.load())
                .flatExtracting(clazz -> Arrays.stream(clazz.getDeclaredFields()).map(field -> tuple(clazz.getSimpleName(), field)).collect(toList()))
                .extracting(tuple -> {
                    List<Object> objectList = tuple.toList();
                    Field field = (Field) objectList.get(1);
                    return tuple(objectList.get(0), field.getName(), field.getModifiers());
                })
                .as("All the fields in this exercise need to be private final")
                .allMatch(tuple -> (int) tuple.toList().get(2) == (PRIVATE | FINAL));
    }
}
