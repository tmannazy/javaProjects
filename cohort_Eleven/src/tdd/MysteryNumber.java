package tdd;

import java.util.Scanner;

public class MysteryNumber {
	public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);
		int mysteryNumber = 47;
		System.out.print("Guess my mystery number: ");
		int guessedNumber = userInput.nextInt();
		
		if(guessedNumber > mysteryNumber)
			System.out.println("Your guess is too high, try again!");
		
		if(guessedNumber < mysteryNumber)
			System.out.println("Your guess is too low, try again!");
			
		if(guessedNumber == mysteryNumber)
			System.out.println("Correct!!! You guessed is right!");		
	}
}
