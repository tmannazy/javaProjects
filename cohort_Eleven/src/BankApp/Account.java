package BankApp;

import java.util.Objects;
import java.util.UUID;

public class Account {
    private final String pin;
    private final String accountID;
    private String customer;
    private double balance;
    private String accountType;


//    public Account(Customer customer, String pin) {
//        this(accountTypes accountType, Customer customer, String, pin);
//    }

    public Account(AccountTypes accountType, Customer customer, String pin){
        this.customer = customer.getNames();
        this.pin = pin;
        this.accountType = String.valueOf(accountType);
        this.accountID = UUID.randomUUID().toString();
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else if (amount < 0) {
            throw new IllegalArgumentException("You can't deposit negative amount");
        }
    }

    public double getBalance(String pin) {
        if (this.pin.equals(pin))
            return balance;
        else
            throw new IllegalArgumentException("Enter correct pin!!");
    }

    public void withdraw(int amountToWithdraw, String pin) {
        if (!Objects.equals(this.pin, pin))
            throw new IllegalArgumentException("Incorrect pin");
        else if (this.pin.equals(pin) && amountToWithdraw <= balance)
            this.balance -= amountToWithdraw;
         else
            throw new IllegalArgumentException("Amount exceeded balance");
    }

    public String getAccountType() {
        return accountType;
    }

    public void migrateAccountType(String accountType) {
        if (accountType.equalsIgnoreCase("current"))
            this.accountType = String.valueOf(AccountTypes.CURRENT);
    }


}
