package advanced.codelab01.solutions;

public class ZorroSolution {

    public static char[][] generateZ(int size) {
        char[][] result = new char[size][size];

        char[] headerFooter = new char[size];
        for (int i = 0; i < size; i++) {
            headerFooter[i] = '@';
        }
        result[0] = headerFooter;
        result[size - 1] = headerFooter;

        for (int i = 1; i < size - 1; i++) {
            char[] line = new char[size];
            for (int j = 0; j < size; j++) {
                line[j] = ' ';
            }
            line[size - i - 1] = '@';
            result[i] = line;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
        return result;
    }

}
