package BankApp.README;

public class DebitAccount extends BaseAccount{
    public DebitAccount(String clientName, int clientPassword, double clientBalance) {
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
