package PracticeExeptionsHT;

import java.util.Arrays;

//        Реализуйте метод,принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив,каждый элемент которого равен разности элементов
//        двух входящих массивов в той же ячейке.Если длины массивов не равны,необходимо
//        как-то оповестить пользователя.

public class tsk1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 7, 6, 2, 8};
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
            if(inputarray1[index] > inputarray2[index]){
            temp = inputarray1[index] - inputarray2[index];}
            else{
                temp = inputarray2[index] - inputarray1[index];
            }
            arr[index] += temp;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}

