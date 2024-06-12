package advanced.codelab03;

import java.util.Arrays;
import java.util.Random;

public class Grid {
    private final int WIDTH;
    private final int HEIGHT;
    private final int NUMBER_OF_SHIPS = 5;
    private Ship[] shipList = new Ship[NUMBER_OF_SHIPS];
    private char[][] gridDisplay;
    private boolean[][] gridAllowedPositions;
    Random rand = new Random();

    public Grid(int width, int height) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.gridDisplay = createEmptyGrid();
    }

    public void generateRandomShipPosition(Ship ship) {
        int loopCounter = 0;
        boolean horizontality = rand.nextBoolean();
        int randomSignificantX = 0;
        int randomSignificantY = 0;
        do {
            if (horizontality) {
                randomSignificantX = rand.nextInt(WIDTH - ship.getLength());
                randomSignificantY = rand.nextInt(HEIGHT);
            }
            else {
                randomSignificantX = rand.nextInt(WIDTH);
                randomSignificantY = rand.nextInt(HEIGHT - ship.getLength());
            }
            ship.setHorizontality(horizontality);
            ship.setSignificantXCoordinate(randomSignificantX);
            ship.setSignificantYCoordinate(randomSignificantY);
            ship.buildPositions();
            loopCounter++;
        }
        while (!checkIfPositionIsAllowed(ship, gridAllowedPositions));
        System.out.println(loopCounter);
    }

    public void assignGivenShipPosition(Ship ship, int significantX, int significantY, boolean horizontality) {
        ship.setSignificantXCoordinate(significantX);
        ship.setSignificantYCoordinate(significantY);
        ship.setHorizontality(horizontality);
        ship.buildPositions();
    }

    public void setShipList(Ship[] shipList) {
        this.shipList = shipList;
    }

    public Ship[] getShipList() {
        return shipList;
    }

    public char[][] createEmptyGrid() {
        char[][] grid = new char[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                grid[i][j] = 'o';
            }
        }
        return grid;
    }

    public void createEmptyGridAllowedPositions() {
        boolean[][] gridAllowedPositions = new boolean[HEIGHT][WIDTH];
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                gridAllowedPositions[i][j] = true;
            }
        }
        this.gridAllowedPositions = gridAllowedPositions;
    }

    public void populateGrid() {
        for (Ship ship : shipList) {
            for (int[] position : ship.getPositions()) {
                gridDisplay[position[1]][position[0]] = 'x';
            }
        }
    }

    public void printGrid() {
        for (int j = 0; j < HEIGHT; j++) {
            for (int i = 0; i < WIDTH; i++) {
                System.out.print(gridDisplay[j][i]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void printAllowedPositionsGrid() {
        for (int j = 0; j < HEIGHT; j++) {
            for (int i = 0; i < WIDTH; i++) {
                if (gridAllowedPositions[j][i]) {
                    System.out.print('o');
                }
                else {
                    System.out.print('x');
                }
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public boolean checkIfPositionIsAllowed(Ship ship, boolean[][] gridAllowedPositions) {
        int[][] positions = ship.getPositions();
        for (int[] position : positions) {
            if (!gridAllowedPositions[position[1]][position[0]]) {
                return false;
            }
        }
        return true;
    }

    public void addForbiddenPositions(Ship ship) {
        if (ship.isHorizontal()) {
            buildForbiddenPositionsHorizontal(ship);
        }
        if (!ship.isHorizontal()) {
            buildForbiddenPositionsVertical(ship);
        }
    }

    public void buildForbiddenPositionsHorizontal(Ship ship) {
        int[][] positions = ship.getPositions();
        if (positions[0][0] >= 1){
            gridAllowedPositions[positions[0][1]][positions[0][0]-1] = false;
        }
        for (int[] position : positions) {
            gridAllowedPositions[position[1]][position[0]] = false;
            if (positions[0][1] != 0) {
                gridAllowedPositions[position[1] - 1][position[0]] = false;
            }
            if (positions[0][1] != HEIGHT - 1) {
                gridAllowedPositions[position[1] + 1][position[0]] = false;
            }
        }
        if (positions[positions.length-1][0] < WIDTH - 1){
            gridAllowedPositions[positions[0][1]][positions[positions.length-1][0]+1] = false;
        }
    }

    public void buildForbiddenPositionsVertical(Ship ship) {
        int[][] positions = ship.getPositions();
        if (positions[0][1] >= 1){
            gridAllowedPositions[positions[0][1]-1][positions[0][0]] = false;
        }
        for (int[] position : positions) {
            gridAllowedPositions[position[1]][position[0]] = false;
            if (positions[0][0] != 0) {
                gridAllowedPositions[position[1]][position[0] - 1] = false;
            }
            if (positions[0][0] != WIDTH - 1) {
                gridAllowedPositions[position[1]][position[0] + 1] = false;
            }
        }
        if (positions[positions.length-1][1] < HEIGHT - 1){
            gridAllowedPositions[positions[positions.length-1][1]+1][positions[0][0]] = false;
        }
    }

}
