package ChibuzoBank;

public class Bank {
    private int numberOfCustomers;
    private Account[] accounts = new Account[14];

    private Bank(String bankName) {
    }

    public void register(String customerName, String pin) {
        Account account = new Account(++numberOfCustomers, customerName, pin);
        accounts[numberOfCustomers - 1] = account;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Account getAccountByAccountNumber(int accountNumber) {
        return accounts[accountNumber-1];
    }

    public void deposit(int accountNumber, int amount) {
        Account account = getAccountByAccountNumber(accountNumber);
        account.deposit(amount);
    }

}
