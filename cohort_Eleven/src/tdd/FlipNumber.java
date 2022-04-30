package tdd;

import java.util.Scanner;

public class FlipNumber {
	public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter number 1 or 0: ");
		
		int userNumber = userInput.nextInt();
		
		if(userNumber == 1)
			System.out.println(0);
		
		if(userNumber == 0)
			System.out.println(1);
					
	}		
}

