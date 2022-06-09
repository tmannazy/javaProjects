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
    protected ArrayList<Account> accounts = new ArrayList<>();
    private final String email;
    private final String phoneNumber;


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

    public double checkBalance(String customerName, String pin){
        Account checkBal = getAccountInfo(customerName);
        return checkBal.getBalance(pin);
    }

    public Account getAccountInfo(String customerName) {
        int accountIndex = -1;
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getCustomerName().equalsIgnoreCase(customerName)) {
                accountIndex = i;
                break;
            }
        }

        if (accountIndex == -1)
            throw new IllegalArgumentException("Account with customer name '" + customerName + "' not found");
        return accounts.get(accountIndex);
    }

    public ArrayList<Account> getAccounts(){
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
        return "Customer{" +
               "last name first Name='" + getNames() + '\'' +
               ", lastName='" + lastName + '\'' +
               ", gender=" + gender +
               ", day=" + day +
               ", month=" + month +
               ", year=" + year +
//               ", accounts=" + accounts +
               ", email='" + email + '\'' +
               ", phoneNumber='" + phoneNumber + '\'' +
               '}';
    }
}
