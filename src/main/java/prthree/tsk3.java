package prthree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class tsk3 {
    public static void main(String[] args) {
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
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
        showMin(list);
        showMax(list);


    }


    public static void showMin(ArrayList<Integer> input) {
        int min = input.get(1);
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i) < min) {
                min = input.get(i);
            }
        }
        System.out.println("Min element: "+ min);
    }

    public static void showMax(ArrayList<Integer> input) {
        int max = input.get(1);
        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i) > max) {
                max = input.get(i);
            }
        }
        System.out.println("Max element: "+ max);
    }


//    public static void showMiddle(ArrayList<Integer> input){
//        ArrayList<Integer> output = input.s

    }





















//        int max=list.size()-1;
//        int min=list.get(0);
//        ArrayList<IntStream> intstream=new ArrayList<>();
//        intstream.add(IntStream.range(min,max));
// не получилось вывезти через обычный sysout.