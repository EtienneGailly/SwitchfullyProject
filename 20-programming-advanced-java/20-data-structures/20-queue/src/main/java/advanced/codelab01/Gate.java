package advanced.codelab01;

import java.util.PriorityQueue;
import java.util.Queue;

class Gate {

    private final Queue<Passenger> passengersToBoard;

    Gate() {
        this.passengersToBoard = new PriorityQueue<>();
    }

    /**
     * Add the passenger to the queue
     */
    void goStandInLineToBoard(Passenger passenger) {
        // implement me
    }

    /**
     * Take the 'next-in-line' passenger and return it (make sure it's no longer part of the queue)
     * @return the passenger that may board
     */
    Passenger letNextPassengerBoard() {
        // implement me
        return null;
    }
}
