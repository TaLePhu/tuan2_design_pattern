package se.ktck;

public class VATTax implements TaxStrategy{
    // Thuế giá trị gia tăng (VAT) - 10%
    @Override
    public double calculateTax(double price) {
        return price * 0.1;
    }
}
