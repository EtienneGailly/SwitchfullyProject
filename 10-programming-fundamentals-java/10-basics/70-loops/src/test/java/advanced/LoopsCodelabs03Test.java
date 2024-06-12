package advanced;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
 * there exists a 'y' char somewhere later in the string.
 * So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
 * Return true if the given string is xy-balanced.
 *      xyBalance("aaxbby") → true
 *      xyBalance("aaxbb") → false
 *      xyBalance("yaaxbb") → false
 *      xyBalance("xxxxxxsqy") → true
 *      xyBalance("xyxyxyx") → false
 *      xyBalance("") → true
 */
public class LoopsCodelabs03Test {

    @Test
    public void xyBalance() throws Exception {
        Assertions.assertThat(LoopsCodelabs03.xyBalance("aaxbby")).isTrue();
        Assertions.assertThat(LoopsCodelabs03.xyBalance("aaxbb")).isFalse();
        Assertions.assertThat(LoopsCodelabs03.xyBalance("yaaxbb")).isFalse();
        Assertions.assertThat(LoopsCodelabs03.xyBalance("xxxxxxsqy")).isTrue();
        Assertions.assertThat(LoopsCodelabs03.xyBalance("xyxyxyx")).isFalse();
    }

    @Test
    public void xyBalance_givenEmptyString_thenReturnTrue() throws Exception {
        Assertions.assertThat(LoopsCodelabs03.xyBalance("")).isTrue();
    }

}
