public class TaxCalculator {
    private final String name;
    private final int earning;

    public TaxCalculator(String name, int earning) {
        this.name = name;
        this.earning = earning;
    }

    public int calculateTax() {
        int taxRate = 0;
        if (this.earning <= 30_000) taxRate = (int) (this.earning - (this.earning * 0.15));
        else taxRate = (int) (this.earning - (this.earning * 0.2));
        return taxRate;
    }

    public String getName() {
        return name;
    }
}
