package codewarsPractice;

import java.util.Scanner;
import java.util.*;
/*Create a function taking a positive integer between 1 and 3999 (both included)
as its parameter and returning a string containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit
        and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM,
        90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
        1666 uses each Roman symbol in descending order: MDCLXVI.*/

/* Symbol Value
        I 1
        V 5
        X 10
        L 50
        C 100
        D 500
        M 1,000 */
public class taskRomans {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println(" Write your number between 1 & 3999: ");
        int inputNumber = in.nextInt();
        in.close();

        Map<Integer, String> symbols = new HashMap<Integer, String>();
        symbols.put(1, "I");
        symbols.put(5, "V");
        symbols.put(10, "X");
        symbols.put(50, "L");
        symbols.put(100, "C");
        symbols.put(500, "D");
        symbols.put(1000, "M");


    }



    public static void showRomanNumeral(int number, Map<Integer, String> Input) {
        String output = "";




        System.out.println("Your number in Roman Numeral representation is " + output);
    }

}