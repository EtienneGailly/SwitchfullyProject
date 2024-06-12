package examples.code_example01_unit_test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
