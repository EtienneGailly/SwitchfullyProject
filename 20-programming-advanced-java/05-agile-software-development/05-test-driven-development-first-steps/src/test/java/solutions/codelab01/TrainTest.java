package solutions.codelab01;

import basic.solutions.codelab01.Train;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrainTest {

    @Test
    void whenCreatingATrain_thenHoursDelayedIsEqualTo0() {
        //WHEN
        Train train = new Train();

        //THEN
        assertThat(train.getHoursDelayed()).isEqualTo(0);
    }

    @Test
    void whenSettingHoursDelayed_thenHoursDelayedIsSetToThatNumber() {
        //GIVEN
        int hoursDelayed  = 2;
        Train train = new Train();

        //WHEN
        train.setHoursDelayed(hoursDelayed);

        //THEN
        assertThat(train.getHoursDelayed()).isEqualTo(hoursDelayed);
    }

    @Test
    void givenNegativeNumber_whenSettingHoursDelayed_thenHoursDelayedIsSetToThatNumber() {
        //GIVEN
        int hoursDelayed  = -1;
        Train train = new Train();

        //WHEN
        train.setHoursDelayed(hoursDelayed);

        //THEN
        assertThat(train.getHoursDelayed()).isEqualTo(0);
    }

    @Test
    void given0HoursDelayed_whenCustomerSatisfaction_thenMessageIsNiceNRolling() {
        //GIVEN
        Train train = new Train();
        train.setHoursDelayed(0);

        //WHEN
        String actual = train.customerSatisfaction();

        //THEN
        assertThat(actual).isEqualTo("Nice ‘n’ rolling!");
    }

    @Test
    void given1HourDelayed_whenCustomerSatisfaction_thenJustAnotherDayInTheTrain() {
        //GIVEN
        Train train = new Train();
        train.setHoursDelayed(1);

        //WHEN
        String actual = train.customerSatisfaction();

        //THEN
        assertThat(actual).isEqualTo("Just another day at the train …");
    }

    @Test
    void given2HoursDelayed_whenCustomerSatisfaction_thenThisTrainIsAnnoyingMe() {
        //GIVEN
        Train train = new Train();
        train.setHoursDelayed(2);

        //WHEN
        String actual = train.customerSatisfaction();

        //THEN
        assertThat(actual).isEqualTo("This train is annoying me!");
    }

    @Test
    void given3HoursDelayed_whenCustomerSatisfaction_thenBuurnit() {
        //GIVEN
        Train train = new Train();
        train.setHoursDelayed(3);

        //WHEN
        String actual = train.customerSatisfaction();

        //THEN
        assertThat(actual).isEqualTo("B-u-u-urn it!");
    }

    @Test
    void givenMoreThan3HoursDelayed_whenCustomerSatisfaction_thenThrowExceptionTheWorldExplodes() {
        //GIVEN
        Train train = new Train();
        train.setHoursDelayed(4);

        //WHEN & THEN
        Assertions.assertThatThrownBy(() -> train.customerSatisfaction())
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The world explodes");
    }
}
