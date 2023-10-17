package PrtHTApi.prthree;

import java.util.Arrays;

public class tsk1 {
    // нужно поправить, что-то поломалось.(
//    //Реализовать алгоритм сортировки слиянием

    public static void main(String[] args) {
        int[] unsortedArr = {77, 22, 12, 7, 8, 10, 13, 19, 3, 6, 33, 1, 44, 57, 14, 59, 99, 23, 98, 5};
        System.out.println(Arrays.toString(unsortedArr));
        int [] sorted = divideArray(unsortedArr);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] divideArray(int[] arrone) { // поделил входящий массив на левую и правую часть.
            if (arrone.length == 0)  {
                System.out.println("Array is empty!");
            }
        int[] leftArr = Arrays.copyOfRange(arrone, 0, arrone.length / 2 );
        int[] rightArr = Arrays.copyOfRange(arrone, leftArr.length, arrone.length -1);
        return combineArr(leftArr, rightArr);
        // на возрат вызвал рекурсию след.метода -> CombineArr(сравнение элементов)
        // где буду сравнивать элементы leftArr массива и rightArr массива, и сразу сортировать их.
    }

    public static int[] combineArr(int[] arrLeft, int[] arrRight) {
        int[] outputArr = new int[arrLeft.length + arrRight.length];
        int rezOut = 0; // counter
        int leftOut = 0; // indexLeft
        int rightOut = 0; // indexRight
        while (leftOut < arrLeft.length && rightOut < arrRight.length)//проверка по длине 2х частей массива
            if (arrLeft[leftOut] < arrRight[rightOut]) // сравнение элемента левого с правым
                outputArr[rezOut++] = arrLeft[leftOut++]; // добавляем в результирующий массив - левый элемент
            else outputArr[rezOut++] = arrRight[rightOut++]; // добавляем в результирующий массив - правый элемент

        while (rezOut < outputArr.length) // проверка счетчика с длиной результирующего
            if (leftOut != arrLeft.length) // если indexLeft не равен левой части массива
                outputArr[rezOut++] = arrLeft[leftOut++];  // + левый
            else outputArr[rezOut++] = arrRight[rightOut++]; // + правый

        return outputArr;

    }
}