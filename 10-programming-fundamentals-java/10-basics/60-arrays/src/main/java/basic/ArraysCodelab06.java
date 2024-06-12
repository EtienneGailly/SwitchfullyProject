package basic;

public class ArraysCodelab06 {


    /**
     * We're developing a scoreboard that will show the winner and the loser of a running competition.
     * As an input we get the standings after the run.
     * The standings are ordered from best to worst.
     *
     * You need to develop 2 methods. The first will show who has won. The other method will show who has lost.
     *
     * Keep in mind the edge cases. Your app shouldn't break when you get an unexpected input!
     */
    public static void main(String[] args) {
        String[] standings = {
                "Bob",
                "Marc",
                "Stephen",
                "Louis",
                "Kurt",
                "Bert",
                "Patrick",
                "Michal",
                "Carl",
                "John"
        };
        System.out.println(getWinner(standings));
        System.out.println(getLoser(standings));
    }

    public static String getWinner(String[] standings) {
        if (standings.length == 0) {
            return null;
        }
        else {
            return standings[0];
        }
    }

    public static String getLoser(String[] standings) {
        if (standings.length == 0) {
            return null;
        }
        else {
            return standings[standings.length-1];
        }
    }
}
