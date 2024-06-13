package switchfully.cucumber.steps;

public class User {
    private String displayName;
    private String email;
    private String password;
    private String repeatPassword;

    public User(String displayName, String email, String password) {
        this.displayName = displayName;
        this.email = email;
        this.password = password;
    }

    public User(String displayName, String email, String password, String repeatPassword) {
        this.displayName = displayName;
        this.email = email;
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    public String getRepeatPassword() {
        return repeatPassword;
    }
}
