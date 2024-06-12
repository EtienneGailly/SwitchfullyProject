package examples.code_example02_all_tests.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * A simple Unit Test that doesn't have any dependencies on other classes.
 * Therefore, we don't have to mock anything
 */
class UserTest {

    @Test
    void getNicknameToUppercase_happyPath() {
        // GIVEN
        User user = new User("the real MVP");

        // WHEN
        String nicknameToUppercase = user.getNicknameToUppercase();

        // THEN
        Assertions.assertThat(nicknameToUppercase).isEqualTo("THE REAL MVP");
    }

    @Test
    void getNicknameToUppercase_givenNoNickname_thenReturnNOPE() {
        // GIVEN
        User user = new User(null);

        // WHEN
        String nicknameToUppercase = user.getNicknameToUppercase();

        // THEN
        Assertions.assertThat(nicknameToUppercase).isEqualTo("NOPE");
    }

}
