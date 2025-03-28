package se.ktck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.process(); // kiểm tra thông tin đơn hàng
        order.process(); // đóng gói và vận chuyển
        order.process(); // state: đã giao

        System.out.println("-----Nếu khách hàng hủy đơn hàng-----");
        order.setOrderState(new CanceledOrderState());
        order.process();
    }
}