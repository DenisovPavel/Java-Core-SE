package GameNaughtsAndCrosses;

import java.util.Scanner;
import static GameNaughtsAndCrosses.AI.*;

/**
 * MainApp - Вход в игру
 */
public class MainApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите максимальное количество фишек подряд для победы\n Put max numberpoints to win: ");
        int WIN_COUNT = scanner.nextInt();
        System.out.println("Введите размер игрового поля по горизонтали \nPut horizontal size of field:");
         fieldSizeX = scanner.nextInt();
        System.out.println("Введите размер игрового поля по вертикали \n Put vertical size of field:");
         fieldSizeY = scanner.nextInt();

        Field field = new Field();
        Human human = new Human();
        GameChecks gameChecks = new GameChecks();
        AI ai = new AI();

        while (true) {
            field.initField(fieldSizeX, fieldSizeY);
            field.printField();
            while (true) {
                human.humanTurn();
                field.printField();
                if (gameChecks.gameCheck(human.DOT_HUMAN, "YOU WIN!"))
                    break;
                ai.aiTurn();
                field.printField();
                if (gameChecks.gameCheck(DOT_AI, "AI WIN"))
                    break;
            }
            System.out.print("Do you want to play again? (Y - да): ");
            if (!scanner.next().equalsIgnoreCase("Y"))
                break;
        }
        scanner.close();
    }

}
