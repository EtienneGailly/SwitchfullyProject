package advanced.codelab01.solutions;

public class ZorroSolution2 {

    public static void main(String[] args) {
        generateZ(4);
    }

    public static char[][] generateZ(int size) {
        char[][] result = create2DArray(size);
        print2DArray(result);
        return result;
    }

    private static char[][] create2DArray(int size) {
        char[][] result = new char[size][size];

        result[0] = createHeaderFooterLine(size);
        for (int i = 1; i < size - 1; i++) {
            result[i] = createMiddleLine(size, i);
        }
        result[size - 1] = createHeaderFooterLine(size);

        return result;
    }

    private static char[] createHeaderFooterLine(int size) {
        char[] headerFooter = new char[size];
        for (int i = 0; i < size; i++) {
            headerFooter[i] = '@';
        }
        return headerFooter;
    }

    private static char[] createMiddleLine(int size, int zIndex) {
        char[] line = new char[size];
        for (int j = 0; j < size; j++) {
            line[j] = ' ';
        }
        line[size - zIndex - 1] = '@';
        return line;
    }

    private static void print2DArray(char[][] result) {
        for (char[] line: result) {
            for (char element : line) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

}
