package BankApp;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final String pin;
    private final int day;
    private final int month;
    private final int year;
    protected ArrayList<Account> accounts = new ArrayList<>();
    private String email;
    private String phoneNumber;


    public Customer(String firstName, String lastName, int day, int month, int year, Gender gender, String email,
                    String pin, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.gender = gender;
        this.pin = pin;
        if (phoneNumber.length() == 11) this.phoneNumber = phoneNumber;
        else throw new IllegalArgumentException("Phone number must be 11 digits");
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

    public void depositMoney(Account newAccount) {
        this.accounts.add(newAccount);
    }

    public Account getAccountInfo(String customerName) {
        for (Account account : accounts) {
            if (account.getCustomerName().equals(customerName)) {
                return account;
            }
        }
        return null;
    }
}
