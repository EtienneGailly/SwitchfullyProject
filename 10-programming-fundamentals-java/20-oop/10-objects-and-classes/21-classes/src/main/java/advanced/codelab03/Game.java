package advanced.codelab03;

public class Game {
    private static final int GRID_WIDTH = 10;
    private static final int GRID_HEIGHT = 10;

    public static void main(String[] args) {
        Grid grid = new Grid(GRID_WIDTH, GRID_HEIGHT);
        grid.createEmptyGridAllowedPositions();
        Ship carrier = new Ship("Carrier");
        Ship battleship = new Ship("Battleship");
        Ship destroyer = new Ship("Destroyer");
        Ship submarine = new Ship("Submarine");
        Ship patrolBoat = new Ship("Patrol Boat");
        grid.setShipList(new Ship[] {carrier, battleship, destroyer, submarine, patrolBoat});
        for (Ship ship : grid.getShipList()){
            grid.generateRandomShipPosition(ship);
            //grid.assignGivenShipPosition(ship, 2, 2, false);
            grid.addForbiddenPositions(ship);
        }
        grid.populateGrid();
        grid.printGrid();
        System.out.println("------------------------");
        grid.printAllowedPositionsGrid();
    }
}
