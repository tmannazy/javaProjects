import java.util.Scanner;

// A program that converts feet to meters. 1 foot = 0.305 meters


public class ConversionToFeet {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float numToConvert;
		double ONEFOOTINMETERS = 0.305;
		float feetInMeters;
		
		
		System.out.print("Enter a value for feet: ");	
		numToConvert = userInput.nextFloat();
		System.out.println("\nThe number entered is => " + numToConvert + "\n");
		
		feetInMeters = numToConvert * (float) ONEFOOTINMETERS;
		System.out.format("%.1f feet is %.4f meters%n", numToConvert, feetInMeters);	
	
	
	}

}
