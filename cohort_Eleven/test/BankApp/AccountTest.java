package BankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {
    Account account;
    Customer customer;

    @BeforeEach
    void setUp() {
//        account = new Account("Tman Nazy","1234");
        account = new Account(AccountTypes.CURRENT,
                new Customer("Tmann", "Nazy", 20, 12, 2000,
                        Gender.MALE, "t@tman.com", "1234", "12345678901"),
                "1234");
    }

    @Test
    void testThatAUserCanDepositMoney() {
        account.deposit(900);
        assertEquals(900, account.getBalance("1234"));
    }

    @Test
    void testThatAUserCantDepositNegativeValue() {
        account.deposit(900);
        try {
            account.deposit(-600);
        } catch (IllegalArgumentException err) {
            err.getMessage();
        }
        assertEquals(900, account.getBalance("1234"));
    }

    @Test
    void testThatUserGetResponseIfDepositIsNegative() {
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> account.deposit(-600));
        assertEquals("You can't deposit negative amount", err.getMessage());
    }

    @Test
    void testThatUserCanWithdraw() {
        account.deposit(2000);
        account.withdraw(1000, "1234");
        assertEquals(1000, account.getBalance("1234"));
    }

    @Test
    void testThatUserCantWithdrawMoreThanBalance() {
        account.deposit(2000);
        try {
            account.withdraw(3000, "1234");
        } catch (IllegalArgumentException err) {
            err.getMessage();
        }
        assertEquals(2000, account.getBalance("1234"));
    }

    @Test
    void testThatUserEnteredCorrectPinToGetBalance() {
        assertThrows(IllegalArgumentException.class,
                () -> account.getBalance("1233"));
    }

    @Test
    void testThatUserGetResponseIfWithdrawalAmountExceedBalance() {
        account.deposit(2000);
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(3000, "1234"));
        assertEquals("Amount exceeded balance", err.getMessage());
    }

    @Test
    void testThatUserPinIsCorrect() {
        account.deposit(2000);
        IllegalArgumentException err = assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(2000, "1204"));
        assertEquals("Incorrect pin", err.getMessage());
    }

    @Test
    void testThatDefaultAccountTypeIsSet() {
        assertEquals("CURRENT", account.getAccountType());
    }

    @Test
    void testThatUserCanMigrateToCurrentAccount() {
        account.migrateAccountType("cURRENt");
        assertEquals("CURRENT", account.getAccountType());
    }

    @Test
    void testThatAccountWithdrawalLimitIsNotExceeded() {
        account.deposit(1_000_000);
        try {
            account.withdraw(2_000_000, "1234");
        } catch (IllegalArgumentException err) {
            err.getMessage();
        }
        assertEquals(1_000_000, account.getBalance("1234"));
    }

}