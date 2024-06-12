package advanced.solutions.codelab03;

public class Handball extends Sport {

    public Handball() {
        super("Handball");
    }

    @Override
    public String getDescription() {
        return "You throw a ball away and then run after it.";
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
        return 4;
    }
}
