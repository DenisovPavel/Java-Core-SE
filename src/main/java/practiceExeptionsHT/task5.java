package practiceExeptionsHT;

import java.util.Scanner;

public class task5 {
    //    Реализуйте метод,
    //    который запрашивает у пользователя ввод дробного числа (типа float),
    //    и возвращает введенное значение.
    //    Ввод текста вместо числа не должно приводить к падению приложения,
    //    вместо этого,
    //    необходимо повторно запросить у пользователя ввод данных.
//    public static void main(String[] args){
//        Scanner iscanner = new Scanner(System.in);
//        System.out.println("Введите дробное число: ");
//        String number = iscanner.nextLine();
//        try {
//            float output = Float.parseFloat(number);
//            System.out.println(output);
//
//        } catch (Exception ex) {
//            System.out.println("Введите дробное число, не текст!");
//            String number1 = iscanner.nextLine();
//            float output = Float.parseFloat(number1);
//            System.out.println(output);
//        }
//        iscanner.close();
//    }
//}


// Вариант 2

    public static void main(String[] args) {
        showNumber();
    }

    static float showNumber() {
        while (true) {
            Scanner iscanner = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            if (iscanner.hasNextFloat()) {
                float number = iscanner.nextFloat();
                System.out.println(number);
                return number;

            } else {
                System.out.println("Число для поиска указано некорректно.Повторите попытку ввода!");
                iscanner.nextLine();

            }
            iscanner.close();
        }
    }

}
