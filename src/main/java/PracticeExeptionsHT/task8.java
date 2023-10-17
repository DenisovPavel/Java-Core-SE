package PracticeExeptionsHT;

import java.util.Scanner;

// Разработайте программу, которая выбросит Exception,
// когда пользователь вводит пустую строку. Пользователю должно показаться сообщение,
// что пустые строки вводить нельзя.
public class task8 {
    public static void main(String[] args) {
        createMassage();
    }
    public static void createMassage() {
        Scanner iscanner = new Scanner(System.in);
        boolean ok = false;
        while (!ok) {
            System.out.println("Введите ваше сообщение: ");
            try {
                String output = iscanner.nextLine();
                if (output.length() != 0) {
                    System.out.println(output);
                    ok = true;
                } else {
                    System.out.println("IllegalArgumentException!");
                    System.out.println();
                    ok = false;
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                ok = false;
            }
        }
        iscanner.close();
    }

}




