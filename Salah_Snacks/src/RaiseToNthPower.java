import java.util.Scanner;

public class RaiseToNthPower {
    public static void main(String... args) {
        System.out.print("Enter the base number: ");
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        System.out.print("Enter the n-th power: ");
        int power = scanner.nextInt();
        int result = 1;
        int savedPower = power;

        while (power != 0) {
            result *= base;
            power--;
        }
        System.out.printf("The value to the power %d of %d is %d.",savedPower, base, result);
    }
}
