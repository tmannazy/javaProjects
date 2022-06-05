package BankApp;

public class Savings extends Account {
    public Savings(AccountTypes accountTypes, Customer customer, String pin) {
        super(accountTypes, customer,pin);
    }

    private int accountLimit = 15_000_000;
    private int dailyTransferLimit = 1_000_000;

    @Override
    public void withdraw(int amountToWithdraw, String pin) {
        super.withdraw(amountToWithdraw, pin);
//        if (pin.equals(pin) && amountToWithdraw > this.savingsAccountLimit &&
//                 accountType.equalsIgnoreCase("SAVINGS")) {
//            throw new IllegalArgumentException("Account limit is " + this.savingsAccountLimit);
    }
}


//else if (this.pin.equals(pin) && amountToWithdraw > this.savingsAccountLimit &&
//            accountType.equalsIgnoreCase("SAVINGS")) {
//        throw new IllegalArgumentException("Account limit is " + this.savingsAccountLimit);
//    }