package advanced.solutions.codelab03;

public class Tennis extends Sport {
    public Tennis() {
        super("Tennis");
    }

    @Override
    public String getDescription() {
        return "You hit a ball with a racket over a net, in the hope that the guy on the other side of the net can't do the same.";
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
        return 2;
    }
}
