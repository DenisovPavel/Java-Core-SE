package practiceExeptionsSem;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class practiceExTwo {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите количество элементов массива: ");
        int sizearray = Integer.parseInt(iScanner.nextLine());
        int[] array = new int[sizearray];
        inArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Введите значение для поиска в массиве: ");
        int element = Integer.parseInt(iScanner.nextLine());
        int result = checkArray(array, element);

        if (result == -1) {
            System.out.println("Длина массива меньше заданого числа!");
        } else if (result == -2) {
            System.out.println("Был передан пустой массив!");
        } else if (result == -3) {
            System.out.println("Значение отсутствует в массиве!");
        } else
            System.out.println("Искомый элемент стоит на позиции = " + result);

        iScanner.close();
    }

    public static int checkArray(int[] inputarray, int number) {
        if (inputarray.length < number) {
            return -1;
        }
        if (inputarray == null) {
            return -2;
        }
        for (int i = 0; i < inputarray.length; i++) {
            if (inputarray[i] == number) {
                return i;
            }
        }
        return -3;
    }

    public static void inArray(int[] input) {
        int min = -10;
        int max = 10;
        for (int i = 0; i < input.length; i++) {
            input[i] = min + (int) (Math.random() * max + 1);
        }
    }
}
