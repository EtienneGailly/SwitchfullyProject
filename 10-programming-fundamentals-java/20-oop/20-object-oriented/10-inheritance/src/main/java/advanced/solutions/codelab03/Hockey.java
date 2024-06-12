package advanced.solutions.codelab03;

public class Hockey extends Sport {
    public Hockey() {
        super("Hockey");
    }

    @Override
    public String getDescription() {
        return "You kick a ball away with a stick and then run after it.";
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
        return 2;
    }
}
