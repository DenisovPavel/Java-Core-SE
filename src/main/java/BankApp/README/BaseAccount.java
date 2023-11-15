package BankApp.README;

/**
 * @params BaseAccount -  счет в банке
 */
public class BaseAccount {
    private String clientName;// Имя
    private int clientPassword;// Пароль
    private double clientBalance;// Пароль

    public BaseAccount(String clientName, int clientPassword, double clientBalance) {
        this.clientName = clientName;
        this.clientPassword = clientPassword;
        /**
         * Проверка пароля на длину не больше 15 и не мньше 3 символов.
         */
//        try {
//            if (clientPassword < 3 || clientPassword > 15) {
//                throw new IllegalArgumentException("Your Password cannot be shorter then 3 symbols and longer than 15 " +
//                        "according to Security Rules!Try again!");
//            }
//            this.clientPassword = clientPassword;
//        }
//            System.out.println("Client Password created, Dont forget it!->" + getClientPassword());
//        catch(IllegalArgumentException e){
//                System.out.printf("Incorrect attempt with password lenght ", e.getMessage());
//            }
//

        /**
         * Проверка баланса на отрицательное значение.
         */

        try {
            if (clientBalance < 0) {
                throw new IllegalArgumentException("Your balance cannot be negative!Try Again!\n");
            }
            this.clientBalance = clientBalance;
            System.out.printf("Client account created:" + getClientName() + "\n" + "Client balance: "
                    + getClientBalance() + "\n");
        } catch (IllegalArgumentException ex) {
            System.out.printf("Incorrect attempt with negative number!\n", ex.getMessage());
        }
    }


    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(int clientPassword) {
        this.clientPassword = clientPassword;
    }

    public double getClientBalance() {
        return clientBalance;
    }

    public void setClientBalance(double clientBalance) {
        this.clientBalance = clientBalance;
    }

    /**
     * @params addMoneyToClientBalance - метод пополнения счета
     */
    public void addMoneyToClientBalance(double accountBalance) {
        try {
            if (accountBalance < 0) {
                throw new IllegalArgumentException("Your cash to balance cannot be negative!Try again!\n");
            }
            setClientBalance(getClientBalance() + accountBalance);
            //  System.out.printf("Client Balance was refill and Sum of refill was" + accountBalance + "\n");
        } catch (IllegalArgumentException e) {
            System.out.printf("Negative Sum -> to Balance:\n" +
                    e.getMessage());

        }
    }

    /**
     * @params addMoneyToClientBalance - метод снятия средств со счета;
     */
    public void withdrawFromBalanceClient(double sumOfDraw) {
        try {
            if (sumOfDraw > getClientBalance()) {
                throw new InsufficientFundsException("Not enough money in Client Balance\n", sumOfDraw);
            } else
                setClientBalance(getClientBalance() - sumOfDraw);
            System.out.printf("Client took " + sumOfDraw + " "
                    + "Now balance:\n  " + getClientBalance() + "\n");
        } catch (InsufficientFundsException exception) {
            System.out.printf(exception.getMessage());
        }
    }
}
