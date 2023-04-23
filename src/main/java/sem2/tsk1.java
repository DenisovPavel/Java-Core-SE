package sem2;
import java.lang.String;
public class tsk1 {
    public static void main(String[] args) {
        int number = 6;
        char c1 = '+';
        char c2 = '-';
        StringBuilder sb = new StringBuilder();
        System.out.println(showSymbols(sb,c1,c2,number));
    }

    public static StringBuilder showSymbols(StringBuilder inputsb, char input1, char input2, int inputnumber) {
        for (int i = 0; i < inputnumber/2; i++ ){
           inputsb.append(input1);
           inputsb.append(input2);
        }
        return inputsb;
    }
}
