package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArraysCodelab07Test {

    private int[] database;

    @BeforeEach
    void setUp() {
        database = new int[20];
    }

    @Nested
    @DisplayName("first shop")
    class FirstShop {

        @Test
        void youCanSavePointsInTheDatabase() {
            ArraysCodelab07.increasePointsFromCustomerInFirstShop(2, 5, database);
            ArraysCodelab07.increasePointsFromCustomerInFirstShop(2, 3, database);

            Assertions.assertThat(database[1]).isEqualTo(8);
        }

        @Test
        void youCanSavePointsInTheDatabaseWillDoNothingIfIndexIsOutOfBounds() {
            ArraysCodelab07.increasePointsFromCustomerInFirstShop(-1, 5, database);
            ArraysCodelab07.increasePointsFromCustomerInFirstShop(11, 5, database);

            Assertions.assertThat(database).containsExactly(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        }

        @Test
        void youCanGetPointsFromTheDatabase() {
            database[1] = 3;

            Assertions.assertThat(ArraysCodelab07.getPointsFromCustomerInFirstShop(2, database)).isEqualTo(3);
        }

        @Test
        void youCanGetPointsWillReturn0WhenIndexIsOutOfBounds() {
            Assertions.assertThat(ArraysCodelab07.getPointsFromCustomerInFirstShop(-1, database)).isEqualTo(0);
            Assertions.assertThat(ArraysCodelab07.getPointsFromCustomerInFirstShop(10, database)).isEqualTo(0);
        }
    }

    @Nested
    @DisplayName("second shop")
    class SecondShop {

        @Test
        void youCanSavePointsInTheDatabase() {
            ArraysCodelab07.increasePointsFromCustomerInSecondShop(2, 5, database);
            ArraysCodelab07.increasePointsFromCustomerInSecondShop(2, 3, database);

            Assertions.assertThat(database[11]).isEqualTo(8);
        }

        @Test
        void youCanSavePointsInTheDatabaseWillDoNothingIfIndexIsOutOfBounds() {
            ArraysCodelab07.increasePointsFromCustomerInSecondShop(-1, 5, database);
            ArraysCodelab07.increasePointsFromCustomerInSecondShop(11, 5, database);

            Assertions.assertThat(database).containsExactly(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
        }

        @Test
        void youCanGetPointsFromTheDatabase() {
            database[11] = 3;

            Assertions.assertThat(ArraysCodelab07.getPointsFromCustomerInSecondShop(2, database)).isEqualTo(3);
        }

        @Test
        void youCanGetPointsWillReturn0WhenIndexIsOutOfBounds() {
            Assertions.assertThat(ArraysCodelab07.getPointsFromCustomerInSecondShop(-1, database)).isEqualTo(0);
            Assertions.assertThat(ArraysCodelab07.getPointsFromCustomerInSecondShop(10, database)).isEqualTo(0);
        }
    }
}
