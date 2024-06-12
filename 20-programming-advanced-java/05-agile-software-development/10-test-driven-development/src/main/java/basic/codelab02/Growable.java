package basic.codelab02;

public class Growable {
    private State state;

    public Growable(State state) {
        this.state = state;
    }

    public Growable() {
        this.state = State.Seed;
    }

    public void nextState() {
        this.state = state.nextState();
    }

    public State getState() {
        return state;
    }
}
