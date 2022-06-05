package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CustomerTest {

    Customer customer;
    Account account;

    @BeforeEach
    void setUp() {
        customer = new Customer("Tman", "Nazy", 5, 6, 2000, Gender.MALE,
                "tman@semicolon.africa", "1234", "12345678911");
        account = new Account(AccountTypes.SAVINGS, new Customer("Tmann", "Nazy", 20, 12, 2000,
                Gender.MALE, "t@tman.com", "1234", "12345678901"),"1234");
    }

    @Test
    void testThatCustomerNameIsSet() {
        assertEquals("Nazy Tman", customer.getNames());
    }

    @Test
    void testThatGenderIsSet() {
        assertEquals("MALE", customer.getGender());
    }

    @Test
    void testThatEmailIsSet() {
        assertEquals("tman@semicolon.africa", customer.getEmail());
    }

    @Test
    void testThatAgeIsCorrect() {
        assertEquals(22, customer.getAge());
    }

    @Test
    void testThatPhoneNumberIsSet(){
        assertEquals("12345678911", customer.getPhoneNumber());
    }

    @Test
    void testThatPhoneNumberIsValid(){
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                ()-> new Customer("Tman", "Nazy", 5, 6, 2000, Gender.MALE,
                        "tman@semicolon.africa", "1234", "123456789011"));
        assertEquals("Phone number must be 11 digits", err.getMessage());
    }

    @Test
    void testCustomerCanGetAccountBalance() {
        assertEquals(0,account.getBalance("1234"));
    }
}