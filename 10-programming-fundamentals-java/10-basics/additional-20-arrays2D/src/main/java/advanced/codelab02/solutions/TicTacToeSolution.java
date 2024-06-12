package advanced.codelab02.solutions;

public class TicTacToeSolution {

    public static void checkWin(char[][] chars) {
        char[][] linesToCheck = getAllLinesToCheck(chars);
        for (char[] line : linesToCheck) {
            if (isAWin(line)) {
                System.out.println(String.format("Player %s has won the game.", line[0]));
                return;
            }
        }
        System.out.println("No one has won the game.");
    }

    private static char[][] getAllLinesToCheck(char[][] chars) {
        int index = 0;
        char[][] linesToCheck = new char[chars.length * 2 + 2][];

        for (char[] row : chars) {
            linesToCheck[index++] = row;
        }

        for (int i = 0; i < chars.length; i++) {
            char[] column = new char[chars.length];
            for (int j = 0; j < chars.length; j++) {
                column[j] = chars[j][i];
            }
            linesToCheck[index++] = column;
        }

        char[] cross = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            cross[i] = chars[i][i];
        }
        linesToCheck[index++] = cross;

        char[] mirroredCross = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            mirroredCross[i] = chars[i][chars.length - i - 1];
        }
        linesToCheck[index] = mirroredCross;
        return linesToCheck;
    }

    private static boolean isAWin(char[] line) {
        char previous = line[0];
        for (char character : line) {
            if (character != previous) {
                return false;
            }
        }
        return true;
    }

}
