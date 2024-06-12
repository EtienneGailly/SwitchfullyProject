package basic.solutions.codelab03;

import java.util.ArrayDeque;
import java.util.Deque;

public class Shelf {

    private final Deque<Grocery> groceries;

    public Shelf() {
        groceries = new ArrayDeque<>();
    }

    public void addGrocery(Grocery grocery) {
        this.groceries.push(grocery);
    }

    public Grocery getFirstGrocery() {
        return this.groceries.pop();
    }
}
