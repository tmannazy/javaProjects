package BankApp;

import java.util.Objects;


public class Savings extends Account {
    private String pin;
    private int limit;

    public Savings(AccountTypes accountTypes, Customer customer, String pin) {
        super(accountTypes, customer, pin);
        this.pin = pin;
    }

    public Savings(Customer customer, String pin) {
        super(AccountTypes.SAVINGS, customer, pin);
    }

    @Override
    public void withdraw(int amountToWithdraw, String pin) {
        if (!Objects.equals(this.pin, pin))
            throw new IllegalArgumentException("Incorrect pin");
        else if (amountToWithdraw <= 0)
            throw new IllegalArgumentException("You entered an invalid amount");
        else if (amountToWithdraw > balance) {
            throw new IllegalArgumentException("Withdrawal amount exceeds balance");
        }
        this.limit += amountToWithdraw;

        int dailyWithdrawLimit = 1_000_000;
        if (limit > dailyWithdrawLimit) {
            throw new IllegalArgumentException("Daily limit exceeded");
        }
        int accountLimit = 5_000_000;
        if (balance > accountLimit) {
            throw new IllegalArgumentException("Account limit is " + accountLimit);

        }
        balance -= amountToWithdraw;

    }

}


