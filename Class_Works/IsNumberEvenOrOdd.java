import java.util.Scanner;

public class IsNumberEvenOrOdd {
	public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int storeUserInput = userInput.nextInt();
		
		if(storeUserInput % 2 == 0)
			System.out.printf("The number %d is an even number%n", storeUserInput);
		
		if(storeUserInput % 2 != 0)
			System.out.printf("The number %d is an odd number%n", storeUserInput);
	}
}
