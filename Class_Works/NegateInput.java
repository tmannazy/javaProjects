import java.util.Scanner;

public class NegateInput {
	public static void main(String... args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter number 1 or 0: ");
		
		int storedInput = userInput.nextInt();
		
		if(storedInput == 1) 
			System.out.println(0);8o]
		
		if(storedInput == 0) 
			System.out.println(1);
					
	}		
}

