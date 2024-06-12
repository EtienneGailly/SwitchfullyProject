package examples.code_example02_all_tests.domain;

import java.util.*;

public class UserRepository {

    private final Map<UUID, User> usersDB;

    public UserRepository() {
        usersDB = new HashMap<>();
    }

    public UserRepository(Map<UUID, User> usersDB) {
        this.usersDB = usersDB;
    }

    public void add(User user) {
        usersDB.put(user.getId(), user);
    }

    public User getForId(UUID userId) {
        return usersDB.get(userId);
    }

    public List<User> getAll() {
        return Collections.unmodifiableList(new ArrayList<>(usersDB.values()));
    }
}
