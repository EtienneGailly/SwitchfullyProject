package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LoopsCodelabs09Test {

    @Test
    void negativeOrZeroNumber() {
        Assertions.assertThat(LoopsCodelabs09.fibonacci(-5)).isEqualTo(0);
        Assertions.assertThat(LoopsCodelabs09.fibonacci(0)).isEqualTo(0);
    }

    @Test
    void checkFibonacci() {
        Assertions.assertThat(LoopsCodelabs09.fibonacci(1)).isEqualTo(1);
        Assertions.assertThat(LoopsCodelabs09.fibonacci(2)).isEqualTo(1);
        Assertions.assertThat(LoopsCodelabs09.fibonacci(5)).isEqualTo(5);
        Assertions.assertThat(LoopsCodelabs09.fibonacci(8)).isEqualTo(21);
        Assertions.assertThat(LoopsCodelabs09.fibonacci(20)).isEqualTo(6765);
    }
}
