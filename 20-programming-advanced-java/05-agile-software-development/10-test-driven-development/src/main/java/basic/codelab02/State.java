package basic.codelab02;

public enum State {
    Seed, Sprout, Plant, Tree;

    public State nextState() {
        return switch (this) {
            case Seed -> Sprout;
            case Sprout -> Plant;
            case Plant -> Tree;
            case Tree -> Tree;
        };
    }
}
