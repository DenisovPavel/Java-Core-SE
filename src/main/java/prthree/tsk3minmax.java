package prthree;

import java.util.ArrayList;
import java.util.Arrays;

public class tsk3minmax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 10);
        list.add(1, 3);
        list.add(2, 7);
        list.add(3, 20);
        list.add(4, 6);
        list.add(5, 13);
        list.add(6, 9);
        list.add(7, 15);
        list.add(8, 4);
        list.add(9, 7);
        list.add(10, 7);
        System.out.println(list);
        showMinMax(list);
    }
    public static void showMinMax(ArrayList<Integer> input) {
        Integer[] arrayofnumbers = input.toArray(new Integer[input.size()]);// перекинул в массив
        Arrays.sort(arrayofnumbers); // отсортировал встроенным методом sort()
        int min = arrayofnumbers[0]; // 1 элемент
        int max = arrayofnumbers[arrayofnumbers.length-1]; // последний элемент
//        int middlepart = arrayofnumbers.length / 2;
        int middlepart = arrayofnumbers.length / 2+1;
        int middle = arrayofnumbers[middlepart];

        System.out.println("Min element " + min );
        System.out.println("Max element " + max );
        System.out.println("Middle element " + middle );
        }
    }





