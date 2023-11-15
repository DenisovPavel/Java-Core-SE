package BankApp.README;

/**
 * @params InsufficientFundsException обрабатывает ошибки в процессе компиляции
 */
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message,double sumOfDraw) {
        super(message);
        System.out.println(sumOfDraw);
    }

}


