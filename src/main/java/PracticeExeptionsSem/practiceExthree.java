package PracticeExeptionsSem;
import java.lang.RuntimeException;
import java.lang.*;
public class practiceExthree {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 0}, {1, 1, 1}, {1, 0, 1}};
        int sum = 0;
        try {
            sum = sumArray(array);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return;
        }
        System.out.println(sum);
    }
    public static int sumArray(int[][] array) {
        try {
            checkArray(array);
        } catch (Exception ex) {
            throw ex;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        return sum;
    }
    public static void checkArray(int[][] array) {
        if (array.length == 0) {
            throw new RuntimeException("Null elements in array");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                throw new RuntimeException("Not equal Array");
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 1 && array[i].length != 0) {
                throw new RuntimeException("Array can have only 1 & 0");
            }

        }
    }

}