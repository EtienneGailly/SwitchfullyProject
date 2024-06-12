package basic.codelab01;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrainTest {

    @Nested
    @DisplayName("when creating a train")
    class CreateTrain {
        @Test
        void createTrain() {
            Train train = new Train();

            int hoursDelayed = train.getHoursDelayed();

            Assertions.assertThat(hoursDelayed).isEqualTo(0);
        }

        @Test
        void givenExistingTrain_whenSettingNegativeHoursDelayed_thenSetToZero() {
            //GIVEN
            Train train = new Train();
            //WHEN
            train.setHoursDelayed(-1);
            //THEN
            Assertions.assertThat(train.getHoursDelayed()).isEqualTo(0);
        }
    }



    @Nested
    @DisplayName("when calling customerSatisfaction")
    class CustomerSatisfaction {
        Train train;
        @BeforeEach
        void setUp() {
            train = new Train();
        }

        @ParameterizedTest(name = "given hoursdelayed is {0}, then message is {1}")
        @CsvSource({
                "0,Nice ‘n’ rolling!",
                "1,Just another day at the train …",
                "2,This train is annoying me!",
                "3,B-u-u-urn it!"
        })
        void customerSatisfaction(int hoursDelayed, String message) {
            train.setHoursDelayed(hoursDelayed);

            String customerSatisfaction = train.customerSatisfaction();

            Assertions.assertThat(customerSatisfaction).isEqualTo(message);
        }

        @Test
        void givenHoursdelayedIs5_thenThrowsException() {
            //GIVEN
            train.setHoursDelayed(5);

            //WHEN & THEN
            Assertions.assertThatThrownBy(() -> train.customerSatisfaction())
                    .hasMessage("Invalid hours delayed!")
                    .isInstanceOf(IllegalArgumentException.class);
        }
    }



}
