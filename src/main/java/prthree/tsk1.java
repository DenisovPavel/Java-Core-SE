package prthree;

import java.util.Arrays;

public class tsk1 {

    //Реализовать алгоритм сортировки слиянием
    public static void main(String[] args) {
        int[] first = {77, 22, 12, 7, 8, 10, 13, 19, 3, 6};
        int[] second = {33, 1, 44, 57, 14, 59, 99, 23, 98, 5};
        int[] output = new int[first.length + second.length];
        combineArrays(first, second, output);
        System.out.println(Arrays.toString(output));
    }

    public static int[] combineArrays(int[] arrone, int[] arrtwo, int[] outputarr) {

        int i = 0, j = 0;
        root:
        for (int k = 0; k < outputarr.length; k++) {// пробегаем по циклу исходящего массива


            if (i > arrone.length - 1) {  // идет проверка по первому массиву
                int a = arrtwo[j];
                outputarr[k] = a;
                j++;
            } else if (j > arrtwo.length - 1) {   // идет проверка по второму массиву
                int a = arrone[i];
                outputarr[k] = a;
                i++;
            } else if (arrone[i] < arrtwo[j]) { // если i элемент первого массива меньше j-го второго
                int a = arrone[i]; // тогда наименьший уходит в output массив.
                outputarr[k] = a;
                i++;
            } else {
                int b = arrtwo[j]; // в противн.случае уходит из второго массива если этот элем-т.меньше
                outputarr[k] = b;
                j++;

            }
        }
        return outputarr;
    }

}
// not yet!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!