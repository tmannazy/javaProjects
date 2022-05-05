public class CreditLimitCalculator {
//    Question 4.18
    private int accountNumber;
    private int balance;
    private int totalOfCharges;
    private int totalOfCredits;
    private int creditLimit;
//    private int newBalance;


    public CreditLimitCalculator(int accountNumber, int balance, int totalOfCharges,
                                 int totalOfCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.totalOfCharges = totalOfCharges;
        this.totalOfCredits = totalOfCredits;
        this.creditLimit = creditLimit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int newBalance() {
        return balance + totalOfCharges - totalOfCredits;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setTotalOfCharges(int charges) {
        this.totalOfCharges = charges;
    }

    public int getTotalOfCharges() {
        return totalOfCharges;
    }

    public void setTotalOfCredits(int credits) {
        this.totalOfCredits = credits;
    }

    public int getTotalOfCredits() {
        return totalOfCredits;
    }

    public void setCreditLimit(int limit) {
        this.creditLimit = limit;
    }

    public String getCreditLimitInfo() {
        String message = null;
        if (newBalance() > creditLimit) message = "Credit limit exceeded";
        else message = "You've not exceeded your credit limit. Item available for purchase";
        return message;
    }
}
