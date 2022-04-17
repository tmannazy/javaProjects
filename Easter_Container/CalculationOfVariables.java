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
        System.out.print("Enter investment amount: ");
        double depositedAmount = getUserInput.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = getUserInput.nextDouble() / 100;
        System.out.print("Enter number of years: ");
        double numOfYears = getUserInput.nextDouble();
        double accumulatedBalance = (Math.pow((1 + interestRate / 12), numOfYears * 12) * depositedAmount);
        System.out.printf("Accumulated value is $%.2f%n%n", accumulatedBalance);
    }

    public void calculateInterest() {
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        int balance = getUserInput.nextInt();
        float interestRateInPercentage = getUserInput.nextFloat();
        double interest = balance * (interestRateInPercentage / 1200);
        System.out.printf("The interest is %.4f%n%n", interest);
    }

    public void areaOfATriangle() {
        System.out.println("Enter points  of the triangle in coordinates (x1, y1), (x2, y2), (x3, y3)");
        System.out.print("Enter three points for the triangle: ");
        double x1 = getUserInput.nextDouble();
        double y1 = getUserInput.nextDouble();
        double x2 = getUserInput.nextDouble();
        double y2 = getUserInput.nextDouble();
        double x3 = getUserInput.nextDouble();
        double y3 = getUserInput.nextDouble();

        double AB = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double BC = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double AC = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double perimeter = (AB + BC + AC) / 2;
        double area = Math.sqrt(perimeter * (perimeter - AB) * (perimeter - BC) * (perimeter - AC));
        System.out.printf("The area of the triangle is %.1f%n%n", area);
    }

    public void calculateUserBMI() {
        double onePoundInKg = 0.45359237;
        double oneInchInMetres = 0.0254;
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = getUserInput.nextDouble();
        System.out.print("Enter height in inches: ");
        double heightInInches = getUserInput.nextDouble();

        double convertPoundsToKg = weightInPounds * onePoundInKg;
        double convertInchesToMetres = heightInInches * oneInchInMetres;
        double BMI = convertPoundsToKg / (convertInchesToMetres * convertInchesToMetres);
        System.out.printf("Your BMI is %.4f%n%n", BMI);
    }

        public void monthlySavingsCompoundValue() {
        System.out.print("Enter the monthly saving amount: ");
        double depositAmount = getUserInput.nextDouble();
        double ANNUALINTEREST = 0.05;
        double firstMonthBalance = (1 + ANNUALINTEREST / 12) * depositAmount;
        double inSixMonths = ((6 * firstMonthBalance) + (1 + ANNUALINTEREST / 12) * 6);
        System.out.printf("After the sixth month, the account value is $%.2f%n%n", inSixMonths);
    }

    public static void main(String... args) {
        CalculationOfVariables display = new CalculationOfVariables();
        display.costOfDriving();
        display.futureInvestmentValue();
        display.calculateInterest();
        display.areaOfATriangle();
        display.calculateUserBMI();
        display.monthlySavingsCompoundValue();
        display.calculateInv(1000.56, 4.25, 1);
    }
}