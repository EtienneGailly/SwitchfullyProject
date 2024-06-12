package basic.solutions.codelab01.comparators;



import basic.solutions.codelab01.Footballer;

import java.util.Comparator;

public class FootballerPositionComparator implements Comparator<Footballer> {

    @Override
    public int compare(Footballer footballer, Footballer otherFootballer) {
        return footballer.getPosition().getRank() - otherFootballer.getPosition().getRank();
    }
}
