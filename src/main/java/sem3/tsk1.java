package sem3;
//Заполнить список десятью случайными числами.я просто думаю как при помощи рандома это прокинуть + math
// Отсортировать список методом sort() и вывести его на экран.
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.lang.Math.*;

public class tsk1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println(showList(list));
        Collections.sort(list);
        System.out.println(list);
    }

    // а все понял, можно через foreach перебрать все понял спасибо
    public static ArrayList<Integer> showList(ArrayList<Integer> inputlist) {
        Random rnd = new Random();
        for (int i = 0; i < inputlist.size(); i++) {
            inputlist.add(rnd.nextInt(10));
        }
        return inputlist;
    }
}
