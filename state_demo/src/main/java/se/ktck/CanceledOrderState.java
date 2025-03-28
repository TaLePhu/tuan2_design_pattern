package se.ktck;

public class CanceledOrderState implements OrderState{

    @Override
    public void process(Order order) {
        System.out.println("Hủy đơn hàng và hoàn tiền");
    }
}
