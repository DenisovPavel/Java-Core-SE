package PracticeExeptionsSem;

import java.util.Scanner;

public class practiseExfour {
    // ClassCastException - неверное приведение типов(unchecked)
    //    StackOverflowError - Stack переполнен
    //    IOError - ввод данных и вывод данных типо с файлов
    //    IOException - ошибка в потоке ввода вывода
    //    NullPointerException - несуществующий обьект
    //    ConcurrentModificationException - неверное преобразование(при работе с коллекциями)
    //    IllegalArgumentException - ненужный аргумент при вызове метода.
    //     EOFException - неверный вызов класса
    //    ClassNotFoundException - данный класс не был найден
    //    ThreadDeath </aside> - поток убит
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Укажите индекс элемента массива, в который Вы хотите записать единицу(1)");
        int index = 0;
        boolean hasInput = false;
        while (!hasInput) {
          System.out.print("Введите число: ");
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                hasInput = true;
            } else {
                System.out.println("Вы ввели не число, попробуйте еще раз");
                scanner.next();
            }
        }
        if (index >= 0 && index < array.length) {
            array[index] = 1;
        } else {
            System.out.println("Указан индекс за пределами массива!Повторите ввод!");

        }
    }
}


//
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[10];
//        int [] arr = new int[array.length];
//        System.out.println("Укажите индекс элемента массива, в который Вы хотите записать единицу(1)");
//
//        int index = scanner.nextInt();
//        while (index < 0 || index > 9) {
//            System.out.println("IOExeption");
//        }
//        for (int i = 0; i < array.length; i++) {
//            if(i==index){
//                arr[i]=index;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//    }

