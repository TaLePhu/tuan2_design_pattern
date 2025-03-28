package se.ktck;

public class NewOrderState implements OrderState {

    @Override
    public void process(Order order) {
        System.out.println("kiem tra thong tin don hang...");
        order.setOrderState(new ProcessingOrderState());// chuyen sang state "dang xu ly"
    }
}
