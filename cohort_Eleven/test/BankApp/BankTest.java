package BankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BankTest {
    Bank bank;
    ArrayList<Customer> customers;

    @BeforeEach
    void setUp() {
        bank = new Bank();
        customers = new ArrayList<>();
    }

    @Test
    void testThatNewCustomerNameIsAdded() {
        bank.addNewCustomer(new Customer("Tmann", "Nazy", 20, 12, 2000,
                Gender.MALE, "t@tman.com", "1234", "12345678901"));
        String name = "";
        for (Customer customer : bank.customers) {
            if (customer.getNames().equals("Nazy Tmann")) {
                name = customer.getNames();
                break;
            }
        }
        assertEquals(name, bank.getCustomerNameDetails("Nazy Tmann").getNames());
    }

    @Test
    void testThatCustomerCanBeRemoved() {
        Customer customerOne = new Customer("Tmann", "Nazy", 20, 12, 2000,
                Gender.MALE, "t@tman.com", "1234", "12345678901");
        Customer customerTwo = new Customer("Ace", "Boyo", 15, 05, 1999,
                Gender.MALE, "ace@boyo.com", "5678", "09876543219");
        Account accountOne = new Account(AccountTypes.SAVINGS, customerOne, "1234");
        Account accountTwo = new Account(AccountTypes.SAVINGS, customerTwo, "5678");
        customerOne.addNewAccount(accountOne);
        customerTwo.addNewAccount(accountTwo);
        bank.addNewCustomer(customerOne);
        bank.addNewCustomer(customerTwo);
        bank.removeCustomer("Boyo Ace");
        assertNull(bank.getCustomerNameDetails("Boyo Ace"));
    }

}