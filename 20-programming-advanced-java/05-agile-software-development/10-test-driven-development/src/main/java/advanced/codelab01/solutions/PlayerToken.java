package advanced.codelab01.solutions;

public enum PlayerToken {
    PLAYER_1("x"),
    PLAYER_2("o");

    // The field token and the toString() are not necessary, but help for debugging.
    private String token;

    PlayerToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token;
    }
}
