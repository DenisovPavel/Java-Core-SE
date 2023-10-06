package funexample;

import java.lang.Math;

public class typesex {
    private static int b;

    public static void main(String[] args) {

//        double a = 56.9898;
//        int b = Math.round((int)a);  //   56
//        System.out.println(b);
        // int b = (int) Math.round(a); // 56.9898
        //  System.out.println(a);
//        int number = 45; // 1001 Значение, которое надо зашифровать - в двоичной форме 101101
//        int key = 102; //Ключ шифрования - в двоичной системе 1100110
//        int encrypt = number ^ key; //Результатом будет число 1001011 или 75
//        System.out.println("Зашифрованное число: " +encrypt);
//
//        int decrypt = encrypt ^ key; // Результатом будет исходное число 45
////        System.out.println("Расшифрованное число: " + decrypt);
//        int a = 8;
//        int b = 2;
//        int c = a>>>b;
//        System.out.println(c);
//        int a = 3;
//        double b = 4.6;
//        double c = a+b;
//        System.out.println(c);
//        try{
//            int[] numbers = new int[3];
//            numbers[4]=45;
//            System.out.println(numbers[4]);
//        }
//        catch(Exception ex){
//
//            ex.printStackTrace();
//        }
//        System.out.println("Программа завершена");


        Person tom = new Person("Tom", -116);
        System.out.println(tom.toString());

    }

    record Person(String name, int age) {

        Person {

            if (age < 1 || age > 110) {
                age = 18;
            }
        }
    }
    

}
