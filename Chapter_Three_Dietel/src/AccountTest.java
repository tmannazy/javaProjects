import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		Account accountOne = new Account("Garden Eden", 50.00);
		Account accountTwo = new Account("Umu Obiligbo", -7.53);
		
		System.out.printf("%s's initial balance: $%.2f%n", accountOne.getName(), accountOne.getBalance());
		System.out.printf("%s's initial balance: $%.2f%n%n", accountTwo.getName(), accountTwo.getBalance());
			
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter deposit amount for accountOne: ");
		double depositAmount = userInput.nextDouble();
		System.out.printf("Adding %.2f to accountOne balance%n%n", depositAmount);
		accountOne.deposit(depositAmount);

		System.out.printf("%s balance: $%.2f %n",accountOne.getName(), accountOne.getBalance());
		System.out.printf("%s balance: $%.2f %n%n",accountTwo.getName(), accountTwo.getBalance());
		
		System.out.print("Enter deposit amount for accountTwo: ");
		depositAmount = userInput.nextDouble();
		System.out.printf("Adding %.2f to accountTwo balance%n%n",depositAmount);
		accountTwo.deposit(depositAmount);
		
		System.out.print("Enter amount to withdraw from accountOne: ");
		double withdrawAmountFromAccountOne = userInput.nextDouble();
		System.out.printf("%nSubtracting %.2f from accountOne balance%n", withdrawAmountFromAccountOne);
		accountOne.withdraw(withdrawAmountFromAccountOne);

		System.out.print("Enter amount to withdraw from accountTwo: ");
		double withdrawAmountFromAccountTwo = userInput.nextDouble();
		System.out.printf("%nSubtracting %.2f from accountTwo balance%n%n", withdrawAmountFromAccountTwo);
		accountTwo.withdraw(withdrawAmountFromAccountTwo);

		System.out.printf("%s's final balance: $%.2f%n",
		accountOne.getName(), accountOne.getBalance());
		System.out.printf("%s's final balance: $%.2f%n%n", accountTwo.getName() , accountTwo.getBalance());
	}		
}
