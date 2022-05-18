package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SupplyCorrectAnswers {
    private static int solutionFromRandomQuestion;
    private static int wrongAnswers;
    private static int rightAnswers;

    private static int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program only end when you answer the correct number of questions entered");
        System.out.print("Enter the number of questions to answer:->) ");
        int userRangeOfQuestions = scanner.nextInt();
        int[] results = new int[userRangeOfQuestions];
        int counter = 0;

        while (rightAnswers != userRangeOfQuestions) {
            calculateQuestions(1 + randomNumber(250), 1 + randomNumber(40), randomOperator());
            int userAnswer = scanner.nextInt();
            checkUserAnswer(userAnswer, solutionFromRandomQuestion);
            if (userAnswer == solutionFromRandomQuestion) {
                results[counter] = solutionFromRandomQuestion;
                counter++;
            }
        }
        System.out.format("Correct answer(s) %d. Wrong answer(s) %d.%n", rightAnswers, wrongAnswers);
        System.out.println("Here is/are the correct answer(s) -> " + Arrays.toString(results));
    }

    private static void calculateQuestions(int firstOperand, int secondOperand, char operator) {
        System.out.format("%d %s %d = ", firstOperand, operator, secondOperand);
        int solutionFromCalculation = 0;
        switch (operator) {
            case '+' -> solutionFromCalculation = firstOperand + secondOperand;
            case '-' -> solutionFromCalculation = firstOperand - secondOperand;
            case '/' -> {
                if (secondOperand > 0) solutionFromCalculation = firstOperand / secondOperand;
            }
            case '*' -> solutionFromCalculation = firstOperand * secondOperand;
            case '%' -> solutionFromCalculation = firstOperand % secondOperand;
        }
        solutionFromRandomQuestion = solutionFromCalculation;
    }

    private static char randomOperator() {
        int randomNumber = 1 + randomNumber(5);
        char operator = '\u0000';
        switch (randomNumber) {
            case 1 -> operator = '*';
            case 2 -> operator = '+';
            case 3 -> operator = '-';
            case 4 -> operator = '/';
            case 5 -> operator = '%';
        }
        return operator;
    }

    private static void checkUserAnswer(int userAnswer, int solutionFromRandomQuestion) {
        if (userAnswer == solutionFromRandomQuestion) rightAnswers++;
        else wrongAnswers++;
    }
}
