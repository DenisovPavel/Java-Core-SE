package PrtHTApi.prtwo;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class bubblesort {

    public static void sortArray(int[] inputarray) {
        int sorted_size = 0;//отсортированный массив;
        int size = inputarray.length;// длина вход.массива
        Logger logger = Logger.getLogger(bubblesort.class.getName());// привезал класс к логеру
        ConsoleHandler conhel = new ConsoleHandler(); // object для передачи в консоль
        logger.addHandler(conhel); // аргумент для логера(куда пойдут сообщения)
        SimpleFormatter sFormat = new SimpleFormatter(); // создал формат передачи
        conhel.setFormatter(sFormat); // в виде строки


//        если собираемся записывать логи в файл txt
//        Logger logger = Logger.getLogger(bubblesort.class.getName());// привезал класс к логеру
//        FileHandler fhler = new FileHandler("logWritter.txt");
//        logger.addHandler(fhler);
//        SimpleFormatter sFormat = new SimpleFormatter();
//        fhler.setFormatter(sFormat);

        int i, j, temp;
        boolean swapped;
        for (i = 0; i < size - 1; i++) {
            swapped = false;
            for (j = 0; j < size - i - 1; j++) {
                logger.info("Log Iteration: " + "Outer Loop " + i +  " " + " Inner Loop " + j);
                if (inputarray[j] > inputarray[j + 1]) {
                    temp = inputarray[j];
                    inputarray[j] = inputarray[j + 1];
                    inputarray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        for (int outarray : inputarray)
            System.out.printf(outarray + " ");
    }
    public static void main(String[] args) throws IOException {

        int[] array = new int[]{3, 8, 3, 6, 1, 9, 3, 6, 8, 3, 8, 3, 9, 5, 8, 9, 4, 6, 83, 2, 45, 11, 88, 22, 89};
        System.out.println(Arrays.toString(array));
        sortArray(array);
    }
}