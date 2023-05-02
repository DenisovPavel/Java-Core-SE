package prthree;
import java.util.Arrays;

public class tsk4 {
    //Реализовать алгоритм сортировки слиянием
    public static void main(String[] args) {
        int[] unsortedArr = {77, 22, 12, 7, 8, 10, 13, 19, 3, 6, 33, 1, 44, 57, 14, 59, 99, 23, 98, 5};
        System.out.println(Arrays.toString(unsortedArr));
        int [] sorted = combineParts(unsortedArr);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] combineParts(int[] firstpart, int[] secondpart, int indexstartpoint, int endIndex) {
        if (indexstartpoint >= endIndex - 1) {
            return firstpart; //
        }

        int middlepoint = indexstartpoint + (endIndex - indexstartpoint) / 2; // определяем середину.
        int[] firstsorted = combineParts(firstpart, secondpart, indexstartpoint, middlepoint); // первая часть
        int[] secondsorted = combineParts(firstpart, secondpart, middlepoint, endIndex); // вторая часть


        int index1 = indexstartpoint;
        int index2 = middlepoint;
        int destIndex = indexstartpoint;

        int[] result = firstsorted == firstpart ? secondpart : firstpart;// путем тернарного присваиваем или переопределяем.

        while (index1 < middlepoint && index2 < endIndex) {
            result[destIndex++] = firstsorted[index1] < secondsorted[index2]
                    ? firstsorted[index1++] : secondsorted[index2++]; // путем тернарного возращаем или переопределяем.
        }
        while (index1 < middlepoint) { // пока 1 меньше средней точки
            result[destIndex++] = firstsorted[index1++]; // добавляем в результат
        }
        while (index2 < endIndex) { // пока 2 меньше конечной точки
            result[destIndex++] = secondsorted[index2++]; // добавляем в результат
        }
        return result;
    }
    public static int[] combineParts(int[] sortArr) {
        int[] partfirst = Arrays.copyOf(sortArr, sortArr.length);
        int[] partsecond = new int[sortArr.length];
        int[] arrOut = combineParts(partfirst, partsecond, 0, sortArr.length);// через цепочку методов
        // выводим в output отсортированный массив.
        return arrOut;
    }
}