package basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LoopsCodelabs06Test {

    @Test
    void differentLength() {
        assertThat(LoopsCodelabs06.merge(new int[]{1}, new int[]{1, 2, 3})).isEmpty();
    }

    @Test
    void simpleMerge() {
        assertThat(LoopsCodelabs06.merge(new int[]{1, 2, 3}, new int[]{1, 2, 3})).contains(1, 1, 2, 2, 3, 3);
    }

    @Test
    void advancedMerge() {
        assertThat(LoopsCodelabs06.merge(new int[]{3, 5, 15, 236, 78, 45, 95}, new int[]{1, 2, 3, 4, 6, 8, -10}))
                .contains(3, 1, 5, 2, 15, 3, 236, 4, 78, 6, 45, 8, 95, -10);
    }
}
