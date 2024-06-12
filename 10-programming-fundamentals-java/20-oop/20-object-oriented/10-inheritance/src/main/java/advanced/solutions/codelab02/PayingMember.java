package advanced.solutions.codelab02;

public class PayingMember extends Member {

    public PayingMember(String username) {
        super(username);
    }

    @Override
    protected String getGreeting() {
        return "Dear honorary {username}, welcome! T";
    }
}
