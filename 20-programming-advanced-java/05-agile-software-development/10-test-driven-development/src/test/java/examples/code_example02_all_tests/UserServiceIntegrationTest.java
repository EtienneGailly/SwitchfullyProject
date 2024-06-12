package examples.code_example02_all_tests;

import examples.code_example02_all_tests.domain.User;
import examples.code_example02_all_tests.domain.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * An integration test: testing the integration of the UserService and the UserRepository.
 * If one of the two is broken, tests will fail!
 */
class UserServiceIntegrationTest {

    @Test
    void addUser_happyPath() {
        UserRepository userRepository = new UserRepository();
        User userToAdd = new User("Timmy");

        UserService userService = new UserService(userRepository);
        userService.addUser(userToAdd);

        Assertions.assertThat(userRepository.getForId(userToAdd.getId()))
                .isNotNull();
    }

    @Test
    void getUser_happyPath() {
        UserRepository userRepository = new UserRepository();
        User addedUser = new User("Tinckles");
        userRepository.add(addedUser);

        UserService userService = new UserService(userRepository);
        User actualUser = userService.getUser(addedUser.getId());

        Assertions.assertThat(actualUser).isEqualTo(addedUser);
    }

    @Test
    void getUsersSortedOnNicknameAsc_happyPath() {
        UserRepository userRepository = new UserRepository();
        User addedUser1 = new User("Binckles");
        User addedUser2 = new User("Atinckles");
        User addedUser3 = new User("Crinckles");
        userRepository.add(addedUser1);
        userRepository.add(addedUser2);
        userRepository.add(addedUser3);

        UserService userService = new UserService(userRepository);
        List<User> sortedUsers = userService.getUsersSortedOnNicknameAsc();

        Assertions.assertThat(sortedUsers)
                .containsExactly(addedUser2, addedUser1, addedUser3);
    }

}
