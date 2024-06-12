package advanced.solutions.codelab02;

public class Moderator extends Member {

    private boolean isTrusted;

    public Moderator(String username, boolean isTrusted) {
        super(username);
        this.isTrusted = isTrusted;
    }

    @Override
    protected String getGreeting() {
        if (isTrusted) {
            return "Sup mod {username}!? T";
        }
        return super.getGreeting();
    }
}
