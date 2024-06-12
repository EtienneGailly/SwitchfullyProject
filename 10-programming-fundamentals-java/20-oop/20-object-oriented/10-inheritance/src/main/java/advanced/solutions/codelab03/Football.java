package advanced.solutions.codelab03;

public class Football extends Sport {

    public Football() {
        super("Football");
    }

    @Override
    public String getDescription() {
        return "You have selected Football";
    }

    @Override
    public boolean isTeamSport() {
        return true;
    }

    @Override
    public boolean hasBall() {
        return true;
    }

    @Override
    public int getPopularity() {
        return 1;
    }
}
