import java.util.Scanner;

public class ExerciseTwoPrograms {
    Scanner userInput = new Scanner(System.in);
    int firstNumber;
    int secondNumber;
    int thirdNumber;
    int fourthNumber;
    int fifthNumber;

    public void displayEnterAnInteger() {
        System.out.println("Question 2.8a");
        System.out.print("Enter an integer: \n\n");
    }

// 2.8b
//    int a, b, c;
//    a = b * c;

// 2.8c
// This program performs a sample payroll calculation.

public void displayAdjacentNumbers() {
        System.out.println("Question 2.14");
        System.out.println("1 2  3 4");
        System.out.print("1 ");
        System.out.print("2 ");
        System.out.print(" 3");
        System.out.print(" 4\n");
        System.out.printf("%s %s  %s %s%n%n","1","2","3","4");
}
    public void doSomeArithmeticWithUserInput() {
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

    public void doSomeComparisonFromUserInputWithHundred() {
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

    public void findSumAverageProductSmallestAndLarget() {
        System.out.println("Question 2.17");
        System.out.println("Please enter three whole numbers of your choice below");
        System.out.print("Enter first number: ");
        firstNumber = userInput.nextInt();
        System.out.print("Enter second number: ");
        secondNumber = userInput.nextInt();
        System.out.print("Enter third number: ");
        thirdNumber = userInput.nextInt();


        System.out.printf("The sum of the numbers is: %d%n", (firstNumber + secondNumber + thirdNumber));
        System.out.printf("The average of the numbers is: %d%n", ((firstNumber + secondNumber + thirdNumber) / 3));
        System.out.printf("The product of the numbers is: %d%n", (firstNumber * secondNumber * thirdNumber));
//        if(secondNumber > firstNumber)
//            firstNumber = secondNumber;
//        if(thirdNumber > firstNumber) {
//            firstNumber = thirdNumber;
//            System.out.printf("The largest number is: %d%n%n", firstNumber);
//        }

        System.out.printf("The smallest number is: %d%n", Math.min(firstNumber,Math.min(secondNumber, thirdNumber)));
        System.out.printf("The largest number is: %d%n%n", Math.max(firstNumber,Math.max(secondNumber, thirdNumber)));
    }

    public void displayShapes() {
        System.out.println("Question 2.18");
        System.out.println("*********     ***       *        *    \n*       *   *     *    ***      * *   \n*       *  *       *  *****    *   *  ");
        System.out.println("*       *  *       *    *     *     * \n*       *  *       *    *    *       *\n*       *  *       *    *     *     * ");
        System.out.println("*       *  *       *    *      *   *  \n*       *   *     *     *       * *    \n*********     ***       *        *    \n");
    }

    public void findSmallestAndLargestInIntegerOfFive() {
        System.out.println("Question 2.24");
    }

    public void isNumberDivisibleByThree() {
        System.out.println("Question 2.25");
        System.out.println("Enter a whole number: ");
        firstNumber = userInput.nextInt();
        if(firstNumber % 3 == 0)
            System.out.printf("The number %d is divisible by 3%n%n", firstNumber);
        else
            System.out.printf("The number %d is not divisible by 3%n%n", firstNumber);
    }


    public void isTripleOfFirstNumberDivisibleBySecondNumber() {
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

    public void displayCheckerBoard() {
        System.out.println("Question 2.27");
        System.out.println("* * * * * * * * \n * * * * * * * *\n* * * * * * * * \n * * * * * * * *");
        System.out.println("* * * * * * * * \n * * * * * * * *\n* * * * * * * * \n * * * * * * * *\n\n");
    }

    public void circleTheoremCalculation() {
        System.out.println("Question 2.28");
        System.out.print("Enter the radius of the circle: ");
        int radius = userInput.nextInt();
        double PI = Math.PI;

//        int diameter = 2 * radius;
//        double circumference = 2 * PI * radius;
//        double area = PI * (radius * radius);
        System.out.printf("The diameter of the circle is %d%nThe circumference is %.2f%nThe area of the circle is %.2f%n%n", (2 * radius), (2 * PI * radius), (PI * (radius * radius)));
    }


    public void getIntValueOfChar() {
        System.out.println("Question 2.29");
        System.out.printf("Integer value of the following characters %c, %c, %c are %d, %d, %d%n", 'A', 'B', 'C',((int) 'A'), ((int) 'B'), ((int) 'C'));
        System.out.printf("Integer value of the following characters %c, %c, %c are %d, %d, %d%n", 'a', 'b', 'c',((int) 'a'), ((int) 'b'), ((int) 'c'));
        System.out.printf("Integer value of the following characters %c, %c, %c are %d, %d, %d%n", '0', '1', '2',((int) '0'), ((int) '1'), ((int) '2'));
        System.out.printf("Integer value of the following characters %c, %c, %c, %c are %d, %d, %d %d%n%n", '*', '+', '/',' ', ((int) '*'), ((int) '+'), ((int) '/'), ((int) ' '));
    }

    public void separateDigitsFromUser() {
        System.out.println("Question 2.30");
        System.out.print("Enter a whole number:");
        firstNumber = userInput.nextInt();
        recursion(firstNumber);
    }

    private void recursion(int receivedNumber) {
        if(receivedNumber > 0) {
            recursion(receivedNumber/10);
            System.out.printf("%d   ", (receivedNumber%10));
        }
    }

    public void displayTableOfSquaresAndCubes () {
        System.out.println("Question 2.31");
        int numberToCalculate;

        System.out.println("number" + "\t" + "square" + "\t" + "cube");
        numberToCalculate = 0;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 1;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 2;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 3;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 4;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 5;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 6;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 7;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 8;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 9;
        System.out.printf("%d\t%d\t%d%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);

        numberToCalculate = 10;
        System.out.printf("%d\t%d\t%d%n%n", numberToCalculate, numberToCalculate * numberToCalculate, numberToCalculate * numberToCalculate * numberToCalculate);
    }


    public void getNegativePositiveAndZero() {
        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeroNumber = 0;

        System.out.print("Enter your first number: ");
        firstNumber = userInput.nextInt();

        System.out.print("Enter your second number: ");
        secondNumber = userInput.nextInt();

        System.out.print("Enter your third number: ");
        thirdNumber = userInput.nextInt();

        System.out.print("Enter your fourth number: ");
        fourthNumber= userInput.nextInt();

        System.out.print("Enter your fifth number: ");
        fifthNumber = userInput.nextInt();

        if (firstNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (secondNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (thirdNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (fourthNumber > 0)
            positiveNumber = positiveNumber + 1;
        if (fifthNumber > 0)
            positiveNumber = positiveNumber + 1;


        if (firstNumber < 0)
            negativeNumber = negativeNumber + 1;
        if (secondNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (thirdNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (fourthNumber > 0)
            negativeNumber = negativeNumber + 1;
        if (fifthNumber > 0)
            negativeNumber = negativeNumber + 1;


        if (firstNumber == 0)
            zeroNumber = zeroNumber + 1;
        if (secondNumber == 0)
            zeroNumber = zeroNumber + 1;
        if (thirdNumber == 0)
            zeroNumber = zeroNumber + 1;
        if (fourthNumber == 0)
            zeroNumber = zeroNumber + 1;
        if (fifthNumber == 0)
            zeroNumber = zeroNumber + 1;

        System.out.println ("\n");
        System.out.printf("Positive numbers = %d\n", positiveNumber);
        System.out.printf("Negative numbers = %d%n", negativeNumber);
        System.out.printf("Zero numbers = %d%n", zeroNumber);
    }


      public static void main(String... args) {
        ExerciseTwoPrograms supply = new ExerciseTwoPrograms();
//        supply.displayEnterAnInteger();
//        supply.displayAdjacentNumbers();
//        supply.doSomeArithmeticWithUserInput();
//        supply.doSomeComparisonFromUserInputWithHundred();
//        supply.findSumAverageProductSmallestAndLarget();
//        supply.displayShapes();
//        supply.isNumberDivisibleByThree();
//        supply.isTripleOfFirstNumberDivisibleBySecondNumber();
//        supply.displayCheckerBoard();
//        supply.circleTheoremCalculation();
//        supply.getIntValueOfChar();
//        supply.separateDigitsFromUser();
//        supply.displayTableOfSquaresAndCubes();
          supply.getNegativePositiveAndZero();






    }
}