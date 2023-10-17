package PrtHTApi.prtone;

import java.util.stream.IntStream;

public class showsimplenumbers {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(1, 1000).toArray();
        for (int i = 2; i < array.length; i++) {
            Boolean numberPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numberPrime = false;
                }
            }
            if (numberPrime) {
                System.out.printf("%d,", i);
            }
        }
    }
}

