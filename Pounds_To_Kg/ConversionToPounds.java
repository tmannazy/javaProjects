import java.util.Scanner;

// A program that converts pound to kg. 1 pound = 0.454 kg


public class ConversionToPounds {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float numToConvert;
		double ONEPOUNDINKG = 0.454;
		float poundInKg;
		
		
		System.out.print("Enter a number in pounds: ");	
		numToConvert = userInput.nextFloat();
		System.out.println("\nThe number entered is => " + numToConvert + "\n");
		
		poundInKg = numToConvert * (float) ONEPOUNDINKG;
		System.out.format("%.1f pounds is %.3f kilograms%n", numToConvert, poundInKg);	
	
	
	}

}
