public class HeartRatesTest {
    public static void main(String... args) {
        HeartRates firstCustomer = new HeartRates("Patience", "Igwuruta",31,12,1991);

        System.out.printf("%s %s is %d years old by this year 2022",firstCustomer.getFirstName(), firstCustomer.getLastName(), firstCustomer.calculateAge());
    }
}
