//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Extremes {
//    public static void main(String... args) {
//            System.out.println("THIS PROGRAM WILL SUM THE MINIMUM AND MAXIMUM NUMBERS USER ENTERED AFTER 10x.");
//            Scanner scanner = new Scanner(System.in);
//            int counter = 2;
//            System.out.print("Enter 1st number: ");
//            int number = scanner.nextInt();
//            int largest = 0;
//            int smallest = 0;
//
//            while (counter <= 10) {
//                if (number > largest) {
//                    largest = firstLargest;
//                    firstLargest = number;
//                } else if (number > secondLargest)
//                    secondLargest = number;
//
//                System.out.printf("Enter %d%s number : ", counter, unit);
//                number = scanner.nextInt();
//                counter++;
//
//                if (counter == 11) {
//                    if (number > firstLargest) {
//                        secondLargest = firstLargest;
//                        firstLargest = number;
//                    } else if (number > secondLargest)
//                        secondLargest = number;
//                }
//            }
//
//            System.out.println("The first largest number found is " + firstLargest);
//            System.out.println("The second largest number found is " + secondLargest);
//        }
//    }
//
//
