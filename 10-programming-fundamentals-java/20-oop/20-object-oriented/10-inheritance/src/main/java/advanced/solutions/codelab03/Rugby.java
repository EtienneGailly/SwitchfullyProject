package advanced.solutions.codelab03;

public class Rugby extends Sport {
    public Rugby() {
        super("Rugby");
    }

    @Override
    public String getDescription() {
        return "You run away with a ball and other people try to stop you by ramming you.";
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
        return 3;
    }
}
