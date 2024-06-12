package basic.solutions.codelab01;

import java.time.LocalDate;

public class Footballer implements Comparable<Footballer> {

    private final String name;
    private final LocalDate birthday;
    private final String shirtNumber;
    private final int numberOfGoalsScored;
    private final Position position;

    public Footballer(String name, LocalDate birthday, String shirtNumber, int numberOfGoalsScored, Position position) {
        this.name = name;
        this.birthday = birthday;
        this.shirtNumber = shirtNumber;
        this.numberOfGoalsScored = numberOfGoalsScored;
        this.position = position;
    }

    @Override
    public int compareTo(Footballer otherFootballer) {
        return birthday.compareTo(otherFootballer.birthday);
    }

    public int getShirtNumber() {
        try {
            return Integer.parseInt(shirtNumber);
        } catch (NumberFormatException e) {
            return Integer.MIN_VALUE;
        }
    }

    public Position getPosition() {
        return position;
    }

    public enum Position {
        GOALKEEPER(2),
        DEFENDER(1),
        MIDFIELDER(0),
        STRIKER(3);

        private final int rank;

        Position(int rank) {
            this.rank = rank;
        }

        public int getRank() {
            return rank;
        }

    }
}
