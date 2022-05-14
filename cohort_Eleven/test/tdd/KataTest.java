package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataTest {
    @Test
    public void additionTest() {
        Kata calculator = new Kata();
        assertEquals(8, calculator.add(2, 6));
    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals(2, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(-2, -4);
        assertEquals(2, result);
    }

    @Test
    public void quotientTest() {
        Kata calculator = new Kata();
        int result = calculator.divide(10, 0);
        assertEquals(0, result);
        assertEquals(5, calculator.divide(11, 2));
    }

    @Test
    public void productTest() {
        Kata calculator = new Kata();
        int result = calculator.multiply(2, 2);
        assertEquals(4, result);
    }

    @Test
    public void testDrillerForCopiesBetweenOneAndFourTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(4);
        assertEquals(8_000, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenFiveAndNineTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(5);
        assertEquals(9_000, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenTenAndTwentyNineTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(17);
        assertEquals(27_200, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenThirtyAndFourtyNineTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(48);
        assertEquals(72_000, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenFiftyAndNinetyNineTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(89);
        assertEquals(1300 * 89, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenHundredAndHundredAndNinetyNineTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(180);
        assertEquals(216_000, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenTwoHundredAndFourHundredAndNinetyNineTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(499);
        assertEquals(548_900, priceOfCopies);
    }

    @Test
    public void testDrillerForCopiesBetweenFiveHundredAndAboveTest() {
        Kata utmeBook = new Kata();
        int priceOfCopies = utmeBook.testDriller(721);
        assertEquals(721_000, priceOfCopies);
    }

    @Test
    public void costOfDrivingTest() {
        Kata drivingCost = new Kata();
        double distance = 900.5;
        double miles = 25.5;
        double price = 3.55;
        assertEquals(125.36, drivingCost.costOfDriving(distance, price, miles));
    }

    @Test
    public void futureInvestmentValueTest() {
        Kata investment = new Kata();
        double deposit = 1000.56;
        double interest = 4.25;
        int years = 1;
        assertEquals(1043.92, investment.futureInvestmentValue(deposit, interest, years));
    }

    @Test
    public void calculateInterestTest() {
        Kata interest = new Kata();
        int balance = 1000;
        double percentageInterest = 3.5;
        assertEquals(2.9167, interest.calculateInterest(balance, percentageInterest));
    }

    @Test
    public void areaOfTriangleTest() {
        Kata triangle = new Kata();
        double x1 = 1.5;
        double y1 = -3.4;
        double x2 = 4.6;
        double y2 = 5;
        double x3 = 9.5;
        double y3 = -3.4;
        assertEquals(33.6, triangle.areaOfATriangle(x1, y1, x2, y2, x3, y3));
    }

    @Test
    public void calculateUserBMITest() {
        Kata bmi = new Kata();
        double weight = 95.5;
        double height = 50;
        assertEquals(26.8573, bmi.calculateUserBMI(weight, height));
    }

    @Test
    public void monthlySavingsCompoundValueTest() {
        Kata savings = new Kata();
        double deposit = 100;
        assertEquals(608.53, savings.monthlySavingsCompoundValue(deposit));
    }

    @Test
    public void convertFeetToMetersTest() {
        Kata convertToMeters = new Kata();
        double feet = 16.5;
//        year= 1000000000;
        assertEquals(5.0325, convertToMeters.conversionToFeet(feet));
    }

    @Test
    public void convertToPoundsTest() {
        Kata convertToPounds = new Kata();
        double numberToConvert = 55.5;
        assertEquals(25.197, convertToPounds.conversionToPounds(numberToConvert));
    }

    @Test
    public void calculateYearTest() {
        Kata getYear = new Kata();
        int minutes = 1_000_000_000;
        assertEquals(1902, getYear.calculateYear(minutes));
    }

    @Test
    public void waterEnergyTest() {
        Kata getWaterEnergy = new Kata();
        double waterWeight = 55.5;
        double initTemp = 3.5;
        double finalTemp = 10.5;
        assertEquals(1625484, getWaterEnergy.waterEnergy(waterWeight, initTemp, finalTemp));
    }

    @Test
    public void checkScoreForFailTest() {
        Kata newScore = new Kata();
        int score = 45;
        assertEquals("FAIL!", newScore.checkScore(score));
    }

    @Test
    public void checkScoreForPassTest() {
        Kata newScore = new Kata();
        int score = 85;
        assertEquals("PASS!", newScore.checkScore(score));
    }

    @Test
    public void checkScoreGradeBetween90And100Test() {
        Kata score = new Kata();
        int studentScore = 92;
        assertEquals("A", score.checkScoreGrade(studentScore));
    }

    @Test
    public void checkScoreGradeBetween80And90Test() {
        Kata score = new Kata();
        int studentScore = 89;
        assertEquals("B", score.checkScoreGrade(studentScore));
    }

    @Test
    public void checkScoreGradeBetween70And80Test() {
        Kata score = new Kata();
        int studentScore = 75;
        assertEquals("C", score.checkScoreGrade(studentScore));
    }

    @Test
    public void checkScoreGradeBetween60And70Test() {
        Kata score = new Kata();
        int studentScore = 66;
        assertEquals("D", score.checkScoreGrade(studentScore));
    }

    @Test
    public void checkScoreGradeBelow60Test() {
        Kata score = new Kata();
        int studentScore = 17;
        assertEquals("F", score.checkScoreGrade(studentScore));
    }

    @Test
    public void flipNumber1Test() {
        Kata flipper = new Kata();
        int number = 1;
        assertEquals(0, flipper.flipNumber(number));
    }

    @Test
    public void flipNumber0Test() {
        Kata flipper = new Kata();
        int number = 0;
        assertEquals(1, flipper.flipNumber(number));
    }

    @Test
    public void evenNumberTest() {
        Kata even = new Kata();
        int number = 8950;
        assertEquals("Even", even.isNumberEvenOrOdd(number));
    }

    @Test
    public void oddNumberTest() {
        Kata odd = new Kata();
        int number = 77;
        assertEquals("Odd", odd.isNumberEvenOrOdd(number));
    }

    @Test
    public void highMysteryNumberTest() {
        Kata guessNumber = new Kata();
        int number = 54;
        assertEquals("Your guess is too high, try again!", guessNumber.mysteryNumber(number));
    }

    @Test
    public void lowMysteryNumberTest() {
        Kata guessNumber = new Kata();
        int number = 24;
        assertEquals("Your guess is too low, try again!", guessNumber.mysteryNumber(number));
    }

    @Test
    public void correctMysteryNumberTest() {
        Kata guessNumber = new Kata();
        int number = 47;
        assertEquals("Correct!!! Your guess is right!", guessNumber.mysteryNumber(number));
    }


    @Test
    public void loopForEvenNumbersTest() {
        Kata getEvenNumbers = new Kata();
        assertEquals(21, getEvenNumbers.evenNumbersLoop());
    }

    @Test
    public void factorsOfNumbersTest() {
        Kata factors = new Kata();
        int number = 5;
        assertEquals(2, Kata.numberOfFactors(number));
    }

    @Test
    public void primeNumberTest() {
        boolean isPrime = Kata.isPrime(19);
        assertTrue(isPrime);
    }
}
