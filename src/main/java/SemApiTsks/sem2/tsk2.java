package SemApiTsks.sem2;

import java.util.Scanner;


public class tsk2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку с повторяющимеся буквами: ");
//        String str = scanner.toString();
       String str = "aaaaaaddddddttqq";
        System.out.println( showLetters(str));

//        scanner.close();
    }

    public static String showLetters(String input) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    sb.append(input.charAt(i));
                } else {
                    sb.append(input.charAt(i) + Integer.toString(count));
                    count = 1;
                }
            }
        }
        sb.append(input.substring(input.length() - 1) + Integer.toString(count));
        return sb.toString();
    }

}