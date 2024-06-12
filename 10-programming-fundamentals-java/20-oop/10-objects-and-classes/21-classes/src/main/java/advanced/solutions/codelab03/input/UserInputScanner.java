package advanced.solutions.codelab03.input;


import advanced.solutions.codelab03.game.Coordinate;

import java.util.Scanner;
import java.util.regex.Pattern;

import static advanced.solutions.codelab03.game.Coordinate.coordinate;
import static advanced.solutions.codelab03.input.ListenerResponse.WON;

public class UserInputScanner {

    private final InputListener inputListener;

    public UserInputScanner(InputListener inputListener) {
        this.inputListener = inputListener;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(inputListener);
            System.out.print(">");
            String input = scanner.nextLine();
            if (isCorrectCoordinate(input)) {
                ListenerResponse result = inputListener.listenToInput(toCoordinate(input));
                System.out.println(result);
                if(result == WON){
                    break;
                }
            } else {
                System.out.println("Could not understand " + input);
            }
        }
        System.out.println(inputListener);
    }

    static Coordinate toCoordinate(String input) {
        if (!isCorrectCoordinate(input)) {
            throw new RuntimeException("Should have called isCorrectCoordinate");
        }
        String[] coordinates = input.split(",");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);
        return coordinate(x, y);
    }

    private static boolean isCorrectCoordinate(String input) {
        return Pattern.matches("[0-9]+,[0-9]+", input);
    }
}
