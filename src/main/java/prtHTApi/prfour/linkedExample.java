package prtHTApi.prfour;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedExample {

    //    Реализовать консольное приложение, которое:
//    Принимает от пользователя и “запоминает” строки.
//    Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//    Если введено revert, удаляет предыдущую введенную строку из памяти.
//    Если введено exit, завершаем программу
//    Пример:
//    java
//    python
//    c#
//    print > [c#, python, java]
//    revert
//    print > [python, java]
//    kotlin
//    print > [kotlin, python, java]
//    revert
//    revert
//    revert
//    print > []
//    revert > Ошибка!
//    exit -> (Программа завершилась)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> str = new LinkedList<>();
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
                str.removeFirst();
                System.out.println(str + " ");
                continue;
            }
            if (command.equals("print")) {      // if print
                System.out.println(str + " ");
            } else {
                str.addFirst(command);           // add first always
            }
        }
        sc.close();
    }
}
