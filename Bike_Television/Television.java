public class Television {
	private String name;
	private String model;
	private String size;
	private String display;
	private int weight;
	private int resolution;
	
	public boolean isOn(boolean onStatus) {
		// condition to check on statuts
	}
	
	public boolean isOff(boolean offStatus) {
		// condition to check off statuts
	}
	
	public void changeChannel() {
		// switch channels
	}
	
	public void reduceVolume() {
		// reduce tv volume
	}
	
	public void increaseVolume() {
		// increase tv volume
	}
	
	public int recordedScenes() {
		// number of screenrecord done
	}
	
	public void displayAMovie() {
		// display a movie
	}
	
	public static void main(String[] args) {
		Television sony = new Television();
		
		sony.isOff("yes");
		sony.isOn("no");
		sony.changeChannel();
		sony.reduceVolume();
		sony.increaseVolume();
		sony.recordedScenes();
		sony.displayAMovie();
	}
}
