package advanced.solutions.codelab02;

import java.time.LocalDate;

public class Member {
    private String username;
    private LocalDate lastSignedInOn;

    public Member(String username) {
        this.username = username;
        this.lastSignedInOn = LocalDate.now();
    }

    public String signIn() {
        String result = getGreeting() + "he last time you signed in was " + lastSignedInOn;
        lastSignedInOn = LocalDate.now();
        return result;
    }

    protected String getGreeting() {
        return "Welcome " + username + ", t";
    }

}
