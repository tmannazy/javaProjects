import java.util.Scanner;

public class GasMileage {
//    Determine combined total miles per gallon for all trips

//    FIRST REFINEMENT
//    Initialize variables
//    Input miles driven and gallons used for each trip
//    Calculate and print totalForEachTrip miles per gallon for all trips
//
//    SECOND REFINEMENT
//    Initialize totalForEachTrip to zero
//    Initialize counter to zero
//    Prompt the user to enter the first mile driven
//    Input the first miles (possibly the sentinel)
//    Prompt the user to enter the gallons for the trip
//    Input the gallons
//    Display the calculation for each trip
//
//    While the user has not yet entered the sentinel
//          Divide the miles by gallons used for each trip
//          Add the result to the totalForEachTrip
//          Add one to the counter
//          Prompt the user to enter the next miles and gallons
//          Input the next miles by gallons
//
//    If the counter is not equal to zero
//          Set the average to the combinedTotal divided by the counter
//          Print the average
//    Else
//          Print "No miles or gallons entered"

    public static void main(String... args) {
//        Question 4.17
        Scanner getUserInput = new Scanner(System.in);
        int totalForEachTrip = 0;
        int combinedTotal = 0;
        int counter = 1;

        System.out.print("Enter miles driven for this trip: ");
        int miles = getUserInput.nextInt();
        System.out.print("Enter the gallons used for this trip: ");
        int gallons = getUserInput.nextInt();

        while (miles != -1) {
            totalForEachTrip = miles / gallons;
            combinedTotal += totalForEachTrip;
            System.out.format("The miles per gallon for this trip is %d%n", totalForEachTrip);
            System.out.print("Enter miles driven or -1 to quit: ");
            miles = getUserInput.nextInt();
            if (miles == -1) break;
            System.out.print("Enter number of gallons used: ");
            gallons = getUserInput.nextInt();
            counter++;
        }

        double average = (double) combinedTotal / counter;
        System.out.format("%nThe miles per gallon for %d trip(s) driven is %d.%n", counter, combinedTotal);
        System.out.format("Average miles per gallon for all trips is %.2f%n", average);
    }
}
