package examples.code_example02_all_tests;


import examples.code_example02_all_tests.domain.User;
import examples.code_example02_all_tests.domain.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.add(user);
    }

    public User getUser(UUID userId) {
        return userRepository.getForId(userId);
    }

    public List<User> getUsersSortedOnNicknameAsc() {
        List<User> unsortedUsers = userRepository.getAll();
        return unsortedUsers.stream()
                .sorted(Comparator.comparing(User::getNickname))
                .collect(Collectors.toList());
    }
}
