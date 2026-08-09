package cn.codepzj;

public class OrderMain {
    public static void main(String[] args) {
        OrderStatus orderStatus = OrderStatus.ORDER_INIT;
        System.out.println(orderStatus.getStatus());

        // 经过一些状态流转, status 变为 ORDER_PAIDSUCCESS
        orderStatus = OrderStatus.ORDER_PAIDSUCCESS;
        System.out.println(orderStatus.getStatus());
    }
}
