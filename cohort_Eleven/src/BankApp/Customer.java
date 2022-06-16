package BankApp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final int day;
    private final int month;
    private final int year;
    private final String email;
    private final String phoneNumber;
    protected ArrayList<Account> accounts = new ArrayList<>();


    public Customer(String firstName, String lastName, int day, int month, int year, Gender gender, String email,
                    String pin, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.gender = gender;
        if (phoneNumber.length() == 11) this.phoneNumber = phoneNumber;
        else throw new IllegalArgumentException("Phone number must be 11 digits. New account not created.\n");
    }

    public void removeAccount(Customer customerToBeDeleted) {
        Account accountToBeDeleted = null;
        for(Account account : accounts){
            if (account.getCustomerName().equalsIgnoreCase(customerToBeDeleted.getNames())) {
               accountToBeDeleted = account;
            }
        }
        accounts.remove(accountToBeDeleted);
    }

    public String getNames() {
        return (lastName + " " + firstName);
    }

    public String getGender() {
        return String.valueOf(gender);
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        Period getAgeDifference = Period.between(birthday, today);
        return getAgeDifference.getYears();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositMoney(String customerName, int amount) {
        Account depositAccount = getAccountInfo(customerName);
        depositAccount.deposit(amount);
    }

    public void withdrawMoney(String customerName, int amount, String pin) {
        Account withdrawAccount = getAccountInfo(customerName);
        withdrawAccount.withdraw(amount, pin);
    }

    public double checkBalance(String customerName, String pin) {
        Account checkBal = getAccountInfo(customerName);
        return checkBal.getBalance(pin);
    }

    public Account getAccountInfo(String customerName) {
        for (Account account : accounts) {
            if (account.getCustomerName().equalsIgnoreCase(customerName)) return account;
        }
        throw new IllegalArgumentException("Account with customer name '" + customerName + "' not found");
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addNewAccount(Account newAccount) {
        for (Account account : accounts) {
            if (account.getCustomerName().equalsIgnoreCase(newAccount.getCustomerName())) {
                throw new IllegalArgumentException("A customer with these details already exists");
            }
        }
        this.accounts.add(newAccount);
    }

    @Override
    public String toString() {
        return "Customer: " + getNames().toUpperCase() + '\'' +
               "\n gender: " + getGender() +
               "\n age: " + getAge() +
               "\n email: " + getEmail() +
               "\n phoneNumber: '" + getPhoneNumber() + '\'' +
               '}';
    }
}
