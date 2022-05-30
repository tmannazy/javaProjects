import java.util.Scanner;

public class Calculator{		

	public static void main (String... args){
		Scanner userInput = new Scanner(System.in);
		int firstOperand;
		int secondOperand;
		int totalSum;
		int outputSubtract;
		int multiplication;
		int division;
		
		System.out.println("This program does basic calculation with two numbers.\n");
		
		System.out.print("Enter the first number: ");
		firstOperand = userInput.nextInt();	
		System.out.printf("Your first number is %d%n", firstOperand);
	
		System.out.print("\nEnter the second number: ");
		secondOperand = userInput.nextInt();
		System.out.printf("Your second number is %d%n", secondOperand);
		
		totalSum = firstOperand + secondOperand;
		System.out.printf("%nThe sum is %d%n", totalSum);
		
		outputSubtract = firstOperand - secondOperand;
		System.out.printf("The difference is %d%n", outputSubtract);	
		
		multiplication = firstOperand * secondOperand;
		System.out.printf("The multiplication is %d%n", multiplication);	
		
		division = firstOperand / secondOperand;
		System.out.printf("The division is %d%n", division);
	}	
}
