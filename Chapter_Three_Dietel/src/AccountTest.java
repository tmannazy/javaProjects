import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		
		
		System.out.printf("%s balance: $%.2f%n%n", account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance() );
			
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); 
		double depositAmount = input.nextDouble(); 
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);
		
		
				
		System.out.printf("%s balance: $ %.2f %n",
		account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $ %.2f %n%n",
		account2.getName(), account2.getBalance() );				
		
		
		System.out.print("Enter deposit amount for account2: "); 
		depositAmount = input.nextDouble(); 
		System.out.printf("%nadding %.2f to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount);
		
		
		System.out.print("Enter amount to withdraw from account2: "); 
		double withdrawAmountAccountTwo = input.nextDouble(); 
		System.out.printf("%nsubtracting %.2f from account2 balance%n%n", withdrawAmountAccountTwo);
		account2.withdraw(withdrawAmountAccountTwo);
		
		
		
		System.out.print("Enter amount to withdraw from account1: "); 
		double withdrawAmountAccountOne = input.nextDouble(); 
		System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawAmountAccountOne);
		account1.withdraw(withdrawAmountAccountOne);
				
		System.out.printf("%s final balance: $ %.2f %n",
		account1.getName(), account1.getBalance() );
		System.out.printf("%s balance: $ %.2f %n%n", account2.getName() , account2.getBalance() );			
	}		
}
