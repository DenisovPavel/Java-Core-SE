package PracticeExeptionsHT;

import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
// возвращающий новый массив, каждый элемент которого равен сумме элементов двух
// входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class tsk3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};
        showQuotient(array1, array2);
    }

    public static void showQuotient(int[] inputarray1, int[] inputarray2) {
        if (inputarray1.length != inputarray2.length) {
            System.out.println("Arrays are not equal!");
            return;
        }
        int[] arr = new int[inputarray1.length];
        int index = 0;
        double temp = 0;
        while (index < inputarray1.length) {
            temp = inputarray1[index] + inputarray2[index];
            arr[index] += temp;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}


