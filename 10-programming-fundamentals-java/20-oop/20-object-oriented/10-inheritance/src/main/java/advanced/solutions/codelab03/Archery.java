package advanced.solutions.codelab03;

public class Archery extends Sport {
    public Archery() {
        super("Archery");
    }

    @Override
    public String getDescription() {
        return "You try to hit a target with an arrow shot from a bow.";
    }

    @Override
    public boolean isTeamSport() {
        return false;
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
