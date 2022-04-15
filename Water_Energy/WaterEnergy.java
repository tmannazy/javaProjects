import java.util.Scanner;

/* A program that calculates energy to heat water from initial temp. to final temp.
   using the formula => energy = weight * (finalTemp - initTemp) * 4184 
*/


public class WaterEnergy {
	public static void main(String[] args) {
		float energy;
		float weightOfWater;
		float initTemp;
		float finalTemp;
		int CONSTANTNUM = 4184;
		Scanner userInput = new Scanner(System.in);
		
		String programInfo = "This program calculates energy needed to heat a water.\n";

		System.out.println(programInfo);
		
		System.out.print("Enter the amount of water in kilograms: ");
		weightOfWater = userInput.nextFloat();
		System.out.println("You entered " + weightOfWater + "kg.\n");
		
		System.out.print("Enter the initial temperature of water: ");
		initTemp = userInput.nextFloat();
		System.out.println("You entered " + initTemp + "\u00B0C\n");
		
		System.out.print("Enter the final temperature of water: ");
		finalTemp = userInput.nextFloat();
		System.out.println("You entered " + finalTemp + "\u00B0C\n");
		
		energy = weightOfWater * (finalTemp - initTemp) * (float) CONSTANTNUM;
		
		//System.out.println("The energy needed is " + energy);
		System.out.format("The energy needed is %.1fJ%n",  energy);
		
	}

}
