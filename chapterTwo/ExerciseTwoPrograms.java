import java.util.Scanner;

public class ExerciseTwoPrograms {
    Scanner userInput = new Scanner(System.in);
    int firstNumber;
    int secondNumber;
    int thirdNumber;

    public void displayEnterAnInteger(){
        System.out.println("Question 2.8a");
        System.out.print("Enter an integer: \n\n");
    }

// b
//    int a, b, c;
//    a = b * c;

// c
// This program performs a sample payroll calculation.

public void displayAdjacentNumbers(){
        System.out.println("Question 2.14");
        System.out.println("1 2  3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print(" 3");
        System.out.print(" 4\n");
        System.out.printf("%s %s  %s %s%n%n","1","2","3","4");
}
    public void doSomeArithmeticWithUserInput(){
        System.out.println("Question 2.15");
        System.out.println("Please enter two whole numbers of your choice below");
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

    public void doSomeComparisonFromUserInputWithHundred(){
        System.out.println("Question 2.16");
        System.out.print("Please enter a whole number: ");
        firstNumber = userInput.nextInt();
        int squareOfFirstNumber = firstNumber * firstNumber;

        if(firstNumber > 100)
            System.out.printf("%d is greater than 100%n", firstNumber);
        if(squareOfFirstNumber > 100)
            System.out.printf("The square of %d (%d) is greater than 100%n", firstNumber, squareOfFirstNumber);
        if(firstNumber == 100)
            System.out.printf("%d is equal to 100%n", firstNumber);
        if(squareOfFirstNumber == 100)
            System.out.printf("The square of %d (%d) is equal to 100%n", firstNumber, squareOfFirstNumber);
        if(firstNumber != 100)
            System.out.printf("%d is not equal to 100%n", firstNumber);
        if(squareOfFirstNumber != 100)
            System.out.printf("The square of %d (%d) is not equal to 100%n", firstNumber, squareOfFirstNumber);
        if(firstNumber < 100)
            System.out.printf("%d is less than 100%n", firstNumber);
        if(squareOfFirstNumber < 100)
            System.out.printf("The square of %d (%d) is less than 100%n%n", firstNumber, squareOfFirstNumber);
    }

    public void findSumAverageProductSmallestAndLarget(){
        System.out.println("Question 2.17");
        System.out.println("Please enter two whole numbers of your choice below");
        firstNumber = userInput.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = userInput.nextInt();
        System.out.print("Enter third number: ");
        thirdNumber = userInput.nextInt();

//        if((firstNumber < secondNumber) < thirdNumber)
//            System.out.printf("The smallest number is %d", firstNumber);
            

        System.out.printf("The sum of the numbers is: %d%n", (firstNumber + secondNumber + thirdNumber));
        System.out.printf("The average of the numbers is: %d%n", ((firstNumber + secondNumber + thirdNumber) / 3));
        System.out.printf("The product of the numbers is: %d%n", (firstNumber * secondNumber * thirdNumber));
    }

    public void displayShapes(){
        System.out.println("Question 2.18");
        System.out.println("*********     ***       *        *    \n*       *   *     *    ***      * *   \n*       *  *       *  *****    *   *  ");
        System.out.println("*       *  *       *    *     *     * \n*       *  *       *    *    *       *\n*       *  *       *    *     *     * ");
        System.out.println("*       *  *       *    *      *   *  \n*       *   *     *     *       * *    \n*********     ***       *        *    \n");
    }

    public void isNumberDivisibleByThree(){
        System.out.println("Question 2.25");
        System.out.println("Enter a whole number: ");
        firstNumber = userInput.nextInt();
        if(firstNumber % 3 == 0)
            System.out.printf("The number %d is divisible by 3%n%n", firstNumber);
        else
            System.out.printf("The number %d is not divisible by 3%n%n", firstNumber);
    }


    public void isTripleOfFirstNumberDivisibleBySecondNumber(){
        System.out.println("Question 2.26");
        System.out.print("Enter the first whole number: ");
        firstNumber = userInput.nextInt();
        System.out.print("Enter the second whole number: ");
        secondNumber = userInput.nextInt();
        int tripleValueOfFirstNumber = firstNumber * firstNumber * firstNumber;
        int doubleValueOfSecondNumber = secondNumber * secondNumber;

        if(tripleValueOfFirstNumber % doubleValueOfSecondNumber == 0)
            System.out.printf("%d to power 3 is a multiple of %d power 2%n%n", firstNumber, secondNumber);
        else
            System.out.printf("%d to power 3 is not a multiple of %d to power 2%n%n", firstNumber, secondNumber);
    }

    public static void main(String... args){
        ExerciseTwoPrograms supply = new ExerciseTwoPrograms();
//        supply.displayEnterAnInteger();
//        supply.displayAdjacentNumbers();
//        supply.doSomeArithmeticWithUserInput();
//        supply.doSomeComparisonFromUserInputWithHundred();
//        supply.findSumAverageProductSmallestAndLarget();
//        supply.displayShapes();
//        supply.isNumberDivisibleByThree();
        supply.isTripleOfFirstNumberDivisibleBySecondNumber();



//

    }
}