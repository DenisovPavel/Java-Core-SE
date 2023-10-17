package PrtHTApi.prtone;

import java.util.Scanner;

public class factnumber {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Put your number to find faktorial: ");
        int faktnumber = Integer.parseInt(iScanner.nextLine());
        System.out.println(showFakt(faktnumber));
    }

    public static int showFakt(int num) {
        if (num == 1 && num == 1) {
            return 1;
        }
        int output = 1;
        for (int i = 1; i <= num; i++) {
            output = output * i;
        }
        return output;
    }
}



