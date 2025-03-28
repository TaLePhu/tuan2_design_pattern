package se.ktck;

public class Order {
    private OrderState orderState;

    public Order() {
        this.orderState = new NewOrderState();
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public void process() {
        orderState.process(this);
    }
}
