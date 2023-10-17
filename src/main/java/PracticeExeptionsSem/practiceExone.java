package PracticeExeptionsSem;

public class practiceExone {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 15, 14, 16};
        int number = 20;
        System.out.println(checkArray(array, number));

    }

    public static int checkArray(int[] inputarray, int num) {
        int size = inputarray.length;
          if (inputarray == null){
              return -2;
          }
          if (inputarray.length < num){
              return -1;
          }
        return size;
    }


}
