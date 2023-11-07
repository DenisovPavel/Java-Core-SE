package GameNaughtsAndCrosses;

/**
 * Field - игровое поле;
 *
 * @params initField - создание поля;
 * @params printField - печать поля в консоль;
 */
public class Field {
    static int fieldSizeX;
    static int fieldSizeY;
    static char[][] field;
    static final char DOT_EMPTY = '*';

    public Field(int fieldSizeX, int fieldSizeY) {
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
    }
    Field() {
    }
    public static void initField(int fieldSizeX, int fieldSizeY) {
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }
    public static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX; i++) {
            System.out.print("-" + (i + 1));
        }
        System.out.println("-");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print((y + 1) + "|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < fieldSizeX * 2 + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

