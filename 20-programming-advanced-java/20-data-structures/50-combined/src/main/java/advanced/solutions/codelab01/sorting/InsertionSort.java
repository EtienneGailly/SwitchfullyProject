package advanced.solutions.codelab01.sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements SortingAlgorithm {

    @Override
    public List<Integer> sort(List<Integer> listToSort) {
        List<Integer> result = new ArrayList<>(listToSort);
        for (int index = 0; index < result.size(); index++) {
            Integer valueToInsert = result.get(index);
            int insertionSpot = shiftToTheRightUntilYouFindInsertionSpot(result, index, valueToInsert);
            result.set(insertionSpot, valueToInsert);

        }
        return result;
    }

    private static int shiftToTheRightUntilYouFindInsertionSpot(List<Integer> result, int index, Integer valueToInsert) {
        int insertionSpot = index;
        for (; insertionSpot > 0 && result.get(insertionSpot - 1) > valueToInsert; insertionSpot--) {
            result.set(insertionSpot, result.get(insertionSpot - 1));
        }
        return insertionSpot;
    }

}
