import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Account accountOne = new Account("Garden Eden", 50.00);
		Account accountTwo = new Account("Umu Obiligbo", -7.53);
		
		displayAccount(accountOne);
		displayAccount(accountTwo);

		Scanner userInput = new Scanner(System.in);
		System.out.print("\nEnter deposit amount for accountOne: ");
		double depositAmount = userInput.nextDouble();
		depositIntoUserAccount(accountOne, depositAmount);

		System.out.print("Enter deposit amount for accountTwo: ");
		depositAmount = userInput.nextDouble();
		depositIntoUserAccount(accountTwo, depositAmount);
		
		System.out.print("Enter amount to withdraw from accountOne: ");
		double withdrawAmount = userInput.nextDouble();
		userWithdrawal(accountOne, withdrawAmount);

		System.out.print("Enter amount to withdraw from accountTwo: ");
		withdrawAmount = userInput.nextDouble();
		userWithdrawal(accountTwo, withdrawAmount);

		displayFinalAccount(accountOne);
		displayFinalAccount(accountTwo);
	}

	public static void displayAccount(Account accountToDisplay) {
		System.out.printf("%s's initial balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}

	public static void displayFinalAccount(Account accountToDisplay) {
		System.out.printf("%s's final balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}

	public static void depositIntoUserAccount(Account accountToDeposit, double depositAmount) {
		System.out.printf("Adding %.2f to accountOne balance%n%n", depositAmount);
		accountToDeposit.deposit(depositAmount);
	}

	public static void userWithdrawal(Account accountToWithdraw, double amountToWithdraw) {
		System.out.printf("Subtracting %.2f from accountTwo balance%n%n", amountToWithdraw);
		accountToWithdraw.withdraw(amountToWithdraw);
	}
}
