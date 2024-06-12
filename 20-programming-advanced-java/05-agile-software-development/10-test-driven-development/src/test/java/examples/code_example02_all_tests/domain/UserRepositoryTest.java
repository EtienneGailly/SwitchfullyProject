package examples.code_example02_all_tests.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * A simple Unit Test that doesn't have any dependencies on other classes.
 * Therefore, we don't have to mock anything
 */
class UserRepositoryTest {

    @Test
    void getForId_happyPath() {
        UserRepository userRepository = new UserRepository();
        User expectedUser = new User("testy");
        userRepository.add(expectedUser);

        User actualUser = userRepository.getForId(expectedUser.getId());

        Assertions.assertThat(actualUser).isEqualTo(expectedUser);
    }

    @Test
    void getAll_happyPath() {
        UserRepository userRepository = new UserRepository();
        User expectedUser1 = new User("testy1");
        User expectedUser2 = new User("testy2");
        userRepository.add(expectedUser1);
        userRepository.add(expectedUser2);

        List<User> allUsers = userRepository.getAll();

        Assertions.assertThat(allUsers).containsExactlyInAnyOrder(expectedUser1, expectedUser2);
    }

}
