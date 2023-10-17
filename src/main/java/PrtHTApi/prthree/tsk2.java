package PrtHTApi.prthree;
import java.util.ArrayList;

public class tsk2 {
    // Пусть дан произвольный список целых чисел, удалить из него чётные числа
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
        System.out.println(list);
        System.out.println(deleteElements(list));
    }

    public static ArrayList<Integer> deleteElements(ArrayList<Integer> inputlist) {
        ArrayList<Integer> outputlist = new ArrayList<>();
        for (int i = 0; i < inputlist.size(); i++) {
            if (inputlist.get(i) % 2 != 0) {
                outputlist.add(inputlist.get(i));
            }
        }
        return outputlist;
    }
}


