package prfour;

import java.util.Deque;
import java.util.*;

public class dequeExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<>();
        System.out.printf("Команды для пользования \n'print' - печать, \n'revert' - удаление, \n'exit' - выход из программы; \n" +
                "Впишите строку и нажмите 'Enter'");
        System.out.println();// если убрать эту строчку, то ввод первого элемента повлечет наличие лишней запятой в
        // в output
        while (true) {
            String command = sc.nextLine();// проверка на выход
            if ("exit".equals(command)) {//  if exit
                System.out.println("(Программа завершилась!)");
                break;
            }
            if (command.equals("revert")) {     // if revert
                deque.pop();
                System.out.println(deque);
                continue;
            }
            if (command.equals("print")) {      // if print
                System.out.println(deque);
            } else {
                deque.addFirst(command);           // add first always
            }
        }
        sc.close();
    }
}