package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RecursiveFunctionsCodelab02Test {

    @Test
    void negativeOrZeroNumber() {
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(-5)).isEqualTo(0);
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(0)).isEqualTo(0);
    }

    @Test
    void checkFibonacci() {
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(1)).isEqualTo(1);
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(2)).isEqualTo(1);
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(5)).isEqualTo(5);
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(8)).isEqualTo(21);
        Assertions.assertThat(RecursiveFunctionsCodelab02.fibonacci(20)).isEqualTo(6765);
    }
}
