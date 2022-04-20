//import java.util.Scanner;

public class CarApplication {
    public static void main(String... args) {
        Car toyota = new Car("Camry", "2020", 2_000_000);
        Car mercedesBenz = new Car("G-Wagon", "2021", 10_000_000);

        System.out.printf("The price of my first car  goes for %.0f. E no easy%n",toyota.getPrice());
        System.out.printf("As tech come pay (thanks to Semicolon), my second car goes for %.0f. Tech bro life :-)%n",
                mercedesBenz.getPrice());

        System.out.println("But a discount for the car happened, the prices are I got it was below");
        toyota.calculateDiscount(5);
        mercedesBenz.calculateDiscount(7);
        System.out.printf("First car: $%.0f%n", toyota.getPrice());
        System.out.printf("Second car: $%.0f%n", mercedesBenz.getPrice());
    }
}
