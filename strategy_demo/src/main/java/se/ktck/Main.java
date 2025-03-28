package se.ktck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("laptop hp", 19000, new VATTax()) ;
        laptop.print();
        System.out.println("----change TAx---------");
        laptop.setTaxStrategy(new LuxuryTax());
        laptop.print();
    }
}