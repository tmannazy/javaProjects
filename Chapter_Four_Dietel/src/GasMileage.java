import java.util.Scanner;

public class GasMileage {
//    Determine combined total miles per gallon for all trips

//    FIRST REFINEMENT
//    Initialize variables
//    Input miles driven and gallons used for each trip
//    Calculate and print total miles per gallon for all trips
//
//    SECOND REFINEMENT
//    Initialize total to zero
//    Initialize counter to zero
//    Prompt the user to enter the first mile driven
//    Input the first miles (possibly the sentinel)
//    Prompt the user to enter the gallons for the trip
//    Input the gallons
//
//    While the user has not yet entered the sentinel
//          Multiply the miles by gallons used for each trip
//          Add the result to the total
//          Add one to the counter
//          Prompt the user to enter the next miles and gallons
//          Input the next miles by gallons
//
//    If the counter is not equal to zero
//          Set the average to the total divided by the counter
//          Print the average
//    Else
//          Print "No miles or gallons entered"

    public static void main(String... args) {
        Scanner getUserInput = new Scanner(System.in);
        int total = 0;
        int counter = 0;

        System.out.println("Enter miles driven or -1 to quit: ");
        int miles = getUserInput.nextInt();

        while (miles != -1) {
        System.out.println("Enter number of gallons used: ");
        int gallons = getUserInput.nextInt();
            int calcTrip = miles * gallons;
            total = calcTrip + total;
            counter++;
            System.out.println("Enter miles driven or -1 to quit: ");
            miles = getUserInput.nextInt();
            System.out.println("Enter number of gallons used: ");
            gallons = getUserInput.nextInt();
        }

        if (counter != 0) {
            double average = (double) total / counter;
            System.out.format("%nTotal of the combined trips %d by driver entered is %d%n", counter, total);
            System.out.format("Average is %.2f%n", average);
        } else {
            System.out.println("No miles or gallons entered");
        }
    }
}
