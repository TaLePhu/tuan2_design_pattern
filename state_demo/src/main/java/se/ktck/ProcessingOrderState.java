package se.ktck;

public class ProcessingOrderState implements OrderState{

    @Override
    public void process(Order order) {
        System.out.println("dong goi va van chuyen");
        order.setOrderState(new DeliveredOrderState()); // Chuyển sang trạng thái "Đã giao"
    }
}
