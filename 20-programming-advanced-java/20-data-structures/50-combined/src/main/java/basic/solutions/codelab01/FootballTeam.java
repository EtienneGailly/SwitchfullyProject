package basic.solutions.codelab01;

import basic.solutions.codelab01.comparators.FootballerPositionComparator;
import basic.solutions.codelab01.comparators.FootballerShirtNumberAscComparator;

import java.util.Collections;
import java.util.List;

public class FootballTeam {

    private static final int MAX_ALLOWED_AMOUNT_OF_FOOTBALLERS = 11;

    private final List<Footballer> footballers;

    public FootballTeam(List<Footballer> footballers) {
        if(footballers.size() > MAX_ALLOWED_AMOUNT_OF_FOOTBALLERS) {
            throw new IllegalArgumentException("The provided list of footballers can not be higher than "
                    + MAX_ALLOWED_AMOUNT_OF_FOOTBALLERS);
        }
        this.footballers = footballers;
    }

    public List<Footballer> getFootballers() {
        return Collections.unmodifiableList(footballers);
    }

    public void sortByBirthdayDescending() {
        Collections.sort(footballers);
    }

    public void sortByShirtNumberAscending() {
        footballers.sort(new FootballerShirtNumberAscComparator());
    }

    public void sortByPosition() {
        footballers.sort(new FootballerPositionComparator());
    }


}
