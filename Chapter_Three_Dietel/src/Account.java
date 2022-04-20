public class Account {
	private String name;
	private double balance;
	
	public Account(String name, double balance) {
		this.name = name;
		if (balance > 0.0) {
		this.balance = balance;
		}
	}
	
	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance = balance + depositAmount;
		}
	}
	
	public void withdraw(double withdrawAmount) {
		if (withdrawAmount > balance) {
		System.out.printf("%s the withdrawal amount you entered exceed your balance.%n%n", name);
		}
		if (withdrawAmount < balance) {
			balance = balance - withdrawAmount;
		}
		if (withdrawAmount == balance){
			balance = 0;
		}
	}

	public double getBalance() {
		return balance;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
}
	

	
	
	
	
			
