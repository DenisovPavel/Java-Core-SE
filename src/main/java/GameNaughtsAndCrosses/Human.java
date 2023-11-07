package GameNaughtsAndCrosses;

import java.util.Scanner;

/**
 * Human - класс представляющий игрока(Человека)
 *
 * @params humanTurn - ход человека;
 */
public class Human extends Field {
    static final char DOT_HUMAN = 'X';

    static Scanner scanner = new Scanner(System.in);


   public static void humanTurn() {
        int fieldSizeX = 0;
        int fieldSizeY = 0;
        GameChecks gameChecks = new GameChecks();
        do {
            System.out.print("PUT your X и Y\n(from  1 to 3) throw backspace >>> ");
            fieldSizeX = scanner.nextInt() - 1;
            fieldSizeY = scanner.nextInt() - 1;
        }
        while (!gameChecks.isCellValid(fieldSizeX, fieldSizeY) || !gameChecks.isCellEmpty(fieldSizeX, fieldSizeY));
        field[fieldSizeX][fieldSizeY] = DOT_HUMAN;

    }


}
