package advanced.solutions.codelab03.input;


import advanced.solutions.codelab03.game.Coordinate;

public interface InputListener {
    ListenerResponse listenToInput(Coordinate coordinate);
}
