package BankApp.README;

public class Transaction  {



    // sumCredits; // сумма перевода(снятия)

    public void transactionCards(BaseAccount minus, BaseAccount plus, double sumCredits)  {
        try {
            minus.withdrawFromBalanceClient(sumCredits); // сняли  средства
            plus.addMoneyToClientBalance(sumCredits);// зачислили средства
        } catch (IllegalArgumentException exception) {
            System.out.println(" Error transaction operation " + exception.getMessage());
        } catch (InsufficientFundsException exception) {
            System.out.println(" Error transaction operation " + exception.getMessage());
        }
    }

}

// Another variant:

//    CreditAccount creditAccount; кредитный счет
//    DebitAccount debitAccount; дебитовый счет
//    private double sumCredits; сумма средств

//    public void fromCreditToDebit(CreditAccount creditAccount, DebitAccount debitAccount, double sumCredits
//    ) throws IllegalArgumentException {
//        try {
//            if (sumCredits > 0 && sumCredits < creditAccount.getClientBalance()) {
//                creditAccount.setClientBalance(getClientBalance() - sumCredits);// сняли с кредитки средства
//                debitAccount.setClientBalance(getClientBalance() + sumCredits);// зачислили на дебитовую карту
//                System.out.println(" Operation completed! Debit account balance:%.2f\n" + debitAccount.getClientBalance());
//            }
//        } catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//
//    public void fromDebitToCredit(DebitAccount debitAccount, CreditAccount creditAccount, double sumCredits
//    ) throws IllegalArgumentException {
//        try {
//            if (sumCredits > 0 && sumCredits < debitAccount.getClientBalance()) {
//                debitAccount.setClientBalance(getClientBalance() - sumCredits);// сняли с кредитки средства
//                creditAccount.setClientBalance(getClientBalance() + sumCredits);// зачислили на дебитовую карту
//                System.out.println(" Operation completed! Credit account balance:%.2f\n" + creditAccount.getClientBalance());
//            }
//        } catch (IllegalArgumentException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
