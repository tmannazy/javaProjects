package tdd;

import java.util.Scanner;

public class IsNumberEvenOrOdd {
	public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = userInput.nextInt();
		
		if(number % 2 == 0)
			System.out.printf("The number %d is an even number%n", number);
		
		if(number % 2 != 0)
			System.out.printf("The number %d is an odd number%n", number);
	}
}
