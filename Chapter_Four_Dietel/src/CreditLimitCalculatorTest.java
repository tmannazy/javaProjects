public class CreditLimitCalculatorTest {
    public static void main(String... args) {
        CreditLimitCalculator customerOne = new CreditLimitCalculator(1020, 2000, 250,
                100, 5000);
        CreditLimitCalculator customerTwo = new CreditLimitCalculator(2070, 5000, 100,
                400, 1000);
//        System.out.println(customerOne.newBalance());
        System.out.println(customerOne.getCreditLimitInfo() + ", new balance is " + customerOne.newBalance());
        System.out.println(customerTwo.getCreditLimitInfo() + ", new balance is " + customerTwo.newBalance());


    }
}
