package finalmodifier;

public class TaxCalculator {

    public static final double VAT = 27;

    public double tax(double price) {
        return price * VAT / 100;
    }

    public double priceWithTax(double price) {
        return price * (1 + VAT / 100);
    }

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator();
        System.out.println("Az ÁFA: " + taxCalculator.tax(100000));
        System.out.println("A bruttó ár: " + taxCalculator.priceWithTax(100000));

    }
}
