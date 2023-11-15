package BankApp.README;

public class MainApp {
    public static void main(String[] args) throws InsufficientFundsException {
        try {
            BaseAccount client1 = new BaseAccount("Pavel", 123456789, 100.5);
            client1.getClientBalance();// узнали баланс
            client1.addMoneyToClientBalance(200.15);// пополнили
            client1.getClientBalance(); // проверили пополнение
            client1.withdrawFromBalanceClient(300); // сняли опред.сумму
            System.out.println();
            BaseAccount client2 = new BaseAccount
                    ("Olga", 987654321, -200.5);//попытка создания аккаунта с отриц.балансем
            client1.addMoneyToClientBalance(-100.5);//попытка внести отрицательную сумму на счет

            BaseAccount client3 = new BaseAccount("Alex", 1234512345, 300.5);
            System.out.println();
            client3.withdrawFromBalanceClient(400);//Попытка снять средства, которые превышает текущий баланс
        } catch (IllegalArgumentException exceptionOne) {
            System.out.printf("Error", exceptionOne.getMessage());
        }

        try {
            CreditAccount creditCardPetr = new CreditAccount("Petr", 123456, 200.50);
            DebitAccount debitCardKate = new DebitAccount("Kate", 654321, 300.20);
            Transaction transaction = new Transaction();


            creditCardPetr.addMoneyToClientBalance(300.50);//зачислили на кредитную
            creditCardPetr.getClientBalance();// посмотрели зачисление

            debitCardKate.withdrawFromBalanceClient(100.20);//сняли с дебитовой
            debitCardKate.getClientBalance();// посмотрели снятие

            transaction.transactionCards(creditCardPetr, debitCardKate, 500.00); //операция транзакции
            System.out.println(debitCardKate.getClientBalance());

            transaction.transactionCards(creditCardPetr,debitCardKate,1234);

        } catch (IllegalArgumentException exception) {
            System.out.println("Operation Error" + exception.getMessage());
        }
    }
}
