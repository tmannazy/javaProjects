public class Television {
	private String name;
	private short size;
	private String model;
	private String color;
	
	public boolean isHungOnWall() {
	// check condition
	// Not running because of type boolean.
	}
	
	public boolean isOn(boolean powerConditionOfTV){
	// check condition
	// Not running because of type boolean.
	}
	
	public boolean reduceVolume() {	
	// check condition
	// Not running because of type boolean.
	}
	
	public boolean increaseVolume() {
	// check condition
	// Not running because of type boolean.
	}

	public static void main(String[] args){
		Television sony = new Television();
		
		sony.isOn("yes");
		sony.isHungOnWall();
		sony.reduceVolume();
		sony.increaseVolume();
	}
}



