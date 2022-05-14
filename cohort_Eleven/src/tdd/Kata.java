package tdd;

public class Kata {
    public static boolean isPrime(int number) {
        return numberOfFactors(number) == 2;
    }

    public static int numberOfFactors(int number) {
        int counter = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) counter++;
        }
        return counter;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = 0;
        if (firstNumber < secondNumber) difference = secondNumber - firstNumber;
        if (firstNumber > secondNumber) difference = firstNumber - secondNumber;
        return difference;
    }

    public int divide(int firstNumber, int secondNumber) {
        int division = 0;
        if (secondNumber > 0) division = firstNumber / secondNumber;
        return division;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }


    public int testDriller(int numberOfCopiesNeeded) {
        int priceOfCopiesNeeded = 0;
        if (numberOfCopiesNeeded >= 1 && numberOfCopiesNeeded <= 4) priceOfCopiesNeeded = numberOfCopiesNeeded * 2000;
        if (numberOfCopiesNeeded >= 5 && numberOfCopiesNeeded <= 9) priceOfCopiesNeeded = numberOfCopiesNeeded * 1800;
        if (numberOfCopiesNeeded >= 10 && numberOfCopiesNeeded <= 29) priceOfCopiesNeeded = numberOfCopiesNeeded * 1600;
        if (numberOfCopiesNeeded >= 30 && numberOfCopiesNeeded <= 49) priceOfCopiesNeeded = numberOfCopiesNeeded * 1500;
        if (numberOfCopiesNeeded >= 50 && numberOfCopiesNeeded <= 99) priceOfCopiesNeeded = numberOfCopiesNeeded * 1300;
        if (numberOfCopiesNeeded >= 100 && numberOfCopiesNeeded <= 199)
            priceOfCopiesNeeded = numberOfCopiesNeeded * 1200;
        if (numberOfCopiesNeeded >= 200 && numberOfCopiesNeeded <= 499)
            priceOfCopiesNeeded = numberOfCopiesNeeded * 1100;
        if (numberOfCopiesNeeded >= 500) priceOfCopiesNeeded = numberOfCopiesNeeded * 1000;
        return priceOfCopiesNeeded;
    }

    public double costOfDriving(double dist, double price, double miles) {
        return Math.round((dist * price / miles) * 100.0) / 100.0;
    }

    public double futureInvestmentValue(double deposit, double interest, int years) {
        System.out.println("Enter investment amount: " + deposit);
        System.out.println("Enter annual interest rate in percentage: " + interest);
        double interestRate = interest / 100;
        System.out.println("Enter number of years: " + years);
        double accumulatedBalance = (Math.pow((1 + interestRate / 12), (double) years * 12) * deposit);
        System.out.printf("Accumulated value is $%.2f%n%n", accumulatedBalance);
        return Math.round(accumulatedBalance * 100.0) / 100.0;
    }

    public double calculateInterest(int balance, double percentage) {
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): " + balance + ' ' + percentage);
        double interest = balance * (percentage / 1200);
        System.out.printf("The interest is %.4f%n%n", interest);
        return Math.round(interest * 10000.0) / 10000.0;
    }

    public double areaOfATriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        System.out.println("Enter points of the triangle in coordinates (x1, y1), (x2, y2), (x3, y3)");
        System.out.print("Enter three points for the triangle: ");
        double AB = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double BC = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double AC = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double perimeter = (AB + BC + AC) / 2;
        double area = Math.sqrt(perimeter * (perimeter - AB) * (perimeter - BC) * (perimeter - AC));
        System.out.printf("The area of the triangle is %.1f%n%n", area);
        return Math.round(area * 10.0) / 10.0;
    }

    public double calculateUserBMI(double weight, double height) {
        double onePoundInKg = 0.45359237;
        double oneInchInMetres = 0.0254;
        System.out.println("Enter weight in pounds: " + weight);
        System.out.println("Enter height in inches: " + height);
        double convertPoundsToKg = weight * onePoundInKg;
        double convertInchesToMetres = height * oneInchInMetres;
        double BMI = convertPoundsToKg / (convertInchesToMetres * convertInchesToMetres);
        System.out.printf("Your BMI is %.4f%n%n", BMI);
        return Math.round(BMI * 10000.0) / 10000.0;
    }

    public double monthlySavingsCompoundValue(double deposit) {
        System.out.print("Enter the monthly saving amount: ");
        double ANNUALINTEREST = 0.05;
        double firstMonthBalance = (1 + ANNUALINTEREST / 12) * deposit;
        double inSixMonths = ((6 * firstMonthBalance) + (1 + ANNUALINTEREST / 12) * 6);
        System.out.printf("After the sixth month, the account value is $%.2f%n%n", inSixMonths);
        return Math.round(inSixMonths * 100.0) / 100.0;
    }


    public double conversionToFeet(double number) {
        double ONEFOOTINMETERS = 0.305;
        System.out.println("Enter a value for feet: " + number);
        double feetInMeters = number * ONEFOOTINMETERS;
        System.out.format("%.1f feet is %.4f meters%n", number, feetInMeters);
        return feetInMeters;
    }

    public double conversionToPounds(double numberToConvert) {
        double ONEPOUNDINKG = 0.454;
        System.out.println("Enter a number in pounds: " + numberToConvert);
        double poundInKg = numberToConvert * ONEPOUNDINKG;
        System.out.format("%.1f pounds is %.3f kilograms%n", numberToConvert, poundInKg);
        return poundInKg;
    }

    public double calculateYear(int minutes) {
        int numOfMinutesInAYear = 525600;
        int numOfMinutesInADay = 1440;
        int numOfDaysRemaining;
        int numOfYear = 0;
        System.out.println("Enter the number of minutes: " + minutes);
        if (minutes > numOfMinutesInAYear) {
            numOfYear = minutes / numOfMinutesInAYear;
            numOfDaysRemaining = minutes % numOfMinutesInAYear / numOfMinutesInADay;
            System.out.format("%d minutes is approximately %d year(s) and %d days%n", minutes, numOfYear, numOfDaysRemaining);
        } else if (minutes < numOfMinutesInAYear) {
            double numsOfDaysRemaining = minutes / (numOfMinutesInADay * 1.0);
            System.out.format("%d minutes is approximately %.1f days%n", minutes, numsOfDaysRemaining);
        } else {
            System.out.format("%d minutes is exactly 1 year%n", minutes);
        }
        return numOfYear;
    }

    public double waterEnergy(double waterWeight, double initTemp, double finalTemp) {
        int CONSTANTNUM = 4184;
        String programInfo = "This program calculates energy needed to heat a water.\n";
        System.out.println(programInfo);
        System.out.println("Enter the amount of water in kilograms: " + waterWeight);
        System.out.println("Enter the initial temperature of water: " + initTemp);
        System.out.println("Enter the final temperature of water: " + finalTemp);
        double energy = waterWeight * (finalTemp - initTemp) * (float) CONSTANTNUM;
        System.out.format("The energy needed is %.1fJ%n", energy);
        return Math.round(energy * 10.0) / 10.0;
    }

    public String checkScore(int userScore) {
        int storedNumber = 55;
        String report = null;
        System.out.println("Enter a score: " + userScore);
        if (userScore >= storedNumber) report = "PASS!";
        if (userScore < storedNumber) report = "FAIL!";
        return report;
    }

    public String checkScoreGrade(int score) {
        System.out.print("Enter a score: " + score);
        String grade = null;
        if (score >= 90 && score <= 100) grade = "A";
        if (score >= 80 && score < 90) grade = "B";
        if (score >= 70 && score < 80) grade = "C";
        if (score >= 60 && score < 70) grade = "D";
        if (score < 60) grade = "F";
        return grade;
    }

    public int flipNumber(int number) {
        System.out.print("Enter number 1 or 0: " + number);
        int numFlipped = 0;
        if (number == 1) numFlipped = 0;
        if (number == 0) numFlipped = 1;
        return numFlipped;
    }

    public String isNumberEvenOrOdd(int number) {
        String numStatusCheck = null;
        System.out.print("Enter a number: " + number);
        if (number % 2 == 0) numStatusCheck = "Even";
        if (number % 2 != 0) numStatusCheck = "Odd";
        return numStatusCheck;
    }

    public String mysteryNumber(int guessedNumber) {
        int mysteryNumber = 47;
        String guess = null;
        System.out.print("Guess my mystery number: " + guessedNumber);
        if (guessedNumber > mysteryNumber) guess = "Your guess is too high, try again!";
        if (guessedNumber < mysteryNumber) guess = "Your guess is too low, try again!";
        if (guessedNumber == mysteryNumber) guess = "Correct!!! Your guess is right!";
        return guess;
    }

    public int evenNumbersLoop() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) System.out.print(i + " ");
            i++;
        }
        return i;
    }
}
