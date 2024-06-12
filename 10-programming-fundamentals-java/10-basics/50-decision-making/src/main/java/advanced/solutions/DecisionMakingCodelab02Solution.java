package advanced.solutions;

public class DecisionMakingCodelab02Solution {

    public static void main(String[] args) {
        printOutSport("Hockey");
        System.out.println("*******************");
        printOutSport("Football");
        System.out.println("*******************");
        printOutSport("Tennis");
        System.out.println("*******************");
    }

    /**
     * Convert this switch statement to multiple switch expressions
     */
    private static void printOutSport(String sport) {
        System.out.println("You have selected " + sport);
        System.out.println("Description: " + getDescription(sport));
        System.out.println("Popularity: " + getPopularity(sport));
        System.out.println("This sport is " + (hasBall(sport) ? "" : " not ") + "played with a ball");
        System.out.println("This sport is " + (isTeamSport(sport) ? "" : " not ") + "a team sport");
    }

    private static boolean isTeamSport(String sport) {
        return switch (sport) {
            case "Football", "Hockey", "Rugby", "Handball" -> true;
            default -> false;
        };
    }

    private static boolean hasBall(String sport) {
        return switch (sport) {
            case "Football", "Hockey", "Rugby", "Tennis", "Handball" -> true;
            default -> false;
        };
    }

    private static String getDescription(String sport) {
        return switch (sport) {
            case "Football" -> "You kick a ball away and then run after it.";
            case "Hockey" -> "You kick a ball away with a stick and then run after it.";
            case "Rugby" -> "You run away with a ball and other people try to stop you by ramming you.";
            case "Archery" -> "You try to hit a target with an arrow shot from a bow.";
            case "Tennis" -> "You hit a ball with a racket over a net, in the hope that the guy on the other side of the net can't do the same.";
            case "Handball" -> "You throw a ball away and then run after it.";
            default -> "Unknown sport";
        };
    }

    private static int getPopularity(String sport) {
        return switch (sport) {
            case "Football" -> 1;
            case "Hockey", "Tennis" -> 2;
            case "Archery", "Handball" -> 4;
            default -> 3;
        };
    }
}
