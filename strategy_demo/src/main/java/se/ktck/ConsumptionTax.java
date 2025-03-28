package se.ktck;

public class ConsumptionTax implements TaxStrategy{
    // Thuế tiêu thụ - 5%
    @Override
    public double calculateTax(double price) {
        return price * 0.05;
    }
}
