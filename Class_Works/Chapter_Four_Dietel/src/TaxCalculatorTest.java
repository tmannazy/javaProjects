import java.util.Scanner;

public class TaxCalculatorTest {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name, please: ");
        String name = scanner.next();
        System.out.format("%s kindly enter your annual income: ", name);
        int userInput = scanner.nextInt();
        TaxCalculator firstCitizen = new TaxCalculator(name, userInput);

        System.out.print("Next citizen, kindly enter first your name: ");
        name = scanner.next();
        System.out.format("%s kindly enter your annual income: ", name);
        userInput = scanner.nextInt();
        TaxCalculator secondCitizen= new TaxCalculator(name, userInput);

        System.out.print("Next citizen, kindly enter first your name: ");
        name = scanner.next();
        System.out.format("%s kindly enter your annual income: ", name);
        userInput = scanner.nextInt();
        TaxCalculator thirdCitizen = new TaxCalculator(name, userInput);

        System.out.format("%n%s your annual total tax is $%d.%n", firstCitizen.getName(), firstCitizen.calculateTax());
        System.out.format("%s your annual total tax is $%d.%n", secondCitizen.getName(), secondCitizen.calculateTax());
        System.out.format("%s your annual total tax is $%d.%n", thirdCitizen.getName(), thirdCitizen.calculateTax());
    }
}
