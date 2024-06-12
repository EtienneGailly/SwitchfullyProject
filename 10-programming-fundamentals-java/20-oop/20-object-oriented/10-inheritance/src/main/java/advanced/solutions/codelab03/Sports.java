package advanced.solutions.codelab03;

public class Sports {

    public static void main(String[] args) {
        printOutSport("Hockey");
        System.out.println("*******************");
        printOutSport("Football");
        System.out.println("*******************");
        printOutSport("Tennis");
        System.out.println("*******************");
    }

    /**
     * Remember this exercise from decision-making?
     * Instead of splitting this up into smaller switch case rewrite the following code using inheritance.
     * Put every sport specific information in their appropriate subclass
     *
     * Hint: You'll need one switch case that will convert the parameter sport into a subclass.
     */
    public static void printOutSport(String sport) {
        Sport aSport = mapToSport(sport);
        System.out.println(aSport.getSelectionStatement());
        System.out.println("Description: " + aSport.getDescription());
        System.out.println("Popularity: " + aSport.getPopularity());
        System.out.println("This sport is " + (aSport.hasBall() ? "" : "not ") + "played with a ball");
        System.out.println("This sport is " + (aSport.isTeamSport() ? "" : "not ") + "a team sport");
    }

    private static Sport mapToSport(String sport) {
        return switch (sport) {
            case "Football" -> new Football();
            case "Hockey" -> new Hockey();
            case "Rugby" -> new Rugby();
            case "Archery" -> new Archery();
            case "Tennis" -> new Tennis();
            case "Handball" -> new Handball();
            default -> new DefaultSport(sport);
        };
    }

}
