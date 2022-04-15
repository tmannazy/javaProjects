public class Bike {
	private String name;
	private int speedLevel;
	private int length;
	private int gears;
	private String color;
	private String model;
	private int tyre;
	private int petrolTankCapacity;
	
	public void ride() {
		// start the bike 
	}
	
	public void brake() {
		// step on brake
	}
	
	public void changeGear() {
		// change the gear
	}
	
	public void honk() {
		// blair the honk
	}
	
	public int amountOfPetrolLeft() {
		// fuel meter
	}
	
	public void turnHeadLamp() {
		// turn on the lights
	}
	
	public static void main(String[] args) {
		Bike gokada = new Bike();
		
		gokada.brake();
		gokada.ride();
		gokada.amountOfPetrolLeft();
		gokada.changeGear();
		gokada.honk();
		gokada.turnHeadLamp();
	}
}
