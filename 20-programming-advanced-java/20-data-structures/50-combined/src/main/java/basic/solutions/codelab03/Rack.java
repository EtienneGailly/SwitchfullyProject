package basic.solutions.codelab03;

import java.util.List;

public class Rack {

    private final List<Shelf> shelves;

    public Rack(List<Shelf> shelves) {
        this.shelves = shelves;
    }

    public int getAmountOfShelves() {
        return shelves.size();
    }

    public void fill(Grocery[] groceries, int indexOfShelf) {
        assertIndexOfShelfIsValid(indexOfShelf);
        for (Grocery grocery: groceries) {
            shelves.get(indexOfShelf).addGrocery(grocery);
        }
    }

    public Grocery takeGroceryFromShelf(int indexOfShelf) {
        assertIndexOfShelfIsValid(indexOfShelf);
        return shelves.get(indexOfShelf).getFirstGrocery();
    }

    private void assertIndexOfShelfIsValid(int indexOfShelf) {
        if(indexOfShelf < 0 || indexOfShelf >= getAmountOfShelves()) {
            throw new IllegalArgumentException("Invalid index of shelf:" + indexOfShelf
                    + " (current rack has " + getAmountOfShelves() + " shelves)");
        }
    }
}
