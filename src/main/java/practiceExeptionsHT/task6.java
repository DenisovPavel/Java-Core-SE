package practiceExeptionsHT;

public class task6 {
    public static void main(String[] args) {
        int [] intArray = {1,2,3,4,5,6,0,2,6,10};
        // int [] intArray = {1,2,3,0,5,6,0,2,6,10};
        // int d = 2;
        int d = 0;
        for (int i = 0; i < intArray.length; i++) {
            try {
                double catchedRes1 =  intArray[i] / d  ;
                System.out.println("catchedRes1 = " + catchedRes1);
            } catch (ArithmeticException e) {
                System.out.println("На ноль делить нельзя!Арифметическая ошибка!Измените значение переменной = " + d);
                //System.out.println("На ноль делить нельзя!Арифметическая ошибка!Измените значение переменной = " + intArray[i]);
            }
        }
    }
}