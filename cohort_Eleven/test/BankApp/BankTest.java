package BankApp;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

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


}