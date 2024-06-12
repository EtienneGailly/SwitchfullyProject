package advanced.codelab01;

public enum BoardingPriority {

    FIRST_CLASS(2),
    BUSINESS(1),
    ECONOMY(0);

    private final int priorityLevel;

    BoardingPriority(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }
}
