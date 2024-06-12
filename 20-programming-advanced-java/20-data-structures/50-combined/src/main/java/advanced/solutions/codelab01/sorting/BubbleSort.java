package advanced.solutions.codelab01.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements SortingAlgorithm {

    @Override
    public List<Integer> sort(List<Integer> listToSort) {
        List<Integer> result = new ArrayList<>(listToSort);
        for (int iteration = 0; iteration < result.size(); iteration++) {
            boolean swapped = false;
            for (int index = 0; index < result.size() - 1; index++) {
                if (result.get(index) > result.get(index + 1)) {
                    swap(result, index);
                    swapped = true;
                }
            }
            if(!swapped) {
                return result;
            }
        }
        return result;
    }

    private static void swap(List<Integer> result, int index) {
        int swap = result.get(index);
        result.set(index, result.get(index + 1));
        result.set(index + 1, swap);
    }

}
