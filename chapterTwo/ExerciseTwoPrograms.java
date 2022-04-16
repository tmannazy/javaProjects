import java.util.Scanner;

public class ExerciseTwoPrograms {
    Scanner userInput = new Scanner(System.in);
    int firstNumber;
    int secondNumber;

// 2.8a
    public void displayEnterAnInteger(){
        System.out.println("Question 2.8a");
        System.out.print("Enter an integer: \n\n");
    }

// b
//    int a, b, c;
//    a = b * c;

// c
// This program performs a sample payroll calculation.

// 2.14
public void displayAdjacentNumbers(){
        System.out.println("Question 2.14");
        System.out.println("1 2  3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print(" 3");
        System.out.print(" 4\n");
        System.out.printf("%s %s  %s %s%n%n","1","2","3","4");
}

// 2.15
    public void doSomeArithmeticWithUserInput(){
        System.out.println("Question 2.15");
        System.out.println("Please enter two whole numbers of your choice below");
        System.out.print("Enter first number: ");
        firstNumber = userInput.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = userInput.nextInt();
        int squareOfFirstNumber = firstNumber * firstNumber;
        int squareOfSecondNumber = secondNumber * secondNumber;
        System.out.printf("The square of your first number = %d%n",squareOfFirstNumber);
        System.out.printf("The square of your second number = %d%n",squareOfSecondNumber);
        System.out.printf("The sum of numbers when squared = %d%n", (squareOfFirstNumber + squareOfSecondNumber));
        System.out.printf("The difference of numbers when squared = %d%n%n",(squareOfFirstNumber - squareOfSecondNumber));
    }

//public void x%(){
//
//    }


    public static void main(String... args){
        ExerciseTwoPrograms supply = new ExerciseTwoPrograms();
        supply.displayEnterAnInteger();
        supply.displayAdjacentNumbers();
        supply.doSomeArithmeticWithUserInput();



    }
}