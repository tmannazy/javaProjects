public class Account {
	private String name;
	private String accounType;
	private float interestRate;
	
	public int withdrawCash(int amountToWithdraw) {
		return amountToWithdraw;	
	}
	
	public int depositCash(int amountToDeposit) {
		return amountToDeposit;
	}
	
	public String checkAccBalance() {
		return ("Your account balance is 'xyz' amount.");	
	} 
	
	public static void main(String[] args) {
		Account teeAcc = new Account();
		int withdrawAmt = teeAcc.withdrawCash(500);	
		int depAmt = teeAcc.depositCash(2000);
		
		System.out.println("Please take your cash $" + withdrawAmt);
		System.out.println("You deposited $" + depAmt + " into your account.");
		System.out.println(teeAcc.checkAccBalance());
	}
}

