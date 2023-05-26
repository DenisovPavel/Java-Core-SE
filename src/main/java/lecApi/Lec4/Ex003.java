package lecApi.Lec4;

import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); //+1
        deque.addLast(2); //+2
        deque.removeLast(); //-2
        deque.offerFirst(1); //+1 [ 1 , 1(field 6) ]
        deque.offerLast(2); // + 2 [1 ,1 ,2 ]
        deque.pollFirst(); // -1
        deque.pollLast();
        deque.getFirst();
        deque.getLast();
        deque.peekFirst();
        deque.peekLast();
        System.out.println(deque);
    }
}