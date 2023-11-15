package BankApp.README;

public class CreditAccount extends BaseAccount{
    public CreditAccount(String clientName, int clientPassword, double clientBalance) {
        super(clientName, clientPassword, clientBalance);
    }

    @Override
    public void setClientBalance(double clientBalance) {
        super.setClientBalance(clientBalance);
    }

    @Override
    public double getClientBalance() {
        return super.getClientBalance();
    }
}
