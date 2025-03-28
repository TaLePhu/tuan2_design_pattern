package se.ktck;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }


    @Override
    public void update(String stockName, double price) {
        System.out.println("nha dau tu: " + name + " nhan thong bao : gia co phieu: " + stockName + " mới " + price);
    }
}
