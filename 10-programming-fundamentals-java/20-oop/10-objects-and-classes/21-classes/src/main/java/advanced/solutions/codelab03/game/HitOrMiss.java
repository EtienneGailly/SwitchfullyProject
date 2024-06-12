package advanced.solutions.codelab03.game;

public enum HitOrMiss {
    HIT("H", "Hit!"),
    MISS("X", "Miss!");

    private String symbol;
    private String label;

    HitOrMiss(String symbol, String label) {
        this.symbol = symbol;
        this.label = label;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return label;
    }
}
