package practiceExeptionsHT;
// Реализуйте метод, принимающий в качестве аргументов двумерный массив.
// Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
// детализировать какие строки со столбцами не требуется. Как бы вы реализовали
// подобный метод?
import java.util.Random;
public class tsk4 {
    public static void main(String[] args) {
        createArray();
        checkZero(createArray());
        showArray(createArray());
        checkArray(createArray());

    }
    public static int[][] createArray() {
        int[][] arr = new int[10][10];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += rnd.nextInt(5);
            }
        }
        return arr;
    }

    public static void showArray(int[][] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = 0; j < inputArr[i].length; j++) {
                System.out.print(inputArr[i][j] + ",");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static  boolean checkZero(int [][] inputArr){
        if(inputArr == null){
            System.out.println("Массив пустой");
            return  true;
        }
        System.out.println("Создали массив с рандомными значениями!");
        return false;
    }
    public static boolean checkArray(int[][] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr.length != inputArr[i].length) {
                System.out.println("длина строк и столбцов с одинаковым индексом неодинакова!");
                return true;
            }
        }
        System.out.println("длина строк и столбцов с одинаковым индексом неодинакова!");
        return false;
    }
}