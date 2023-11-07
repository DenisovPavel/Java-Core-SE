package GameNaughtsAndCrosses;
import java.util.Random;

/**
 * AI - класс представляющий игрока(Компьютер)
 *
 * @params aiTurn - ход Компьютера;
 */
public class AI extends Field {
    static Random random = new Random();
   public static final char DOT_AI = '0';

 static void aiTurn() {
        int x = 0;
        int y = 0;
        GameChecks gameChecks = new GameChecks();
        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        }
        while (!gameChecks.isCellEmpty(x, y));
        field[y][x] = DOT_AI;
    }
}
