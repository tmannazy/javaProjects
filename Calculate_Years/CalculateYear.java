/* 
	number of minutes in a year (365) = 525600
	number of minutes in a day = 1440
*/

import java.util.Scanner;

public class CalculateYear {
	public static void main(String[] args) {
		int numEnteredByUser;		
		int numOfMinutesInAYear = 525600;
		int numOfMinutesInADay = 1440;
		Scanner userInput = new Scanner(System.in);
		
		
		System.out.print("Enter the number of minutes: ");
		numEnteredByUser = userInput.nextInt();
		
		if (numEnteredByUser > numOfMinutesInAYear) {
			int numOfYear = numEnteredByUser / numOfMinutesInAYear;
			int whenMinutesIsGreater = numEnteredByUser / numOfMinutesInAYear;			
			numOfDaysRemaining = (numEnteredByUser % numOfMinutesInAYear) / numOfMinutesInADay;
			System.out.format("%d minutes is approximately %d year(s) and %d days%n", numEnteredByUser, numOfYear, numOfDaysRemaining);
		} 
		else if (numEnteredByUser < numOfMinutesInAYear) {			
			double numsOfDaysRemaining = numEnteredByUser / (numOfMinutesInADay * 1.0);
			System.out.format("%d minutes is approximately %.1f days%n", numEnteredByUser, numsOfDaysRemaining);
		}		
		else if(numEnteredByUser == numOfMinutesInAYear) {
			System.out.format("%d minutes is exactly 1 year%n", numEnteredByUser);
		}
		
		
	}
}

   

