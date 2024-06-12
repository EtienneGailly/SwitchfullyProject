package advanced.solutions.codelab03.input;

public enum ListenerResponse {
    HIT("Hit!"),
    MISS("Miss!"),
    SHIP_DESTROYED("Ship destroyed"),
    WON("You have won the game");

    private String label;

    ListenerResponse(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
