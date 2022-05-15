package src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomMathQuestions {
    private static int solutionFromRandomQuestion;
    private static int wrongAnswers;
    private static int rightAnswers;

    private static int randomNumber(int number) {
        Random random = new Random();
        return random.nextInt(number);
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program test your calculation skills and display your result when completed");
        System.out.print("Enter the number of questions to answer: ");
        int userRangeOfQuestions = scanner.nextInt();
        int counter = 0;
        int[] results = new int[userRangeOfQuestions];

        while (counter != userRangeOfQuestions) {
            generateQuestions(1 + randomNumber(250), 1 + randomNumber(40), randomOperator());
            int userAnswer = scanner.nextInt();
            checkUserAnswer(userAnswer, solutionFromRandomQuestion);
            results[counter] = solutionFromRandomQuestion;
            counter++;
        }
        String arrayResult = Arrays.toString(results);
        displayResult(arrayResult);
    }

    private static void generateQuestions(int firstOperand, int secondOperand, char operator) {
        System.out.print(firstOperand + " " + operator + " " + secondOperand + " = ");
        int solution = 0;
        switch (operator) {
            case '+' -> solution = firstOperand + secondOperand;
            case '/' -> {
                if (secondOperand > 0) solution = firstOperand / secondOperand;
            }
            case '-' -> solution = firstOperand - secondOperand;
            case '*' -> solution = firstOperand * secondOperand;
            case '%' -> solution = firstOperand % secondOperand;
        }
        solutionFromRandomQuestion = solution;
    }

    private static char randomOperator() {
        int randomNum = 1 + randomNumber(5);
        char operator = '\u0000';
        switch (randomNum) {
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

    private static void displayResult(String arr) {
        int result = rightAnswers - wrongAnswers;
        System.out.format("Correct answers %d. Wrong answers %d. Your score is %d%n", rightAnswers, wrongAnswers, result);
        System.out.println("Here are the correct answers -> " + arr);
    }
}

