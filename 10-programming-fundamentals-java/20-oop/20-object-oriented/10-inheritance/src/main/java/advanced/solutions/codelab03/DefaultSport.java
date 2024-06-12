package advanced.solutions.codelab03;

public class DefaultSport extends Sport {

    public DefaultSport(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Unknown sport";
    }

    @Override
    public boolean isTeamSport() {
        return true;
    }

    @Override
    public boolean hasBall() {
        return false;
    }

    @Override
    public int getPopularity() {
        return 3;
    }
}
