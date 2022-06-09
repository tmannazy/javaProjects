package BankApp;

import java.util.Objects;
import java.util.UUID;

public class Account {
    private final String pin;
    private final String accountID;
    protected double balance;
    private final String customer;
    private String accountType;


    public Account(AccountTypes accountType, Customer customer, String pin) {
        this.customer = customer.getNames().toLowerCase();
        this.pin = pin;
        this.accountType = String.valueOf(accountType);
        this.accountID = UUID.randomUUID().toString();
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else if (amount < 0) {
            throw new IllegalArgumentException("You can't deposit a negative amount");
        }
    }

    public double getBalance(String pin) {
        if (this.pin.equals(pin))
            return balance;
        else
            throw new IllegalArgumentException("Enter correct pin!!!");
    }

    public void withdraw(int amountToWithdraw, String pin) {
        if (!Objects.equals(this.pin, pin))
            throw new IllegalArgumentException("Incorrect pin");
        else if (this.pin.equals(pin) && amountToWithdraw <= balance)
            this.balance -= amountToWithdraw;
        else
            throw new IllegalArgumentException("Withdrawal amount exceeds balance");
    }

    public String getAccountType() {
        return accountType;
    }

    public void migrateAccountType(String accountType) {
        if (accountType.equalsIgnoreCase("current"))
            this.accountType = String.valueOf(AccountTypes.CURRENT);
    }

    public String getCustomerName() {
        return customer;
    }

    @Override
    public String toString(){
        return ("Customer - " + getCustomerName() + " with " +
                "\nAccount type: " + getAccountType() +
                "\nBalance is: " + getBalance(pin) +
                "\n");
    }
}
