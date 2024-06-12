package advanced.solutions.codelab03;

public class Sport {

    private String name;

    public Sport(String name) {
        this.name = name;
    }

    public String getSelectionStatement() {
        return "You have selected " + name;
    }

    public String getDescription() {
        return null;
    }

    public boolean isTeamSport() {
        return false;
    }

    public boolean hasBall() {
        return false;
    }

    public int getPopularity() {
        return 0;
    }
}
