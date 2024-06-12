package examples.code_example01_unit_test;

import java.util.Objects;
import java.util.UUID;

public class User {

    private final UUID id;
    private final String nickname;

    public User(String nickname) {
        this.id = UUID.randomUUID();
        this.nickname = nickname;
    }

    public UUID getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNicknameToUppercase() {
        if(nickname != null) {
            return nickname.toUpperCase();
        } return "NOPE";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
