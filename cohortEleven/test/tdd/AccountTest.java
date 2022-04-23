package tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void accountCanBeCreatedTest() {
        Account nepaAccount = new Account();
        int balance = nepaAccount.getBalance();
        assertEquals(0, balance);
    }

    @Test
    public void depositMoneyTest() {
        Account boyoAccount = new Account();
        boyoAccount.deposit(1_500);
        assertEquals(1500, boyoAccount.getBalance());
    }

    @Test
    public void withdrawMoneyTest() {
        Account newAccount = new Account();
        newAccount.deposit(1000);
         newAccount.withdraw(500);
        assertEquals(500, newAccount.getBalance());
    }

    @Test
    public void withdrawingMoreThanActualBalanceTest() {
        Account newAccountTwo = new Account();
        newAccountTwo.deposit(1000);
        newAccountTwo.withdraw(3000);
        assertEquals(1000, newAccountTwo.getBalance());
    }

    @Test
    public void withdrawUselessAmountTest() {
        Account newAccountThree = new Account();
        newAccountThree.deposit(1000);
        newAccountThree.withdraw(-200);
        assertEquals(1000, newAccountThree.getBalance());
    }

    @Test
    public void withdrawFromEmptyBalanceTest() {
        Account newAccountFour = new Account();
        newAccountFour.withdraw(10_000);
        assertEquals(0, newAccountFour.getBalance());
    }

    @Test
    @DisplayName("Depositing negative amount won't have any effect on account balance")
    public void depositNegativeAmountTest() {
        Account somethingHooge = new Account();
        somethingHooge.deposit(-1000);
        assertEquals(0, somethingHooge.getBalance());
    }

}
