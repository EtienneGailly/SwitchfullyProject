package advanced.codelab02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

class CustomTimeTest {

    @BeforeEach
    void setUp() {
        Locale.setDefault(Locale.ENGLISH);
    }

    @Test
    void create_defaultConstructorReturnsMidnight() {
        CustomTime expectedCustomTime = new CustomTime(0, 0, 0);
        CustomTime defaultCustomTime = new CustomTime();
        assertThat(defaultCustomTime).isEqualTo(expectedCustomTime);
    }

    @Test
    void midnight_hasCustomTimeOfMidnight() {
        CustomTime expectedCustomTime = new CustomTime(0, 0, 0);
        assertThat(CustomTime.MIDNIGHT).isEqualTo(expectedCustomTime);
    }

    @Test
    void noon_hasCustomTimeOfNoon() {
        CustomTime expectedCustomTime = new CustomTime(12, 0, 0);
        assertThat(CustomTime.NOON).isEqualTo(expectedCustomTime);
    }

    @Test
    void toString_shouldReturnCorrectString() {
        String expected = "09:41:03.3";
        CustomTime time = new CustomTime(9, 41, 3.331);
        assertThat(time.toString()).isEqualTo(expected);
    }

    @Test
    void equals_shouldReturnTrueForEqualObjects() {
        CustomTime time1 = new CustomTime(9, 41, 3.331);
        CustomTime time2 = new CustomTime(9, 41, 3.331);
        assertThat(time1.equals(time2)).isTrue();
    }

    @Test
    void equals_shouldReturnFalseIfHourIsDifferent() {
        CustomTime time1 = new CustomTime(9, 41, 3.331);
        CustomTime time2 = new CustomTime(8, 41, 3.331);
        assertThat(time1.equals(time2)).isFalse();
    }

    @Test
    void equals_shouldReturnFalseIfMinuteIsDifferent() {
        CustomTime time1 = new CustomTime(9, 41, 3.331);
        CustomTime time2 = new CustomTime(9, 42, 3.331);
        assertThat(time1.equals(time2)).isFalse();
    }

    @Test
    void equals_shouldReturnFalseIfSecondIsDifferent() {
        CustomTime time1 = new CustomTime(9, 41, 3.331);
        CustomTime time2 = new CustomTime(9, 41, 3.332);
        assertThat(time1.equals(time2)).isFalse();
    }

    @Test
    void add_shouldAddCustomTimeToThisObject() {
        CustomTime expectedCustomTime = new CustomTime(0, 0, 0);
        CustomTime time1 = new CustomTime(9, 41, 3.331);
        CustomTime time2 = new CustomTime(14, 18, 56.669);
        time1.add(time2);

        assertThat(time1.equals(expectedCustomTime)).isTrue();
    }
}
