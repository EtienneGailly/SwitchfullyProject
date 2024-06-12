package advanced.additionaltopic01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Just an example using a LinkedList
 */
public class LinkedListExample {

    public static void main(String[] args) {
        linkedListAsList();
        linkedListAsDeque();
    }

    private static void linkedListAsDeque() {
        Deque<String> linkedList = new LinkedList<>();

        // FIFO
        linkedList.add("Hello");
        linkedList.add("There");
        linkedList.add("You!");

        // First element that was added is retrieved and removed
        String removedLastElement = linkedList.poll();

        System.out.println("Should be Hello: " + removedLastElement);
    }

    private static void linkedListAsList() {
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Hello");
        linkedList.add("There");
        linkedList.add("You!");

        linkedList.addAll(List.of("Some", "More", "Objects"));

        String shouldBeMore = linkedList.get(4);

        System.out.println("is More? " + shouldBeMore);

        linkedList.add(4, "AddedWord");

        String shouldBeAddedWord = linkedList.get(4);

        System.out.println("is AddedWord? " + shouldBeAddedWord);
    }

}
