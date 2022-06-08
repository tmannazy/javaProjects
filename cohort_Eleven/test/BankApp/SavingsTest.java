package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsTest {
    Savings savings;

    @BeforeEach
    void setUp() {
        savings = new Savings(AccountTypes.SAVINGS, new Customer("Tmann", "Nazy", 20, 12, 2000,
                Gender.MALE, "t@tman.com", "1234", "12345678901"),"1234");
    }

    @Test
    void testThatYouCanWithdraw() {
        savings.deposit(5000);
        savings.withdraw(2000, "1234");
        assertEquals(3000,savings.getBalance("1234"));
    }

    @Test
    void testThatYourWithdrawalDontExceedLimit() {
        savings.deposit(5_000_000);
       try {
            savings.withdraw(10_000_000, "1234");
        }catch (IllegalArgumentException err){
           err.getMessage();
       }
        assertEquals(5_000_000, savings.getBalance("1234"));
    }

    @Test
    void testThatWithdrawDontExceedDailyLimit(){
        savings.deposit(2_000_000);
        try {
            savings.withdraw(500_000, "1234");
            savings.withdraw(500_000, "1234");
            savings.withdraw(100_000, "1234");
        } catch(IllegalArgumentException err){
            err.getMessage();
        }
        assertEquals(1_000_000, savings.getBalance("1234"));
    }

}