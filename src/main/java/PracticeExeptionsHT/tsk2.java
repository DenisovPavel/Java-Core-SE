package PracticeExeptionsHT;


// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
// как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может
// увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class tsk2 {

    public static void main(String[] args) throws Exception {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 6, 7, 8};
        checkArray(array1, array2);
        checkLength(array1, array2);
        System.out.println(Arrays.toString(showQuotient(array1, array2)));
    }

    public static int[] showQuotient(int[] inputarray1, int[] inputarray2) {
        int[] arr = new int[inputarray1.length];
        int temp = 0;
        int index = 0;
        while (index < inputarray1.length) {
            if(inputarray1[index]>inputarray2[index]){
            temp = inputarray1[index] / inputarray2[index];}
            else {
                temp= inputarray2[index] / inputarray1[index];
            }
            arr[index] += temp;
            index += 1;
        }
        return arr;
    }


    public static void checkArray(int[] inputar1, int[] inputar2) {
        int index = 0;
        while (index < inputar1.length) {
            if (inputar1[index] == 0 || inputar2[index] == 0) {
                throw new RuntimeException("You cant divide by zero!");
            }
            index++;
        }
    }

    public static void checkLength(int[] inputarr1, int[] inputarr2) {
        if (inputarr1.length != inputarr2.length) {
            throw new RuntimeException("Arrays are not equal!");
        }
    }


}