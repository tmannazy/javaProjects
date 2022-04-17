import java.util.Scanner;

public class CalculationOfVariables {
    private static CalculationOfVariables camry;
    Scanner getUserInput = new Scanner(System.in);

    public void costOfDriving() {
        System.out.print("Enter the driving distance: ");
        float distance = getUserInput.nextFloat();
        System.out.print("Enter miles per gallon: ");
        float miles = getUserInput.nextFloat();
        System.out.print("Enter price per gallon: ");
        float price = getUserInput.nextFloat();
        float cost = distance *  price / miles;
        System.out.printf("The cost of driving is $%.2f%n", cost);
    }

    public void futureInvestmentValue() {

    }

    public void calculateInterest() {
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        int balance = getUserInput.nextInt();
        float interestRateInPercentage = getUserInput.nextFloat();
        double interest = balance * (interestRateInPercentage / 1200);
        System.out.printf("The interest is %.4f%n%n", interest);
    }

    public static void main(String... args) {
        CalculationOfVariables camry = new CalculationOfVariables();
//        camry.costOfDriving();
        camry.calculateInterest();
    }

}