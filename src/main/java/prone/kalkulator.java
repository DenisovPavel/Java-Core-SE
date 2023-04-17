package prone;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Put first number: ");
        int firstnumber = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Put arifmetic symbol: ");
        String mark = iScanner.nextLine();
        System.out.printf("Put second number: ");
        int secondnumber = Integer.parseInt(iScanner.nextLine());

        switch (mark) {
            case "+":
                System.out.println(firstnumber + secondnumber);
                break;
            case "-":
                System.out.println(firstnumber / secondnumber);
                break;
            case "/":
                System.out.println(firstnumber - secondnumber);
                break;
            case "*":
                System.out.println(firstnumber * secondnumber);
                break;
            default:
                System.out.println("Error,put arifmatic symbol again!");
                break;
        }
        iScanner.close();
    }
}


