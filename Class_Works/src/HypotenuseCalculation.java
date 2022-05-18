package src;

public class HypotenuseCalculation {
    public static void main(String... args) {
        String info = """
                THIS PROGRAM CALCULATES
                THE HYPOTENUSE OF A RIGHT TRIANGLE
                """;
        System.out.println(info);
        System.out.println("The hypotenuse of the first triangle is " + hypotenuse(3.0, 4.0));
        System.out.println("The hypotenuse of the first triangle is " + hypotenuse(5.0, 12.0));
        System.out.println("The hypotenuse of the first triangle is " + hypotenuse(8.0, 15.0));
    }

    private static double hypotenuse(double sideOne, double sideTwo) {
        double squareOfSideOne = Math.pow(sideOne, 2);
        double squareOfSideTwo = Math.pow(sideTwo, 2);
        double sumOfSquaredSides = squareOfSideOne + squareOfSideTwo;
        return Math.sqrt(sumOfSquaredSides);
    }

}
