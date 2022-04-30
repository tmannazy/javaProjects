package tdd;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) balance = balance + amount;
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw > 0 && amountToWithdraw <= balance) {
            balance -= amountToWithdraw;
        }
    }
}
