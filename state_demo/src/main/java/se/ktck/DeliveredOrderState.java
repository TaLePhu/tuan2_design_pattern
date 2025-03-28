package se.ktck;

public class DeliveredOrderState implements OrderState {

    @Override
    public void process(Order order) {
        System.out.println("Cập nhật trạng thái đơn hàng là đã giao.");
    }
}
