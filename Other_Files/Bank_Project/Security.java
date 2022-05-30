public class Security {
	private String name;
	private String gender;
	private int age;
		
	public boolean isGateOpen() {
	    // Not running because of type boolean.
		System.out.println("Gate is opened.");
	}
	
	public void checkIncomingCustomer() {
		System.out.println("Customer check OK!");
	}
	
	public boolean isQueueInOrder() {
	    // Not running because of type boolean.
		System.out.println("Yes!");		
	}
	
	public static void main(String[] args){
		Security okon = new Security();
						
		okon.isGateOpen();
		okon.isQueueInOrder();				
		okon.checkIncomingCustomer();
	}
}
	
