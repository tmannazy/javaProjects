public class HeartRatesTest {
    public static void main(String... args) {
        HeartRates firstCustomer = new HeartRates("Patience", "Igwuruta",31,12,1991);

        System.out.printf("%s %s is %d years old by this year 2022. The max heart rate is %s beats per minute" +
                        " and target heart rate is %.1f%%",
                firstCustomer.getFirstName(),
                firstCustomer.getLastName(),
                firstCustomer.calculateAge(),
                firstCustomer.calculateHeartRate(),
                firstCustomer.targetHeartRate()
        );
    }
}
