package se.ktck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Investor investor1 = new Investor("le phu");
        Investor investor2 = new Investor("mai van ");
        Investor investor3 = new Investor("tran be");

        Stock stock1  = new Stock("fbt", 2000.00);
        Stock stock2  = new Stock("viettel", 5000);

        stock1.registerObserver(investor1);
        stock1.registerObserver(investor2);

        System.out.println("---change stock 1 ---");
        stock1.setPrice(40000.00);
    }
}